/*
 * Adjon k�zel�t�st az Euler-f�le e sz�mra (e = 2,718 281 828) az al�bbi sorozat 
 * els� 100 / 1000tagj�nak kisz�m�t�s�val.
 */

package euler;

public class Euler {

	public static void main(String[] args) {
		double euler = 1;

		for (int i = 1; i <= 100; i++) {
			euler += (1.0 / fakt(i));
		}

		System.out.println("Euler-f�le sz�m: " + euler);
	}

	public static double fakt(int szam) {
		double eredmeny = 1;
		for (int i = 1; i <= szam; i++) {
			eredmeny *= i;
		}
		return eredmeny;
	}

}
