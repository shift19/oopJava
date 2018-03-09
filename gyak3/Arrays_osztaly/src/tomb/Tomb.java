package tomb;

import java.util.Arrays;

public class Tomb {

	public static void main(String[] args) {
		int[] szamok = new int[] { 45, 3, 4, 10, 15, 25, 78, 4, 5, 7 };

		for (int szam : szamok) {
			System.out.print(szam + " ");
		}
		System.out.println();

		Arrays.sort(szamok);

		for (int szam : szamok) {
			System.out.print(szam + " ");
		}
		System.out.println();

		int index = Arrays.binarySearch(szamok, 45);
		System.out.println("index: " + index + " érték: " + szamok[index]);
	}

}
