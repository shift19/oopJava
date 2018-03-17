package record;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of records: ");
		int count = readInt(sc);

		Record[] records = new Record[count];

		for (int i = 0; i < records.length; i++) {
			addRecord(sc, records, i);
		}
		System.out.println();

		System.out.print("Longest record is: " + records[getLongest(records)].getDetails());
		System.out.println();

		System.out.print("Enter an author: ");
		String author = readString(sc);
		printSameAuthor(records, author);

		sc.close();
	}

	private static int readInt(Scanner sc) {
		return Integer.parseInt(sc.nextLine());
	}

	private static double readDouble(Scanner sc) {
		return Double.parseDouble(sc.nextLine());
	}

	private static String readString(Scanner sc) {
		return sc.nextLine();
	}

	private static void addRecord(Scanner sc, Record[] r, int i) {
		System.out.print("Author: ");
		String author = readString(sc);
		System.out.print("Title: ");
		String title = readString(sc);
		System.out.print("Duration (min): ");
		double duration = readDouble(sc);
		r[i] = new Record(author, title, duration);
	}

	private static int getLongest(Record[] r) {
		int maxIndex = 0;
		for (int i = 0; i < r.length; i++) {
			if (r[maxIndex].isLonger(r[i]) == -1) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	private static void printSameAuthor(Record[] r, String s) {
		for (int i = 0; i < r.length; i++) {
			if (r[i].sameAuthor(s)) {
				System.out.println(r[i].getDetails());
			}
		}
	}
}
