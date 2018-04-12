package products;

public class Product {
	// név, nettó ár (egész), áfakulcs (egész, százalék)
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
		return Math.round(netPrice * (1 + tax / 100));
	}

	public void increasePrice(int p) {
		netPrice *= (1 + p / 100);
	}

	public int compareGrossPrice(Product p) {
		// 1-et, ha drágább
		if (getGrossPrice() > p.getGrossPrice()) {
			return 1;
			// -1-et, ha olcsóbb
		} else if (getGrossPrice() < p.getGrossPrice()) {
			return -1;
		}
		// 0-t, ha azonos árúak.
		return 0;
	}

}
