package shapes.array;

import shapes.Prism;
import shapes.Cylinder;

public class PrismArray {

	private Prism[] prisms;

	public PrismArray(int s) {
		this.prisms = new Prism[s];
	}

	public void setPrism(int i, Prism p) {
		if (i >= prisms.length || i < 0) {
			return;
		}
		prisms[i] = p;
	}

	public int getSize() {
		return prisms.length;
	}

	public Prism getPrism(int i) {
		if (i >= prisms.length || i < 0) {
			return null;
		}
		return prisms[i];
	}

	public int getPrismCount() {
		int count = 0;

		for (int i = 0; i < prisms.length; i++) {
			if (prisms[i] != null) {
				count++;
			}
		}
		return count;
	}

	public double getAverageVolume() {
		double sum = 0;

		for (int i = 0; i < prisms.length; i++) {
			if (prisms[i] != null) {
				sum += prisms[i].getVolume();
			}
		}
		return sum / getPrismCount();
	}

	public int getCylinderCount() {
		int count = 0;

		for (int i = 0; i < prisms.length; i++) {
			if (prisms[i] instanceof Cylinder) {
				count++;
			}
		}
		return count;
	}

}
