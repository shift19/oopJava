package products.run;

import java.awt.Color;

import colour.Colourable;
import point.ColouredPoint;
import products.Pen;

public class Main {

	public static void main(String[] args) {
		Colourable colourable = new ColouredPoint(10, 10, Color.BLACK);
		System.out.println(colourable);
		colourable.setColour(Color.BLUE);
		System.out.println(colourable);

		Colourable pen = new Pen("Pen", 1000, 10, "Stylus", Color.BLACK);
		System.out.println(pen);
		pen.setColour(Color.BLUE);
		System.out.println(pen);

		resetColor(colourable);
		System.out.println(colourable);

		resetColor(pen);
		System.out.println(pen);
	}

	public static void resetColor(Colourable o) {
		o.setColour(Colourable.colour);
	}

}
