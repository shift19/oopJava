package book;

import java.time.LocalDate;

public class Book {
	private static String publisher = "Móra";

	private String author;
	private String title;
	private int price;
	private int page;
	private final int year;

	public Book(String author, String title, int price, int page, int year) {
		this.author = author;
		this.title = title;
		this.price = price;
		this.page = page;
		this.year = year;

		if (price < 0) {
			throw new NumberFormatException();
		}

		if (year < 0) {
			throw new NumberFormatException();
		}
	}

	public Book(String author, String title, int page) {
		this(author, title, 2500, page, LocalDate.now().getYear());
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getPublisher() {
		return publisher;
	}

	public static void setPublisher(String publisher) {
		Book.publisher = publisher;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void increasePrice(int amount) {
		this.price += (int) (price * (amount / 100.0));
	}

	@Override
	public String toString() {
		return author + ": " + title + " " + year + " " + price + " " + page + " " + publisher;
	}

	public boolean sameTitle(Book b) {
		return title.equalsIgnoreCase(b.getTitle());
	}

	public boolean sameAuthor(Book b) {
		return author.equalsIgnoreCase(b.getAuthor());
	}

	public boolean isEven() {
		return page % 2 == 0;
	}

	public Book isLonger(Book b) {
		if (page > b.page) {
			return this;
		} else {
			return b;
		}
	}
}
