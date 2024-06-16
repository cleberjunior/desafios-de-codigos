package me.dio.santander.bootcamps24.backendjava.intermediate.registro_transacoes_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double saldo = Double.parseDouble(br.readLine());
        int quantidadeTransacoes = Integer.parseInt(br.readLine());

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {

            char tipoTransacao = br.readLine().charAt(0);
            double valorTransacao = Double.parseDouble(br.readLine());

            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);

            if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
                saldo += valorTransacao;
                transacoes.add(transacao);
            } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
                saldo -= valorTransacao;
                transacoes.add(transacao);
            }
        }

        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        br.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
