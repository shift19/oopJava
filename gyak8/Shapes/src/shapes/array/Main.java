package shapes.array;

import java.util.Scanner;

import shapes.Cuboid;
import shapes.Cylinder;
import shapes.Prism;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrismArray prismArray = new PrismArray(5);

		for (int i = 0; i < prismArray.getSize() - 1; i++) {
			System.out.println("Cuboid, Cylinder? [cu/cy]");
			String nl = sc.nextLine();
			if (nl.equals("cu")) {
				addCuboid(sc, prismArray, i);
			} else if (nl.equals("cy")) {
				addCylinder(sc, prismArray, i);
			}
		}

		sc.close();

		Prism p;

		for (int i = 0; i < prismArray.getSize(); i++) {
			p = prismArray.getPrism(i);
			if (p != null)
				System.out.println(p);
		}

		System.out.println("Average volume: " + prismArray.getAverageVolume());

		System.out.println("Cylinders' count: " + prismArray.getCylinderCount());
	}

	public static void addCuboid(Scanner sc, PrismArray pArr, int i) {
		int a, b, height;
		Cuboid c;

		System.out.print("Enter side A: ");
		a = Integer.parseInt(sc.nextLine());

		System.out.print("Enter side B: ");
		b = Integer.parseInt(sc.nextLine());

		System.out.print("Enter height: ");
		height = Integer.parseInt(sc.nextLine());

		System.out.println();

		c = new Cuboid(a, b, height);

		pArr.setPrism(i, c);
	}

	public static void addCylinder(Scanner sc, PrismArray pArr, int i) {
		int radius, height;
		Cylinder c;

		System.out.print("Enter radius: ");
		radius = Integer.parseInt(sc.nextLine());

		System.out.print("Enter height: ");
		height = Integer.parseInt(sc.nextLine());

		System.out.println();

		c = new Cylinder(height, radius);

		pArr.setPrism(i, c);
	}

}
