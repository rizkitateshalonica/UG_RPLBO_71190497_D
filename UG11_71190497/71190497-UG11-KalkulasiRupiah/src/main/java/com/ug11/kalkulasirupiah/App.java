package com.ug11.kalkulasirupiah;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.println("Masukan teks: ");
        Scanner input = new Scanner(System.in);
        String teks = input.nextLine();

        String[] nominal;
        String[] kalimat = teks.split(" ");
        String regex = "[^a-zA-Z\\s]+";
        Pattern x = Pattern.compile(regex);
        Matcher matcher = x.matcher(teks);
        for (String data : rincian) {
            if (matcher.matches()) {
                nominal.(data);
            }
        }

        System.out.println("Rincian biaya: " + );
        System.out.println("Total: " + );
    }
}
