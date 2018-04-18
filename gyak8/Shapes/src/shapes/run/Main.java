package shapes.run;

import shapes.Cylinder;
import shapes.Cuboid;

public class Main {

	public static void main(String[] args) {

		Cylinder cylinder = new Cylinder(5, 5);
		System.out.println(cylinder);
		System.out.println("Cylinder's volume: " + cylinder.getVolume());

		Cuboid cuboid = new Cuboid(5, 5, 5);
		System.out.println(cuboid);
		System.out.println("Cuboid's volume: " + cuboid.getVolume());

		if (cylinder.biggerPrism(cuboid)) {
			System.out.println("The cylinder is bigger.");
		} else {
			System.out.println("The cuboid is bigger.");
		}
	}
}
