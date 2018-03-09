package kalkulator;

import java.util.Scanner;

public class Kalkulator_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("a = ");
			int a = sc.nextInt();
			System.out.print("b = ");
			int b = sc.nextInt();
			System.out.print("op = ");
			String op = sc.next();

			double eredmeny = 0;
			boolean sikeres = true;
			switch (op) {
			case "+":
				eredmeny = a + b;
				break;
			case "-":
				eredmeny = a - b;
				break;
			case "*":
				eredmeny = a * b;
				break;
			case "/":
				if (b != 0) {
					eredmeny = (double) a / b;
				} else {
					System.out.println("Nem �rthelmezhet� a 0-val val� oszt�s.");
					sikeres = false;
				}
				break;
			default:
				System.out.println("Nem megfelel� oper�tor!");
				System.out.println("Lehets�ges oper�torok: '+', '-', '*', '/'");
				sikeres = false;
			}

			if (sikeres) {
				System.out.println("Eredm�ny = " + eredmeny);
			}
			
			System.out.print("Folytatja a sz�mol�st? [1/0]	");
			
		} while (sc.nextInt() != 0);
		sc.close();

	}

}
