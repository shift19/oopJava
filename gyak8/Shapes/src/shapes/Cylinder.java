package shapes;

public class Cylinder extends Prism {

	private double radius;

	public Cylinder(double radius, int height) {
		super(height);
		this.radius = radius;
	}

	@Override
	public double getSurface() {
		return 2 * radius * 3.14 * getHeight();
	}

	@Override
	public String toString() {
		return radius + " " + getHeight();
	}

}
