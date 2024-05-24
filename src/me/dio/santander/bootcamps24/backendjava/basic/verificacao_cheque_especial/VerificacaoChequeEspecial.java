package me.dio.santander.bootcamps24.backendjava.basic.verificacao_cheque_especial;

import java.io.*;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double saldo = Double.parseDouble(br.readLine());
        double saque = Double.parseDouble(br.readLine());
        double limiteChequeEspecial = 500;

        if (saque <= saldo && saque <= limiteChequeEspecial)
            System.out.println("Transacao realizada com sucesso.");
        else if (saque <= (saldo+limiteChequeEspecial))
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        else
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");

        br.close();
    }
}
