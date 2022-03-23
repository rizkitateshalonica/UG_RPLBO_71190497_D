package com.ug7.ewallet;

import java.util.Scanner;

public class GoPay extends eWallet{
    private int feeTopUp = 1000, feeTransfer = 500, feeWithdraw = 2500;

    public GoPay(User user){
        super(user);
    }

    public String topup(int jumlah) {
        int jlhTopUp = jumlah + feeTopUp;
        if (super.getUser().getUang() < jlhTopUp) {
            return "Uang anda tidak mencukupi!!!";
        } else {
            super.topup(jumlah);
            super.saldo(jlhTopUp);
            return "TopUp sebesar Rp. " + jumlah + " telah berhasil";
        }
    }

    public void transfer (eWallet eWallet, int jumlah) {
        System.out.print("Masukkan PIN: ");
        Scanner s = new Scanner(System.in);
        String pass = s.nextLine();
        System.out.print("Sedang memvalidasi PIN");
        Main.tunggu(3);
        if (!pass.equals(this.getUser().getPIN())) {
            System.out.println("PIN salah!!!");
        }else {
            int jlhTf = jumlah + feeTransfer;
            if (super.getSaldo() < jlhTf) {
                System.out.println("Saldo anda tidak mencukupi!!!");
            } else {
                super.transfer(eWallet, jumlah);
                super.saldo(jlhTf);
            }
        }
    }

    public void withdraw (int jumlah) {
        int jlhWd = jumlah + feeWithdraw;
        if (super.getSaldo() < jlhWd) {
            System.out.println("Saldo anda tidak mencukupi!!!");
        } else {
            super.withdraw(jumlah);
            super.saldo(jlhWd);
        }
    }

    public void getInfo() {
        System.out.println("[GoPay e-Wallet]");
        super.getInfo();
    }
}
