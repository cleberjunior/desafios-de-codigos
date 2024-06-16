package me.plataformas.hackerhank.PrepareByTopics.Java.Strings;

import java.util.Scanner;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i < s.length()-(k-1); i++) {
            String str = s.substring(i, k+i);

            if (smallest.compareTo(str) > 0) {
                smallest = str;
            }
            if (largest.compareTo(str) < 0) {
                largest = str;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "welcometojavaabi";
        int k = 3;
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
