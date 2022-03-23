package com.ug7.ewallet;

public class eWallet {
    private User user;
    private int saldo;

    public eWallet(User user) {
        this.user = new User(user.getNama(), user.getEmail(), user.getUang());
    }

    public User getUser() { return user; }

    public int getSaldo() { return saldo; }

    public void saldo(int jumlah) {
        saldo -= jumlah;
    }

    public String topup (int jumlah) {
        if (jumlah < 0) {
            return "Jumlah tidak valid!!!";
        }
        else if (user.getUang() < jumlah) {
            return "Uang anda tidak mencukupi!!!";
        }
        else {
            user.topup(jumlah);
            saldo += jumlah;
            return "TopUp sebesar Rp. " + jumlah + " telah berhasil";
        }
    }

    public void transfer (eWallet eWallet, int jumlah) {
        if (jumlah < 0) {
            System.out.println("Jumlah tidak valid!!!");
        }
        else if (saldo < jumlah) {
            System.out.println("Saldo tidak mencukupi!!!");
        }
        else {
            saldo -= jumlah;
            eWallet.saldo += jumlah;
            System.out.println("Transfer ke " + eWallet.getUser().getNama() + " sebesar Rp. " + jumlah + " berhasil");
        }
    }

    public void withdraw (int jumlah) {
        if (jumlah < 0) {
            System.out.println("Jumlah tidak valid!!!");
        }
        else if (saldo < jumlah) {
            System.out.println("Saldo tidak mencukupi!!!");
        }
        else {
            saldo -= jumlah;
            user.withdraw(jumlah);
        }
    }

    public void getInfo() {
        System.out.println("Nama: " + user.getNama() + "[PIN: " + user.getPIN() + "]");
        String conf  = "";
        if (this.user.isEmailConfirmed()) {
            conf = "[Confirmed]";
        }
        System.out.println("Email: " + this.user.getEmail() + " " + conf);
        System.out.println("Uang cash: Rp" + user.getUang());
        System.out.println("Saldo e-wallet: Rp" + saldo);
    }
}
