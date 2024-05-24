package me.dio.santander.bootcamps24.backendjava.basic.simulacao_bancaria;

import java.io.*;
import java.util.List;

public class SimulacaoBancaria {
    static double saldo = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean continuar = true;
        while (continuar) {

            int opcao = Integer.parseInt(br.readLine());
            switch (opcao) {
                case 0:
                    continuar = false;
                    System.out.println("Programa encerrado.");
                    break;
                case 1:
                    depositar(br);
                    consultarSaldo();
                    break;
                case 2:
                    sacar(br);
                    consultarSaldo();
                    break;
                case 3:
                    consultarSaldo();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        br.close();
    }

    public static void depositar(BufferedReader br) throws IOException {
        double valor = Double.parseDouble(br.readLine());
        saldo += valor;
    }

    public static void sacar(BufferedReader br) throws IOException {
        double valor = Double.parseDouble(br.readLine());
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public static void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
