package com.ug12.projectkassa;

import java.util.HashMap;
import java.util.ArrayList;

public class Kassa {
    private HashMap<Produk, Integer> pesanan = new HashMap<Produk, Integer>();
    private ArrayList<Kasir> arrKasir = new ArrayList<Kasir>();
    private Kasir kasir;

    public Kassa() {}

    public void login (String username, String password) {
        for (int i = 0; i < arrKasir.size(); i++) {
            if (arrKasir.get(i).getUsername().equals(username) && arrKasir.get(i).getPassword().equals(password)) {
                System.out.println("Login berhasil!");
                this.kasir = arrKasir.get(i);
                break;
            }
            else {
                System.out.println("Username/password Anda salah!");
            }
        }
    }

    public void register (Kasir kasir) {
        this.arrKasir.add(kasir);
        System.out.println("Kasir " + kasir.getNama() + " berhasil ditambahkan ke dalam sistem.");
    }

    public void tambahPesanan (Produk produk, int jumlah) {
        pesanan.put(produk, jumlah);
    }

    public void printNota() {
        System.out.println("==========Nota==========");
        System.out.println("Kasir: " + kasir.getNama());
        System.out.println("No.\tNama Barang\t\tJumlah\t\tHarga\t\tSub Total");
        int nomor = 1;
        for (Produk produk : pesanan.keySet()) {
            System.out.println(nomor + ".\t" + produk.getNama() + "\t\t" + pesanan.get(produk)
            + "\t\t" + produk.getHarga() + "\t\t" + (produk.getHarga())*pesanan.get(produk));
            nomor++;
            this.kasir.setTotalPenjulan((produk.getHarga())*pesanan.get(produk));
        }
        pesanan.clear();
    }

    public void printPenjualanKasir() {
        System.out.println("Daftar Kasir:");
        System.out.println("No.\tNama\t\t\t\tTotal Penjualan");
        int nomor = 1;
        for (Kasir kasir : arrKasir) {
            System.out.println(nomor + ".\t" + kasir.getNama() + "\t\tRp" + kasir.getTotalPenjulan());
            nomor++;
        }
    }
}
