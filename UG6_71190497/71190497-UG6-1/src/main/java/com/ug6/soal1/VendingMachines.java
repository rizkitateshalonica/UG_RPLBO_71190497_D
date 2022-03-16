package com.ug6.soal1;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;
    Scanner scanner = new Scanner(System.in);

    public VendingMachines() {}

    public VendingMachines(String code, int capacity) {
        this.code = code;
        this.capacity = capacity;
    }

    public VendingMachines(String code, int capacity, ArrayList<Goods> goods, ArrayList<Double> acceptanceBalance) {
        this.code = code;
        this.capacity = capacity;
        this.goods = goods;
        this.acceptanceBalance = acceptanceBalance;
    }

    public void proceedOrder(String goodsCode, int orderQuantity) {

    }

    public void takeMoney(double money) {
        System.out.println("Nominal uang yang diperbolehkan:");
        System.out.println("1. Rp 5.000, Rp 10.000, Rp 20.000");
        System.out.println("2. Rp 10.000, Rp 20.000, Rp 50.000");
        System.out.println("3. Rp 5.000, Rp 10.000, Rp 20.000, Rp 50.000");
        System.out.println("4. Rp 10.000, Rp 20.000, Rp 50.000, Rp 100.000");
        System.out.println("Pilihan anda: ");
        String pilih = scanner.nextLine();

        if (pilih == 1) {
            System.out.println();
        }
    }
    private void giveGood(double goodsPrice, String goodsName) {

    }
    public double withdrawMoney() {
        return consumerMoney;
    }
    public void inputGoods(Goods good) {

    }
}
