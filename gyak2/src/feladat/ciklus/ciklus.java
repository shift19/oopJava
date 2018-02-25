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
