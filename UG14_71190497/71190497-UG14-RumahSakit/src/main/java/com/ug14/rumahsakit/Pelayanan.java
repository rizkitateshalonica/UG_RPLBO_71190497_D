package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayan;
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal) {
        System.out.println("Data Jadwal Berhasil Disimpan!");
        System.out.println("==============================PROSES PENGATURAN JADWAL BERHASIL==============================");
    }

    public Pasien registrasi() {
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Masukkan rm baru : ");
        int rm = inputInt.nextInt();
        System.out.print("Masukan nama anda : ");
        String nama = inputStr.nextLine();
        System.out.print("Masukan usia anda : ");
        int usia = inputInt.nextInt();
        System.out.print("Masukan alamat anda : ");
        String alamat = inputStr.nextLine();
        System.out.print("Masukan penyakit anda : ");
        String penyakit = inputStr.nextLine();

        Pasien p = new Pasien(rm, nama, usia, alamat, penyakit);

        p.setLevelPenyakit(5);
        System.out.println("\nData Pasien Berhasil Disimpan!");
        System.out.println("==============================PROSES REGISTRASI BERHASIL==============================");
        return p;
    }
}
