package mybooks.styleenum;

import mybooks.Book;

public class BookWithEnum extends Book {

	private Style style;
	
	public BookWithEnum(String title, String author, int issueYear, int price, Style style) {
		super(title, author, issueYear, price);
		this.style = style;
	}

	public enum Style {
		 SCIFI, COOK, ROMANCE, OTHER
	}
	
	public Style getStyle() {
		return style;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + style;
	}
}
