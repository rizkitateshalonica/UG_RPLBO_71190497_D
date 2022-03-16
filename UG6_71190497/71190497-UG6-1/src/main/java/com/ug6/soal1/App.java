package com.ug6.soal1;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        VendingMachines VM = new VendingMachines();
        Goods g =  new Goods();
        Codes c = new Codes();
        Scanner s = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("            Buat Vending Machine Terlebih Dahulu            ");
        System.out.println("============================================================");
        System.out.println("Kapasitas Maksimal: ");
        String kapasitas = s.nextLine();

        System.out.println("Apakah anda akan menambahkan barang sekarang?");
        String jawaban = s.nextLine();
        System.out.println("ya(y) atau tidak(n): ");
        if (jawaban.equals("y")){
            System.out.println("Nama barang: ");
            String namaBarang = s.nextLine();
            System.out.println("Type barang: ");
            System.out.println("1. Minuman\n2. Makanan\n3. Produk Digital");
            System.out.println("pilihan (1/2/3): ");
            String pilihan = s.nextLine();
        }
    }
}
