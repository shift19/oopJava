/*
 * Sz�m�tsa ki 1-t�l 10-ig a sz�mok faktori�lis�t. 
 * A faktori�lis sz�m�t�st k�l�n f�ggv�nyben val�s�tsa meg.
 */

package faktorialis;

public class Faktorialis {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + faktRek(i));
			System.out.println(i + " " + fakt(i));
		}
	}

	public static int faktRek(int szam) {
		if (szam == 1) {
			return szam;
		}
		if (szam == 0) {
			return 1;
		}
		return faktRek(szam - 1) * szam;
	}

	public static int fakt(int szam) {
		int eredmeny = 1;
		for (int i = 1; i <= szam; i++) {
			eredmeny = eredmeny * i;
		}
		return eredmeny;
	}

}
