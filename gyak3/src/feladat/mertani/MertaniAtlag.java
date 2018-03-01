package feladat.mertani;

import java.util.Scanner;

public class MertaniAtlag {

	public static void main(String[] args) {

		double[] tomb = new double[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adja meg a sz�mokat!");
		
		double szorzat = 1;
		for (int i = 0; i < tomb.length; i++) {
			System.out.print((i + 1) + " sz�m: ");
			tomb[i] = sc.nextDouble();
			szorzat *= tomb[i];
		}

		double eredmeny = Math.pow(szorzat, (-1) * tomb.length);
		System.out.println("A m�rtani �tlag: " + eredmeny);

		sc.close();
	}

}
