package book;

import java.time.LocalDate;

public class Book {
	private String author;
	private String title;
	private int year;
	private int price;

	public Book(String author, String title, int price, int year) {
		this.author = author;
		this.title = title;
		this.price = price;
		this.year = year;
	}

	public Book(String author, String title) {
		this(author, title, 2500, LocalDate.now().getYear());
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

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void increasePrice(int amount) {
		this.price += (int) (price * (amount / 100.0));
	}

	public String getDetails() {
		return author + " " + title + " " + year + " " + price;
	}

	public boolean sameTitle(Book b) {
		return title.equalsIgnoreCase(b.getTitle());
	}
}
