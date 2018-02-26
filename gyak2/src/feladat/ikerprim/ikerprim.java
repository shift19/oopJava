/*
 * �ll�tsa el� az 1 �s 100 k�z� es� sz�mokb�l k�sz�thet� �sszes sz�mp�rt 
 * (a sz�mp�rok k�l�nb�z� sz�mokb�l �llnak). Sz�molja meg, hogy ezek k�z�l 
 * h�ny sz�mp�rra igaz, hogy ikerpr�mek �s �rja ki ezeket a sz�mp�rokat a konzolra. 
 * Megold�s: 8 ilyen sz�mp�r van. 
 * Az ikerpr�mek olyan pr�msz�mok, melyek k�l�nbs�ge 2 (pl. 5 �s 7 ikerpr�mek).
 */

package feladat.ikerprim;

public class ikerprim {

	public static void main(String[] args) {
		int darab = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = i + 1; j < 100; j++) {
				if (primE(i) && primE(j)) {
					if (Math.abs(i - j) == 2) {
						System.out.println(i + " " + j);
						darab++;
					}
				}
			}
		}
		System.out.println("Ikerpr�mek sz�ma: " + darab);
	}

	public static boolean primE(int szam) {
		if (szam == 1 || szam == 0) {
			return false;
		}
		int db = 2; // 1 �s �nmaga
		for (int i = 2; i <= Math.sqrt(szam); i++) {
			if (szam % i == 0) {
				db++;
			}
		}
		if (db == 2) {
			return true;
		}
		return false;
	}
}
