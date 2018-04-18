package myproducts;

import java.time.LocalDate;

public class Book extends Product {
	private static String publisher = "Móra";

	private String author;
	private String title;
	// private int price;
	private int page;
	private final int year;

	public Book(String author, String title, int price, int page) {
		super("Book", price, 27);
		this.author = author;
		this.title = title;
		// this.price = price;
		this.page = page;
		this.year = LocalDate.now().getYear();
	}

	public Book(String author, String title, int page) {
		this(author, title, 2500, page);
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

	@Override
	public String toString() {
		return author + ": " + title + " " + year + " " + getGrossPrice() + getCurrency() + " " + page + " "
				+ getUnitPrice() + getCurrency() + "/page";
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

	@Override
	public double getUnitPrice() {
		double uPrice = getGrossPrice() / (double) page;
		return Math.round(uPrice * 100) / 100.0;
	}
}
