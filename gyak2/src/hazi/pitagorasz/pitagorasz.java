/*
 * 1 �s 50 k�z�tti sz�mokb�l k�pezz�k a Pitagoraszi sz�mh�rmasokat �s �rjuk 
 * ki t�bl�zatos form�ban (megold�s: 20 ilyen sz�mh�rmas van). 
 * A Pitagoraszi sz�mh�rmasok egy der�ksz�g� h�romsz�g oldalainak eg�sz m�r�sz�mai, 
 * azaz teljes�l r�juk, hogy a2 + b2 = c2 �s a < b < c.
 */

package hazi.pitagorasz;

public class pitagorasz {

	public static int MAX = 50;
	
	public static void main(String[] args) {
		
		System.out.format("|  a  |  b  |  c  |\n");
		System.out.format("+-----+-----+-----+\n");

		for (int a = 1; a <= MAX; a++) {
			for (int b = a + 1; b <= MAX; b++) {
				for (int c = b + 1; c <= MAX; c++) {
					if (szamharmas(a, b, c)) {
						System.out.format("| %3d | %3d | %3d |\n", a, b, c);
					}
				}
			}
		}
		
		System.out.format("+-----+-----+-----+\n");
	}

	public static boolean szamharmas(int a, int b, int c) {
		if (a * a + b * b == c * c) {
			return true;
		} else {
			return false;
		}
	}
}
