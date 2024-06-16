package me.plataformas.hackerhank.PrepareByTopics.Java.Strings;

import java.util.*;

public class StringsIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(CalcularTamanho(A, B));

        int codigoA = A.charAt(0);
        int codigoB = B.charAt(0);

        if (codigoA > codigoB)
            System.out.println("YES");
        else
            System.out.println("NO");

        System.out.println(retornaPrimeiraMaisculo(A) + " "+ retornaPrimeiraMaisculo(B));
    }

    public static int CalcularTamanho(String A, String B) {
        return A.length() + B.length();
    }

    public static String retornaPrimeiraMaisculo(String palavra) {
        return String.valueOf(palavra.charAt(0)).toUpperCase() + palavra.substring(1);
    }
}
