/*
 * Állítsa elõ az 1 és 100 közé esõ számokból készíthetõ összes számpárt 
 * (a számpárok különbözõ számokból állnak). Számolja meg, hogy ezek közül 
 * hány számpárra igaz, hogy ikerprímek és írja ki ezeket a számpárokat a konzolra. 
 * Megoldás: 8 ilyen számpár van. 
 * Az ikerprímek olyan prímszámok, melyek különbsége 2 (pl. 5 és 7 ikerprímek).
 */

package feladat.ikerprim;

public class Ikerprim {

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
		System.out.println("Ikerprímek száma: " + darab);
	}

	public static boolean primE(int szam) {
		if (szam == 1 || szam == 0) {
			return false;
		}
		int db = 2; // 1 és önmaga
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
