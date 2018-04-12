package shapes;

public abstract class Prism {
	private int height;

	public int getHeight() {
		return height;
	}

	public Prism(int height) {
		this.height = height;
	}

	public abstract double getSurface();

	public double getVolume() {
		return getSurface() * getHeight();
	}

	public boolean biggerPrism(Prism p) {
		return getVolume() > p.getVolume();
	}
}
