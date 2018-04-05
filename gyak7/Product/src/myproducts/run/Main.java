package myproducts.run;

import myproducts.Bread;
import myproducts.Product;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("product", 120, 12);
		Bread b1 = new Bread("bread", 134, 23, 0.75);

		System.out.println(p1);
		System.out.println(b1);

		System.out.println("p1 more expensice than b1? " + p1.compareGrossPrice(b1));

		Product p2 = new Bread("bread2", 154, 32, 0.5);
		System.out.println(p2);

		Bread b2 = new Bread("bread2", 152, 23, 0.75);
		System.out.println("b1 unit price is more than b2? " + Bread.compareUnitPrice(b1, b2));

	}

}
