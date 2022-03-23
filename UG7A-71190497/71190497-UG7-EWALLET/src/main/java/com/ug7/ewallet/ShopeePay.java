package com.ug7.ewallet;

public class ShopeePay extends eWallet{
    private int feeTopUp = 500, feeTransfer = 0, feeWithdraw = 1000;

    public ShopeePay(User user){
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
        if (!super.getUser().isEmailConfirmed()) {
            System.out.println("Konfirmasi email terlebih dahulu!!!");
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
        System.out.println("[ShopeePay e-Wallet]");
        super.getInfo();
    }
}
