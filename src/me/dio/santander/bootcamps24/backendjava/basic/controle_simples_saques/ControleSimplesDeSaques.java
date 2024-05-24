package me.dio.santander.bootcamps24.backendjava.basic.controle_simples_saques;

import java.io.*;

public class ControleSimplesDeSaques {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double limiteDiario = Double.parseDouble(br.readLine());
        for (double saque = 0; saque < limiteDiario; saque++) {

            saque = Double.parseDouble(br.readLine());
            if (saque == 0)
                break;
            else if (saque <= limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
            } else
                System.out.print("Limite diario de saque atingido. ");
        }

        System.out.println("Transacoes encerradas.");
        br.close();
    }
}