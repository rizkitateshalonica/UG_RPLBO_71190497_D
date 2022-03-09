package com.ug5a.soal1;

public class TransPay {
    private String nama;
    private long saldo;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    public String getNama() {
        return nama;
    }
    public long getSaldo() {
        return saldo;
    }
    public void topUp(long saldoTopUp){
        if (saldoTopUp > 0){
            saldo += saldoTopUp;
            System.out.println("Top up sebesar Rp " + saldoTopUp + " berhasil");
        }
    }
    public void bayar(int jumlah, Keyboard k){
        long totalHarga = jumlah * k.getHarga();
        if (jumlah > 0){
            if (totalHarga <= saldo) {
                saldo -= totalHarga;
                System.out.println("Pembayaran sukses! Silahkan mengambil " + k.getMerkModel()+ " di counter");
            }
            else{
                System.out.println("Pembayaran Gagal! Saldo anda kurang, silahkan melakukan top up!");
            }
        }
        else if (jumlah < 0){
            System.out.println("Input jumlah tidak valid!");
        }
    }
}
