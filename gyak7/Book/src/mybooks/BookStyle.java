package mybooks;

public class BookStyle extends Book {
	private String style;

	public BookStyle(String title, String author, int issueYear, int price, String style) {
		super(title, author, issueYear, price);
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	@Override
	public String toString() {
		return super.toString() + " " + style;
	}

}
