package products;

public class Product {
	// n�v, nett� �r (eg�sz), �fakulcs (eg�sz, sz�zal�k)
	private String name;
	private int netPrice;
	private int tax;

	public Product(String name, int netPrice, int tax) {
		this.name = name;
		this.netPrice = netPrice;
		this.tax = tax;
	}

	@Override
	public String toString() {
		return name + " " + getGrossPrice();
	}

	public int getGrossPrice() {
		return (int) Math.round(netPrice * (1 + tax / 100.0));
	}

	public void increasePrice(int p) {
		netPrice *= (1 + p / 100);
	}

	public int compareGrossPrice(Product p) {
		// 1-et, ha dr�g�bb
		if (getGrossPrice() > p.getGrossPrice()) {
			return 1;
			// -1-et, ha olcs�bb
		} else if (getGrossPrice() < p.getGrossPrice()) {
			return -1;
		}
		// 0-t, ha azonos �r�ak.
		return 0;
	}

}
