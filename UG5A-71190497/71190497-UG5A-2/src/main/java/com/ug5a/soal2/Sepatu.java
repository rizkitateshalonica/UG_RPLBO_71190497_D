package com.ug5a.soal2;

public class Sepatu {
    private String kode = "NK0024510";
    private static int nextNum = 1;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;

    public Sepatu(String merkModel, int ukuran, long harga, int stok) {
        this.merkModel = merkModel;
        this.ukuran = ukuran;
        this.harga = harga;
        this.stok = stok;
        kode = kode + nextNum;
        nextNum++;
    }
    public String getKode() {
        return kode;
    }
    public String getMerkModel() {
        return merkModel;
    }
    public int getUkuran() {
        return ukuran;
    }
    public long getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
}
