package mybooks.styleenum;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import mybooks.Book;
import mybooks.styleenum.BookWithEnum;
import mybooks.styleenum.BookWithEnum.Style;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("The amount of books: ");
		int n = Integer.parseInt(sc.nextLine());
		BookWithEnum[] books = new BookWithEnum[n];

		for (int i = 0; i < books.length; i++) {
			System.out.println("Title:");
			String title = sc.nextLine();
			System.out.println("Author:");
			String author = sc.nextLine();
			System.out.println("Issue year:");
			int issueYear = Integer.parseInt(sc.nextLine());
			System.out.println("Price: ");
			int price = Integer.parseInt(sc.nextLine());
			System.out.println("Style: ");
			String styleString = sc.nextLine();
			books[i] = new BookWithEnum(title, author, issueYear, price, Style.valueOf(styleString.toUpperCase()));
		}

		printBooks(books);
		System.out.println();

		printBooks(BooksWithSameStyle(books, Style.COOK));
		System.out.println();
		sc.close();
	}

	public static void printBooks(Book[] b) {
		for (Book book : b) {
			System.out.println(book);
		}
	}

	public static BookWithEnum[] BooksWithSameStyle(BookWithEnum[] b, Style s) {
		BookWithEnum[] same = new BookWithEnum[b.length];
		int s_id = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i].getStyle() == s) {
				same[s_id++] = b[i];
			}
		}
		same = Arrays.copyOfRange(same, 0, s_id);
		return same;
	}
}
