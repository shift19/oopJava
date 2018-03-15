package rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(5, 8);
		Rectangle b = new Rectangle(6);
		Rectangle c = a;

		System.out.println(a.getDetails());
		System.out.println(b.getDetails());
		System.out.println(c.getDetails());
		System.out.println();

		a.setRectangle(3, 4);

		System.out.println(a.getDetails());
		System.out.println(b.getDetails());
		System.out.println(c.getDetails());
		System.out.println();

		a.setRectangle(6);
		
		if (a == b) {
			System.out.println("a and b is equal.");
		} else {
			System.out.println("a and b is not equal.");
		}

		if (a == c) {
			System.out.println("a and c is equal.");
		} else {
			System.out.println("a and c is not equal.");
		}
		
		System.out.println("a and b is equal? " + a.isEqual(b));

	}

}
