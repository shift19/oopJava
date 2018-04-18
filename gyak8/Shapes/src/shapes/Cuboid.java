package shapes;

public class Cuboid extends Prism {

	private double a;
	private double b;

	public Cuboid(double a, double b, int height) {
		super(height);
		this.a = a;
		this.b = b;
	}

	@Override
	public double getSurface() {
		return a * b * getHeight();
	}

	@Override
	public String toString() {
		return a + " " + b + " " + getHeight();
	}

}
