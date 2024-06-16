package me.plataformas.hackerhank.PrepareByTopics.Java.Introdution;

import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double payment = Double.parseDouble(br.readLine());

        // Write your code here.
        System.out.println("US: " + converterValorMoeda(payment, "en", "US"));
        System.out.println("India: " + converterValorMoeda(payment, "en", "IN"));
        System.out.println("China: " + converterValorMoeda(payment, "zh", "CN"));
        System.out.println("France: " + converterValorMoeda(payment, "fr", "FR"));

        br.close();
    }

    public static String converterValorMoeda(double valor, String iso, String tag) {
        Locale locale = new Locale(iso, tag);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(valor);
    }
}
