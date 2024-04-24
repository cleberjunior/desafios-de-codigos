package br.com.dio.dio.santander2024;

import java.io.*;

public class VerificadorNumeroConta {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String numeroConta = br.readLine();

            verificarNumeroConta(numeroConta);

            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            br.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (!(numeroConta.length() == 8)) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
