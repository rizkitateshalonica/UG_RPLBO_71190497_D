package ug2;

import java.util.Scanner;

public class Diskon {

	public static void main(String[] args) {   
		int harga;
		int jlhBarang; 
        int diskon; 
        int total;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Banyak belanjaan: ");
        jlhBarang = s.nextInt();
        
        int[] hitTotal = new int[jlhBarang];
        for (int i = 1; i < hitTotal.length + 1; i++){
            System.out.println("Harga barang ke-" + i);
            int hargaBarang = s.nextInt();
        }
        
        if(total >= 101000 && total >= 200000){
        	diskon = total * 5/100;
            total = total - diskon;
            System.out.println("Total harga: ");
            System.out.println ("Diskon: 5%");
        }
        else if(total >= 201000 && total >= 400000){
        	diskon = total*(10/100);
            total = total-diskon;
            System.out.println("Total harga: ");
            System.out.println ("Diskon: 10%");
        }
        else if(total >= 400000){
        	diskon = total*20/100;
            total = total-diskon;
            System.out.println("Total harga: ");
            System.out.println ("Diskon: 20%");
        }
	}
}
