package me.alura.bytebank;

public class Gerente extends Funcionario {

    private int senha;

    public boolean autentica(int senha) {
        if (this.senha == senha)
            return true;
        else
            return false;
    }

    public double getBonificacao() {
        return this.getSalario();
    }
}
