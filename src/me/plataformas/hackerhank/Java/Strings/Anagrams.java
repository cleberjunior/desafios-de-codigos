package me.plataformas.hackerhank.PrepareByTopics.Java.Strings;

import java.util.*;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        char[] chA = a.toLowerCase().toCharArray();
        char[] chB = b.toLowerCase().toCharArray();

        Arrays.sort(chA);
        Arrays.sort(chB);

        return Arrays.equals(chA, chB);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "TestTest";
        String b = "testsest";
        sc.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
