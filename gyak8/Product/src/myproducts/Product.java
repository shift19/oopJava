package myproducts;

public abstract class Product implements ForSale {
	private String name;
	private int price;
	private int tax;
	private String currency;

	public Product(String name, int price, String currency, int tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
		this.currency=currency;
	}
	
	public Product(String name, int price, int tax) {
		this(name, price, "Ft", tax);
	}

	@Override
	public String toString() {
		return name + " " + getGrossPrice();
	}

	public int getGrossPrice() {
		return Math.round(price * (1 + tax / 100));
	}

	public void increasePrice(int p) {
		price *= (1 + p / 100);
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
	
	public abstract double getUnitPrice();

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	

}
