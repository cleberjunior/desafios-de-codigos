package me.alura.bytebank;

public class Conta {

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("total de contas " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getCliente() {
        return titular;
    }

    public void setCliente(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public void consultaSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }
}