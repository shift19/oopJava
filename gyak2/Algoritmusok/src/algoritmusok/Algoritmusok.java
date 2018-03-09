/* 
 * Deklar�ljon �s inicializ�ljon egy 10 elem� int t�mb�t �s val�s�tsa meg az 
 * al�bbi algoritmusokat k�l�n f�ggv�nyk�nt:
 * line�ris keres�s
 * k�zvetlen kiv�laszt�sos rendez�s (n�vekv� rendezetts�g minimum kiv�laszt�ssal)
 * bin�ris keres�s
 * Gyakorolja a foreach ciklus haszn�lat�t!
 */

package algoritmusok;

public class Algoritmusok {

	public static int keresett = 45;

	public static void main(String[] args) {
		int[] szamok = new int[] { 45, 3, 4, 10, 15, 25, 78, 4, 5, 7 };

		for (int szam : szamok) {
			System.out.print(szam + " ");
		}
		System.out.println();

		rendezes(szamok);

		for (int szam : szamok) {
			System.out.print(szam + " ");
		}
		System.out.println();

		int index;
		index = linearis(keresett, szamok);
		if (index == -1) {
			System.out.println("LINE�RIS: Nem tal�lhat� ilyen sz�m...");
		} else {
			System.out.println("LINE�RIS: " + keresett + " indexe " + index);
		}

		index = binaris(keresett, szamok);
		if (index == -1) {
			System.out.println("BIN�RIS: Nem tal�lhat� ilyen sz�m...");
		} else {
			System.out.println("BIN�RIS: " + keresett + " indexe " + index);
		}
	}

	public static void rendezes(int[] szamok) {
		for (int i = 0; i < szamok.length; i++) {
			int min = i;
			for (int j = i; j < szamok.length; j++) {
				if (szamok[j] < szamok[min]) {
					min = j;
				}
			}
			int seged = szamok[min];
			szamok[min] = szamok[i];
			szamok[i] = seged;
		}
	}

	public static int linearis(int keresett, int[] szamok) {
		int index = 0;
		for (int szam : szamok) {
			if (szam == keresett) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public static int binaris(int keresett, int[] szamok) {
		int E = 0;
		int U = szamok.length - 1;
		while (E <= U) {
			int K = E + (U - E) / 2;
			if (keresett < szamok[K]) {
				E = K - 1;
			} else if (keresett > szamok[K]) {
				E = K + 1;
			} else {
				return K;
			}
		}
		return -1;
	}
}
