package products;

import java.awt.Color;
import colour.Colourable;

public class Pen extends Product implements Colourable {

	String brand;
	Color colour;

	public Pen(String name, int price, int tax, String brand, Color color) {
		super(name, price, tax);
		this.brand = brand;
		this.colour = color;
	}

	@Override
	public String toString() {
		return super.toString() + " " + brand + " " + colour;
	}

	@Override
	public Color getColour() {
		return colour;
	}

	@Override
	public void setColour(Color colour) {
		this.colour = colour;

	}

}