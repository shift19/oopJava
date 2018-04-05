package mybooks.run;

import java.util.Scanner;

import mybooks.BookStyle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("The amount of books: ");
		int n = Integer.parseInt(sc.nextLine());
		BookStyle[] books = new BookStyle[n];

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
			String style = sc.nextLine();
			books[i] = new BookStyle(title, author, issueYear, price, style);
		}

		int diffStyle = 0;
		for (int i = 0; i < books.length; i++) {
			for (int j = i + 1; j < books.length; j++) {

				if (books[i].getStyle().equalsIgnoreCase(books[j].getStyle())) {
					diffStyle++;
				}

			}
		}
		System.out.println("Different Style: " + diffStyle);

		double avgPriceScifi = 0;
		double scifiAmount = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getStyle().equalsIgnoreCase("Scifi")) {
				System.out.println(books[i]);
				avgPriceScifi += books[i].getPrice();
				scifiAmount++;
			}
		}
		avgPriceScifi = avgPriceScifi / scifiAmount;
		System.out.println("Average Sci-fi Price: " + avgPriceScifi);

		sc.close();
	}
}
