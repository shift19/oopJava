package book_b;

public class Main {

	public static void main(String[] args) {

		Book book = new Book();

		book.setAuthor("Gardonyi Geza");
		book.setTitle("Egri csillagok");
		book.setPrice(3500);
		book.setYear(1901);

		System.out.println(book.getDetails());
		book.increasePrice(5);
		System.out.println(book.getDetails());
	}

}
