package record;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of records: ");
		int count = readInt(sc);

		Record[] records = new Record[count];

		for (int i = 0; i < records.length; i++) {
			System.out.print("Author: ");
			String author = readString(sc);
			System.out.print("Title: ");
			String title = readString(sc);
			System.out.print("Duration (min): ");
			double duration = readDouble(sc);
			records[i] = new Record(author, title, duration);
		}

		int maxIndex = 0;
		for (int i = 0; i < records.length; i++) {
			if (records[maxIndex].isLonger(records[i]) == -1) {
				maxIndex = i;
			}
		}
		System.out.print("Longest record is: ");
		System.out.println(records[maxIndex].getDetails());

		String author = readString(sc);
		for (int i=0; i<records.length;i++){
			if  (records[i].sameAuthor(author)){
				System.out.println(records[i].getDetails());
			}
		}
		
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

}
