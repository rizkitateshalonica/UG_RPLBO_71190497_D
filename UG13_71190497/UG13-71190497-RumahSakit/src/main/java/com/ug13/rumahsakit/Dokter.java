package com.ug13.rumahsakit;

public class Dokter {
    private String nama, spesialis, ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal) {
        if(jadwal.isStatusScreening()) {
            pasien.setLevelPenyakit((pasien.getLevelPenyakit()-1));
        }
    }

    public void cekStatus(Pasien pasien) {
        if (pasien.getLevelPenyakit() < 0) {
            System.out.println("==============================SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT==============================");
            pasien.setStatus(true);
        }
        else {
            System.out.println("==============================PASIEN ANDA MASIH SAKIT==============================");
        }
    }
}
