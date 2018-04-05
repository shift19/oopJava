package myproducts;

public class Bread extends Product {

	private double quantity;

	public Bread(String name, int netPrice, int vat, double quantity) {
		super(name, netPrice, vat);
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getUnitPrice();
	}

	public double getQuantity() {
		return quantity;
	}

	public int getUnitPrice() {
		return (int) Math.round(getGrossPrice() / quantity);
	}

	public static boolean compareUnitPrice(Bread b1, Bread b2) {
		return b1.getUnitPrice() > b2.getUnitPrice();
	}

}
