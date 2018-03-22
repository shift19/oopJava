package book;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// get number of books
		System.out.print("Enter the number of books: ");
		int numberOfBbooks = readInt(sc);
		Book[] books = new Book[numberOfBbooks];

		// add books to the array
		int i = 0;
		do {
			addBook(sc, books, i); // get books from console
			//addRandomBook(books, i); // add random books (debug)
			i++;
		} while (i < numberOfBbooks);
		sc.close();
		System.out.println();

		// print longest book
		System.out.println("The longest book is " + longestBook(books).getDetails());
		System.out.println();

		// print longest even book
		System.out.println("The longest even book is " + longestBook(getEvenBooks(books)).getDetails());
		System.out.println();

		// count and print number of books for each entered author
		printBooksPerAuthor(books);
	}

	private static String readString(Scanner sc) {
		return sc.nextLine();
	}

	private static int readInt(Scanner sc) {
		return Integer.parseInt(sc.nextLine());
	}

	private static void addBook(Scanner sc, Book[] books, int i) {
		System.out.print("Custom price? [1/0] ");
		int custom = readInt(sc);
		if (custom == 1) {
			System.out.print("Enter the author: ");
			String author = readString(sc);
			System.out.print("Enter the title: ");
			String title = readString(sc);
			System.out.print("Enter the price: ");
			int price = readInt(sc);
			System.out.print("Enter the number of pages: ");
			int page = readInt(sc);

			books[i] = new Book(author, title, price, page);
		} else {
			System.out.print("Enter the author: ");
			String author = readString(sc);
			System.out.print("Enter the title: ");
			String title = readString(sc);
			System.out.print("Enter the number of pages: ");
			int page = readInt(sc);

			books[i] = new Book(author, title, page);
		}
	}

	private static Book longestBook(Book[] b) {
		int longest = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[longest].getPage() < b[i].getPage()) {
				longest = i;
			}
		}
		return b[longest];
	}

	private static Book[] getEvenBooks(Book[] b) {
		int counter = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i].isEven()) {
				counter++;
			}
		}
		Book[] even = new Book[counter];
		counter = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i].isEven()) {
				even[counter++] = b[i];
			}
		}
		return even;
	}

	private static void printBooksPerAuthor(Book[] b) {
		int counter = 0;
		for (int i = 0; i < b.length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (b[j].sameAuthor(b[i])) {
					isDistinct = true;
					break;
				}
			}
			if (!isDistinct) {
				counter++;
			}
		}
		String[] a = new String[counter];
		counter = 0;
		for (int i = 0; i < b.length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (b[j].sameAuthor(b[i])) {
					isDistinct = true;
					break;
				}
			}
			if (!isDistinct) {
				a[counter++] = b[i].getAuthor();
			}
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			counter = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j].getAuthor())) {
					counter++;
				}
			}
			System.out.println(a[i] + " has " + counter + " books.");
		}
	}

	// debug code: filling the books array with random book details
	// author and number of pages
	private static void addRandomBook(Book[] books, int i) {
		String[] a = { "Antal J", "Béci H", "Cecli F", "Dénes A", "Elemér A", "Flórián B", "Gergely H" };
		Random r = new Random();
		books[i] = new Book(a[r.nextInt(a.length)], "random title", r.nextInt(700));
	}
}