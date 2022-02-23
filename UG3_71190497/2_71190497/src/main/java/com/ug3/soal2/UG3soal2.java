package com.ug3.soal2;

import java.util.Scanner;

public class UG3soal2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hitung, angka1, angka2, ulang = 0;
        boolean program;
        program = true;

        while(program) {
            System.out.println("Bilangan Fibonacci dari kata");
            System.out.print("Masukan input pertama: ");
            String inputSatu = s.nextLine();

            System.out.print("Masukan input kedua: ");
            String inputDua = s.nextLine();


            System.out.println("Bilangan fibonacci");

            angka1 = inputSatu.length();
            angka2 = inputDua.length();
            hitung = angka1;
            while(ulang <= 10) {
                System.out.print(angka1 + " ");
                hitung = angka1 + angka2;
                angka1 = angka2;
                angka2 = hitung;
                ulang++;
            }

            System.out.print("\nKeluar dari program (ketikan exit) : ");
            String jawab = s.nextLine();
            if (jawab.equals("exit")) {
                program = false;
            }
        }
    }
}
