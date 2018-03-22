package rectangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[10];

		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle((int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
		}

		for (int i = 0; i < rectangles.length; i++) {
			System.out.println(rectangles[i].getDetails());
		}

		System.out.println();
		System.out.println("Smallest rectangle: " + rectangles[minRectangleAreaIndex(rectangles)].getDetails());
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rectangle:");
		System.out.print("a = ");
		int a = ReadInt(sc);
		System.out.print("b = ");
		int b = ReadInt(sc);
		Rectangle ownRectangle = new Rectangle(a, b);

		System.out.println(smallerThen(ownRectangle, rectangles) + " rectangle smaller.");
		System.out.println();

		int indexEqual = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if (ownRectangle.getA() == rectangles[i].getA() && ownRectangle.getB() == rectangles[i].getB()) {
				indexEqual = i;
				break;
			}
			indexEqual = -1;
		}
		System.out.println("Rectangle that equal to Own: ");
		if (indexEqual != -1) {
			System.out.println("Rectangle no." + indexEqual + " (" + rectangles[indexEqual].getDetails() + ")");
		} else {
			System.out.println("none");
		}

		sc.close();
	}

	private static int minRectangleAreaIndex(Rectangle[] r) {
		int minIndex = 0;
		for (int i = 0; i < r.length; i++) {
			if (r[minIndex].getArea() > r[i].getArea()) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	private static int ReadInt(Scanner sc) {
		return sc.nextInt();
	}

	private static int smallerThen(Rectangle own, Rectangle[] r) {
		int counter = 0;
		for (int i = 0; i < r.length; i++) {
			if (own.getArea() > r[i].getArea()) {
				counter++;
			}
		}
		return counter;
	}
}
