package ug2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Mobil M_71190497 = new Mobil();
		PejalanKaki P_71190497 = new PejalanKaki();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Kode lampu lalu lintas saat ini: ");
		int kodeLampu = s.nextInt();
		
		if(kodeLampu == 1) {
			System.out.println("-----Lampu Hijau-----");
			M_71190497.jalan();
			P_71190497.menunggu();
		}
		else if(kodeLampu == 2) {
			System.out.println("-----Lampu Kuning-----");
			M_71190497.kurangiKecepatan();
			P_71190497.bersiap();
		}
		else if(kodeLampu == 3) {
			System.out.println("-----Lampu Merah-----");
			M_71190497.berhenti();
			P_71190497.menyeberang();
		}
	}

}
