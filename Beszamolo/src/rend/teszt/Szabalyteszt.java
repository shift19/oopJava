package rend.teszt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

import rend.Gyorshajtas;

public class Szabalyteszt {

	public static void main(String[] args) {
		Gyorshajtas[] gyh = new Gyorshajtas[5];

		/*
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < gyh.length; i++) {
			System.out.print("Nev: ");
			String nev = sc.nextLine();
			System.out.print("Alapbirsag: ");
			int birsag = Integer.parseInt(sc.nextLine());
			System.out.print("Tullepes: ");
			int tullepes = Integer.parseInt(sc.nextLine());

			gyh[i] = new Gyorshajtas(nev, birsag, tullepes);
		}
		sc.close();
		*/
		
		try (BufferedReader b = new BufferedReader(new InputStreamReader(System.in))){
			for (int i = 0; i < gyh.length; i++) {
				System.out.print("Nev: ");
				String nev = b.readLine();
				System.out.print("Alapbirsag: ");
				int birsag = Integer.parseInt(b.readLine());
				System.out.print("Tullepes: ");
				int tullepes = Integer.parseInt(b.readLine());

				gyh[i] = new Gyorshajtas(nev, birsag, tullepes);
			}
		} catch (IOException e) {
			System.out.println("Hiba tortent beolvasas soran.");
			e.printStackTrace();
		}
		

		System.out.println("Legnagyobb birsag: " + getLegnagyobbBirsag(gyh));

		System.out.println("Atlagos birsag: " + getAtlag(gyh));

		for (Gyorshajtas gyorshajtas : gyh) {
			System.out.println(gyorshajtas);
		}
		
		int db = 0;
		for (int i = 0; i < gyh.length; i++) {
			if (gyh[i].getDatum().getYear() == 2017) {
				db++;
			}
		}
		System.out.println("Gyorshajtasok szama 2017-ben: " + db);
		
	}

	public static Gyorshajtas getLegnagyobbBirsag(Gyorshajtas[] gyh) { // 2. fel
		int max = 0;
		for (int i = 0; i < gyh.length; i++) {
			if (gyh[i].getBirsag() > gyh[max].getBirsag()) {
				max = i;
			}
		}
		return gyh[max];
	}

	public static double getAtlag(Gyorshajtas[] gyh) { // 3. fel
		int sum = 0;
		for (int i = 0; i < gyh.length; i++) {
			sum += gyh[i].getBirsag();
		}
		return sum / gyh.length;
	}
	
	
}
