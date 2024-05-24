package me.dio.santander.bootcamps24.backendjava.basic.verificador_elegibilidade_conta;

import java.io.*;
public class VerificadorElegibilidadeConta {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((Integer.parseInt(br.readLine()) >= 18) ? "Voce esta elegivel para criar uma conta bancaria."
                : "Voce nao esta elegivel para criar uma conta bancaria.");
        br.close();
    }
}
