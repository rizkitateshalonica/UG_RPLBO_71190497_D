package com.ug13.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Jadwal jadwal) {
        System.out.println("==============================PROSES PENGATURAN JADWAL BERHASIL==============================");
    }

    public Pasien registrasi() {
        Pasien pasien = new Pasien();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama anda : ");
        String nama = input.nextLine();
        pasien.setNama(nama);
        System.out.print("Masukan usia anda : ");
        Scanner inputU = new Scanner(System.in);
        int usia = inputU.nextInt();
        pasien.setUsia(usia);
        System.out.print("Masukan alamat anda : ");
        String alamat = input.nextLine();
        pasien.setAlamat(alamat);
        System.out.print("Masukan penyakit anda : ");
        String penyakit = input.nextLine();
        pasien.setPenyakit(penyakit);

        pasien.setLevelPenyakit(5);
        System.out.println("==============================PROSES REGISTRASI BERHASIL==============================");
        return pasien;
    }
}
