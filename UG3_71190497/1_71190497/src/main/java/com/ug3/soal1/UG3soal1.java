package com.ug3.soal1;

import java.util.Scanner;

public class UG3soal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("==================Data Product==================");
        System.out.println("Masukan Data Product Makanan Anda");
        System.out.print("Nama Makanan: ");
        String namaMakanan = s.nextLine();

        System.out.print("Tanggal Kadaluarsa: ");
        String tgl = s.nextLine();

        System.out.print("Jumlah (quantity): ");
        Double jlh = s.nextDouble();

        System.out.print("Berat (gram): ");
        Double berat = s.nextDouble();

        System.out.println("\n==================Data Product==================");
        System.out.println("Nama Makanan : " + namaMakanan);
        System.out.println("Tanggal Kadaluarsa : " + tgl);
        System.out.println("Jumlah (quantity) : " + jlh);
        System.out.println("Berat : " + berat + " gram");
        System.out.println("================================================");
    }
}
