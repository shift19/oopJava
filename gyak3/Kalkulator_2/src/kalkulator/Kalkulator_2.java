package kalkulator;

import java.util.Scanner;

public class Kalkulator_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Adja meg az elvégzendõ mûveletet:");
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
				System.out.println("Nem érthelmezhetõ a 0-val való osztás.");
				sikeres = false;
			}
			break;
		default:
			System.out.println("Nem megfelelõ operátor!");
			System.out.println("Lehetséges operátorok: '+', '-', '*', '/'");
			sikeres = false;
		}

		if (sikeres) {
			System.out.println("Eredmény = " + eredmeny);
		}

		sc.close();
	}

}
