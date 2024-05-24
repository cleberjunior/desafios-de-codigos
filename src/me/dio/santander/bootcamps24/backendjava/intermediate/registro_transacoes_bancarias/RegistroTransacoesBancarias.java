package me.dio.santander.bootcamps24.backendjava.intermediate.registro_transacoes_bancarias;

import java.io.*;
import java.util.*;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double saldo = Double.parseDouble(br.readLine());
        int quantidadeTransacoes = Integer.parseInt(br.readLine());

        List<String> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = br.readLine().toUpperCase().charAt(0);
            double valorTransacao = Double.parseDouble(br.readLine());

            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");

        for (int j = 0; j < transacoes.size(); j++) {
            System.out.println((j+1) + ". " + transacoes.get(j));
        }

        br.close();
    }
}
