package myproducts.run;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import myproducts.Book;

public class BookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// get number of books
		System.out.print("Enter the number of books: ");
		int numberOfBbooks = Integer.parseInt(sc.nextLine());
		Book[] books = new Book[numberOfBbooks];

		// add books to the array
		int i = 0;
		do {
			// addBook(sc, books, i); // get books from console
			addRandomBook(books, i); // add random books (debug)
			i++;
		} while (i < numberOfBbooks);
		sc.close();
		System.out.println();

		sortBooks(books);

		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println();

		String[] authorsWExpBooks = authorsWExpBooks(books);
		for (String s : authorsWExpBooks) {
			System.out.println(s);
		}
		System.out.println();
	}

	private static void addBook(Scanner sc, Book[] books, int i) {
		System.out.print("Custom price? [1/0] ");
		int custom = Integer.parseInt(sc.nextLine());
		if (custom == 1) {
			System.out.print("Enter the author: ");
			String author = sc.nextLine();
			System.out.print("Enter the title: ");
			String title = sc.nextLine();
			System.out.print("Enter the price: ");
			int price = Integer.parseInt(sc.nextLine());
			System.out.print("Enter the number of pages: ");
			int page = Integer.parseInt(sc.nextLine());

			books[i] = new Book(author, title, price, page);
		} else {
			System.out.print("Enter the author: ");
			String author = sc.nextLine();
			System.out.print("Enter the title: ");
			String title = sc.nextLine();
			System.out.print("Enter the number of pages: ");
			int page = Integer.parseInt(sc.nextLine());

			books[i] = new Book(author, title, page);
		}
	}

	// debug code: filling the books array with random book details
	// author, title, price and number of pages
	private static void addRandomBook(Book[] books, int i) {
		String[] a = { "Alfie Richards", "Finlay Fisher", "Blake Gordon", "Joseph James", "Ethan Hunt", "Van Mcclure",
				"Clinton Ramsey", "Roy Montoya", "Aldo Charles", "Lorenzo Holder" };
		String[] t = { "Spy Of Insanity", "Creator Of The Ancestors", "Trees Of Twilight", "Turtles Without Shame",
				"Aliens And Strangers", "Snakes And Robots", "Strife Of The Forest", "Union Of Stone",
				"Controlling The Light", "Chasing The Dark" };
		Random r = new Random();
		books[i] = new Book(a[r.nextInt(a.length)], t[r.nextInt(t.length)], r.nextInt(1000) + 1, r.nextInt(500) + 1);
	}

	private static void sortBooks(Book[] b) {
		Book t;
		for (int i = 0; i < b.length; i++) {
			for (int j = i; j < b.length; j++) {
				if (b[i].getTitle().compareToIgnoreCase(b[j].getTitle()) > 0) {
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
	}

	private static String[] authorsWExpBooks(Book[] b) {
		String[] expBookAuthors = new String[b.length];
		int e = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i].getUnitPrice() > 20.0) {
				expBookAuthors[e++] = b[i].getAuthor();
			}
		}
		expBookAuthors = Arrays.copyOfRange(expBookAuthors, 0, e);
		
		String[] unique = new String[expBookAuthors.length];
		int u = 0;
		for (int i = 0; i < expBookAuthors.length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (expBookAuthors[i] == expBookAuthors[j]) {
					isDistinct = true;
					break;
				}
			}
			if (!isDistinct) {
				unique[u++] = expBookAuthors[i];
			}
		}
		unique = Arrays.copyOfRange(unique, 0, u);
		Arrays.sort(unique);
		return unique;
	}

}