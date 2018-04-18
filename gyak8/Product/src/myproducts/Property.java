package myproducts;

public class Property implements ForSale {
	// ár, devizanem, méret (int), hely (város)
	private int price;
	private String currency;
	private int size;
	private String place;

	public Property(int price, String currency, int size, String place) {
		this.price = price;
		this.currency = currency;
		this.size = size;
		this.place = place;
	}

	public double getSquarePrice() {
		double sPrice = price / (double) size;
		return Math.round(sPrice * 100) / 100.0;
	}

	public void setPriceEur() {
		double excRate = 0.0032;
		this.price = (int) (price * excRate);
		this.currency = "EUR";
	}

	@Override
	public String toString() {
		return price + currency + " " + size + " " + place + " " + getSquarePrice() + currency + "/m2";
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getCurrency() {
		return currency;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
