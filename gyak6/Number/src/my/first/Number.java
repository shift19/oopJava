package my.first;

public class Number {

	private static double tolerance = 0.001;

	private double number;

	public Number(double number) {
		this.number = number;
	}

	public static double getTolerance() {
		return tolerance;
	}

	public static void setTolerance(double tolerance) {
		Number.tolerance = tolerance;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public boolean inTolerance(double n) {
		return this.tolerance < Math.abs(number - n);
	}

}
