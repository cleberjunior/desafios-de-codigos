package me.beecrowd;
/*
    https://judge.beecrowd.com/en/problems/view/2060
    Author: @cleberjunior
    Date: April 22 2024
*/
import java.io.*;
import java.util.*;

public class Beecrowd_2060 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        Map<Integer, Integer> referencia = new HashMap<>();
        referencia.put(2, 0);
        referencia.put(3, 0);
        referencia.put(4, 0);
        referencia.put(5, 0);

        for (String element : br.readLine().split(" ")) {
            for (Map.Entry<Integer, Integer> value : referencia.entrySet()) {
                if (Integer.parseInt(element) % value.getKey() == 0)
                    referencia.merge(value.getKey(), 1, Integer::sum);
            }
        }

        String ans = "";

        for (Map.Entry<Integer, Integer> res : referencia.entrySet()) {
            ans += res.getValue() + " Multiplo(s) de " + res.getKey() + "\n";
        }

        System.out.print(ans);
    }
}