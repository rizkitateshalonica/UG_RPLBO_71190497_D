package com.ug6.soal1;

public class Codes {
    private static String GOODSCODES = "GD";
    private static String VENDINGMACHINESCODE = "VM";
    private static String[] TYPE = "DR", "FD", "DG";

    public String generateGoodsCode(String type, String name) {
        int nama = name.length();
        char depan = name.charAt(0);
        char belakang = name.charAt(nama-1);
        System.out.println(GOODSCODES + TYPE + depan + belakang);

    }

    public String generateVendingMachinesCode(int order) {
        System.out.println("Kode Vending Machine: " + );
    }
}
