package masodfoku;

import java.util.Scanner;

public class MasodfokuEgyenlet_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Adja meg az a, b, és c értékét: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == 0) {
			System.out.println("Az 'a' értéke nem lehet 0.");
			System.exit(0);
		}

		double D = b * b - 4 * a * c;

		if (D > 0) {
			double x1 = ((-b) + Math.sqrt(D)) / (2 * a);
			double x2 = ((-b) - Math.sqrt(D)) / (2 * a);

			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else {
			if (D == 0) {
				double x = (-b) / (2 * a);
				
				System.out.println("x = " + x);
			} else {
				System.out.println("Nincs valós megoldás.");
			}
		}

		sc.close();
	}
}
