package book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Title: ");
		String title = sc.nextLine();
		System.out.println("Author: ");
		String author = sc.nextLine();
		
		int year;
		do {
			System.out.println("Issue year: ");
			year = Integer.parseInt(sc.nextLine());
		} while (year < 0);
		
		int price;
		do {
			System.out.println("Price :");
			price = Integer.parseInt(sc.nextLine());
		} while (price < 0);
		System.out.println("Page: ");
		int page = sc.nextInt();
		
		Book b = new Book(title, author, price, page, year);
		
		System.out.println(b);
	}
}