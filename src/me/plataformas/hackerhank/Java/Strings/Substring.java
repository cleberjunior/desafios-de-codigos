package me.plataformas.hackerhank.PrepareByTopics.Java.Strings;

import java.io.*;

public class Substring {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        System.out.println(S.substring(start, end));
    }
}
