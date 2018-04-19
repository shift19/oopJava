package polynomial;

import math.Polynomial;

public class LinearPolynomial implements Polynomial {
	private double a;
	private double b;

	public LinearPolynomial(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		String op = "+";

		if (b < 0) {
			op = "-";
		}

		if (b == 0) {
			return "y = " + a + "x";
		}

		return "y = " + a + "x " + op + " " + Math.abs(b);
	}

	@Override
	public double getY(double x) {
		return a * x + b;
	}

	@Override
	public int getPolynomialDegree() {
		return 1;
	}

}
