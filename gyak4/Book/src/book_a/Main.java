package book_a;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.author = "Gardonyi Geza";
		book.title = "Egri csillagok";
		book.price = 3500;
		book.year = 1901;
		
		System.out.println(book.getDetails());
		book.increasePrice(5);
		System.out.println(book.getDetails());
	}

}
