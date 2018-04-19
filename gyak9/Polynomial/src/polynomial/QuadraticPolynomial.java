package polynomial;

import complex.Complex;
import math.Polynomial;

public class QuadraticPolynomial implements Polynomial {
	private double a;
	private double b;
	private double c;

	public QuadraticPolynomial(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		String op1 = "+";
		String op2 = "+";

		if (b < 0) {
			op1 = "-";
		}
		if (c < 0) {
			op2 = "-";
		}

		if (b == 0) {
			return "y = " + a + "x2 " + op2 + " " + Math.abs(c);
		}
		if (c == 0) {
			return "y = " + a + "x2 " + op1 + " " + Math.abs(b);
		}

		return "y = " + a + "x2 " + op1 + " " + Math.abs(b) + "x " + op2 + " " + Math.abs(c);
	}

	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}

	@Override
	public double getY(double x) {
		return a * x * x + b * x + c;
	}

	@Override
	public int getPolynomialDegree() {
		return 2;
	}

	public enum Roots {
		TWO_COMPLEX, ONE_REAL, TWO_REAL;
	}

	public Roots getRootType() {
		if (getDiscriminant() < 0) {
			return Roots.TWO_COMPLEX;
		}
		if (getDiscriminant() > 0) {
			return Roots.TWO_REAL;
		}
		return Roots.ONE_REAL;
	}

	public String getRoots() {
		double discriminant = getDiscriminant();
		if (discriminant > 0) {
			class TwoRealRoot {
				double r1;
				double r2;

				@Override
				public String toString() {
					return r1 + " | " + r2;
				}
			}
			TwoRealRoot trr = new TwoRealRoot();
			trr.r1 = Math.round((-b + Math.sqrt(discriminant)) / (2 * a) * 100) / 100.0;
			trr.r2 = Math.round((-b - Math.sqrt(discriminant)) / (2 * a) * 100) / 100.0;
			return trr.toString();
		}

		if (discriminant < 0) {
			class TwoComplexRoot {
				Complex r1;
				Complex r2;

				@Override
				public String toString() {
					return r1 + " | " + r2;
				}
			}
			TwoComplexRoot tcr = new TwoComplexRoot();
			double real = Math.round(-b / (2 * a) * 100) / 100.0;
			double imag = Math.round(Math.sqrt(-discriminant) / (2 * a) * 100) / 100.0;
			tcr.r1 = new Complex(real, imag);
			tcr.r2 = new Complex(real, -imag);
			return tcr.toString();
		}

		double r = Math.round(-b / (2 * a) * 100) / 100.0;
		return String.valueOf(r);
	}
}
