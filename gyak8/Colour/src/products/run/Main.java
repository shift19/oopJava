package products.run;

import java.awt.Color;

import colour.Colourable;
import point.ColouredPoint;

public class Main {

	public static void main(String[] args) {
		Colourable colourable = new ColouredPoint(10, 10, Color.BLACK);
	
		System.out.println(colourable);

	}

}
