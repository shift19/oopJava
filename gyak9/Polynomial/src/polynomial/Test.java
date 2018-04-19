package polynomial;

import java.util.Scanner;

import math.Polynomial;

public class Test {

	public static void main(String[] args) {
		LinearPolynomial[] lp = new LinearPolynomial[1];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Linear Polynomials:");
		for (int i = 0; i < lp.length; i++) {
			System.out.print("[" + (i + 1) + "] Enter value A: ");
			double a = Double.parseDouble(sc.nextLine());
			System.out.print("[" + (i + 1) + "] Enter value B: ");
			double b = Double.parseDouble(sc.nextLine());
			lp[i] = new LinearPolynomial(a, b);
		}

		for (LinearPolynomial p : lp) {
			System.out.println(p);
		}

		printFunction(lp[lp.length - 1]);

		QuadraticPolynomial[] qp = new QuadraticPolynomial[5];

		System.out.println("Enter Quadratic Polynomials:");
		for (int i = 0; i < qp.length; i++) {
			System.out.print("[" + (i + 1) + "] Enter value A: ");
			double a = Double.parseDouble(sc.nextLine());
			System.out.print("[" + (i + 1) + "] Enter value B: ");
			double b = Double.parseDouble(sc.nextLine());
			System.out.print("[" + (i + 1) + "] Enter value C: ");
			double c = Double.parseDouble(sc.nextLine());
			qp[i] = new QuadraticPolynomial(a, b, c);
		}

		for (QuadraticPolynomial p : qp) {
			System.out.println(p + " roots: " + p.getRoots());
		}

		sc.close();
	}

	public static void printFunction(Polynomial p) {
		System.out.println("|   x   |    y    |");

		for (double x = 0; x <= 1; x += 0.1) {
			System.out.format("| %5.2f | %7.2f |\n", x, p.getY(x));
		}
	}
}
