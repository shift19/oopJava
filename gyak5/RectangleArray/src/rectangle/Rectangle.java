package rectangle;

public class Rectangle {
	private int a;
	private int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Rectangle(int a) {
		this(a, a);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setRectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setRectangle(int a) {
		this.a = a;
		this.b = a;
	}

	public int getArea() {
		return a * b;
	}

	public String getDetails() {
		return a + ", " + b + ": " + getArea();
	}

	public boolean isBigger(Rectangle r) {
		return getArea() > r.getArea();
	}

	public boolean isEqual(Rectangle r) {
		return a == r.getA() && b == r.getB();
	}

}
