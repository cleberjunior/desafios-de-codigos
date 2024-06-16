package me.linguagens.java;

import java.util.*;
import java.io.*;
import java.net.*;

class JavaAgeCouting {
    public static void main (String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(url.openConnection().getInputStream())
                );

                String linha;
                while ((linha = bufferedReader.readLine()) != null) {
                    System.out.println(
                        Arrays.stream(linha
                                    .split(":")[1]
                                    .replaceAll("\"}","")
                                    .replace("\"","")
                                    .split(","))
                                    .filter(s -> s.contains("age") && Integer.parseInt(s.split("=")[1]) >= 50)
                                    .count());
                }
            } catch (IOException Ex) {
                System.out.println(Ex);
            }
        } catch (MalformedURLException Ex) {
            System.out.println(Ex);
        }
    }
}
