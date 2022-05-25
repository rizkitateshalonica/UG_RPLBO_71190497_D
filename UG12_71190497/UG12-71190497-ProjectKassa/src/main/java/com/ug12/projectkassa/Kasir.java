package com.ug12.projectkassa;

public class Kasir {
    private String password, username, nama;
    private long totalPenjulan;

    public Kasir(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public long getTotalPenjulan() {
        return totalPenjulan;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public void setTotalPenjulan(long totalPenjulan) {
        this.totalPenjulan += totalPenjulan;
    }
}
