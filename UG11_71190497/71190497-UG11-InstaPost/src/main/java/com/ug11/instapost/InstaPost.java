package com.ug11.instapost;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstaPost {
    private int totalMention;
    private String email, username;

    public InstaPost() {
    }

    public void printInfo() {
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
        System.out.println("Total Mention: " + this.totalMention);
    }

    public void login(String email) {
        String regex = "^[\\w-]+@gmail+.\\w*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        try {
            if (!email.contains("@")) {
                throw new EmailException(1);
            }
            else if (!m.matches()) {
                throw new EmailException(2);
            }
            System.out.println("Login Berhasil!");
        }
        catch (EmailException error) {
            System.out.println("Error: " + error.getErrorMessage());
        }
    }

    public void post(String caption) {
        System.out.println(caption);
        String regex = "@+\\w*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(caption);
        String[] kalimat = caption.split(" ");
        int hitung = 0;
        for (String x : kalimat) {
            if (m.matches()) {
                hitung++;
                System.out.println("Pengguna yang Anda mention: ");
                System.out.println("Total username yang Anda mention: " + hitung);
            }
        }

    }
}
