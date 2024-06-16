package me.plataformas.hackerhank.Challenges._30DaysOfCode.Day7;

import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        java.util.Arrays

        bufferedReader.close();
    }
}
