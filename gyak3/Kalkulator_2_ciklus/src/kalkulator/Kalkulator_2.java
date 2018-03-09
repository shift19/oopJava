package kalkulator;

import java.util.Scanner;

public class Kalkulator_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Adja meg az elv�gzend� m�veletet:");
			String str = sc.nextLine();

			String[] in = str.split(" ");

			int a = Integer.parseInt(in[0]);
			int b = Integer.parseInt(in[2]);
			String op = in[1];

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

		} while (Integer.parseInt(sc.nextLine()) != 0);
		sc.close();
	}

}
