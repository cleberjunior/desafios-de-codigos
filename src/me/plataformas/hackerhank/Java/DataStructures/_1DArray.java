package me.plataformas.hackerhank.PrepareByTopics.Java.DataStructures;

import java.util.*;

public class _1DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;

        while (count < n) {
            a[count] = sc.nextInt();
            count++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}
