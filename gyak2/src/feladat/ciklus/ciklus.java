/*
 * Gyakorolja a c�mk�zett ciklusok haszn�lat�t! �rja ki a sz�mokat az �rt�k�knek 
 * megfelel� sz�mszor egym�s ut�n:
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */

package feladat.ciklus;

public class ciklus {

	public static void main(String[] args) {
		int szam = 5;

		for (int i = 1; i <= szam; i++) {
			j: for (int j = 1; j <= szam; j++) {
				System.out.print(i);
				if (i == j) {
					break j;
				}
			}
			System.out.println();
		}

	}

}
