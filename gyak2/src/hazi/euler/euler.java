/*
 * Adjon közelítést az Euler-féle e számra (e = 2,718 281 828) az alábbi sorozat 
 * elsõ 100 / 1000tagjának kiszámításával.
 */

package hazi.euler;

public class euler {

	public static void main(String[] args) {
		double euler = 1;

		for (int i = 1; i <= 100; i++) {
			euler += (1.0 / fakt(i));
		}

		System.out.println("Euler-féle szám: " + euler);
	}

	public static double fakt(int szam) {
		double eredmeny = 1;
		for (int i = 1; i <= szam; i++) {
			eredmeny *= i;
		}
		return eredmeny;
	}

}
