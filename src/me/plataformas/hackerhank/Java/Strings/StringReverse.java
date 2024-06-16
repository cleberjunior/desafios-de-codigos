package me.plataformas.hackerhank.PrepareByTopics.Java.Strings;

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next(), invertedWord = "";

        for (int i = 0; i < A.length(); i++) {
            invertedWord += A.toCharArray()[A.length()-1-i];
        }

        if (invertedWord.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
