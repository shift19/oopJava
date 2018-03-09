package book_a;

public class Book {
	String author;
	String title;
	int year;
	int price;

	public void increasePrice(int amount) {
		this.price += (int) (price * (amount / 100.0));
	}

	public String getDetails() {
		return author + " " + title + " " + year + " " + price;
	}
}
