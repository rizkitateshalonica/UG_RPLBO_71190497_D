package com.ug14.rumahsakit;

public class Pasien {
    private String nama, alamat, penyakit;
    private int rm, usia, levelPenyakit;
    private boolean status = false;

    public Pasien() {
    }

    public Pasien(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public Pasien(int rm, String nama, int usia, String alamat, String penyakit) {
        this.nama = nama;
        this.alamat = alamat;
        this.penyakit = penyakit;
        this.rm = rm;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public void setLevelPenyakit(int levelPenyakit) {
        this.levelPenyakit = levelPenyakit;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
