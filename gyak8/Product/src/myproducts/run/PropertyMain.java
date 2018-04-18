package myproducts.run;

import myproducts.ForSale;
import myproducts.Property;

public class PropertyMain {

	public static void main(String[] args) {
		ForSale property = new Property(5000000, "Ft", 300, "Miskolc");
		System.out.println(property);
		((Property) property).setPriceEur();
		System.out.println(property);
	}

}
