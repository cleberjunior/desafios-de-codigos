package me.plataformas.hackerhank.PrepareByTopics.Java.Introdution;

import java.io.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {
        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */
        public static String findDay(int month, int day, int year) {
            String mes = month <= 9 ? "0"+month : String.valueOf(month);
            String dia = day <= 9 ? "0"+day : String.valueOf(day);

            String str = year+"-"+mes+"-"+dia;
            LocalDate data = LocalDate.parse(str);
            String diaDaSemana = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

            return diaDaSemana.toUpperCase();
        }
    }

    public class DateAndTime {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int month = Integer.parseInt(firstMultipleInput[0]);
            int day = Integer.parseInt(firstMultipleInput[1]);
            int year = Integer.parseInt(firstMultipleInput[2]);

            String res = Result.findDay(month, day, year);

            bufferedWriter.write(res);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

