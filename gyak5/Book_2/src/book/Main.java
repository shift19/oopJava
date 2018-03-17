package book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int number_of_books = 2;
		Book[] books = new Book[number_of_books];

		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
			addBook(sc, books, i);
			i++;
		} while (i < number_of_books);

		System.out.println("Book 1 has the same title as Book 2? " + books[0].sameTitle(books[1]));
	}

	private static String readString(Scanner sc) {
		return sc.nextLine();
	}

	private static int readInt(Scanner sc) {
		return Integer.parseInt(sc.nextLine());
	}

	private static void addBook(Scanner sc, Book[] books, int i) {
		System.out.print("Custom price and year? [1/0] ");
		int custom = readInt(sc);
		if (custom == 1) {
			System.out.print("Enter the author: ");
			String author = readString(sc);
			System.out.print("Enter the title: ");
			String title = readString(sc);
			System.out.print("Enter the price: ");
			int price = readInt(sc);
			System.out.print("Enter the release year: ");
			int year = readInt(sc);

			books[i] = new Book(author, title, price, year);
		} else {
			System.out.print("Enter the author: ");
			String author = readString(sc);
			System.out.print("Enter the title: ");
			String title = readString(sc);

			books[i] = new Book(author, title);
		}
	}

}
