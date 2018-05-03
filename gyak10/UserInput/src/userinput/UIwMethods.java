package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UIwMethods {

	public static void main(String[] args) {
		int[] a = new int[5];

		// Scanner
		System.out.println("5 number: ");
		ScannerNextInt(a);

		System.out.println("5 number: ");
		ScannerNextLine(a);

		// BufferedReader
		System.out.println("5 number: ");
		try {
			BufferedReaderReadLineIntValue(a);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("5 number: ");
		try {
			BufferedReaderReadLine(a);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void ScannerNextInt(int[] a) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}

	public static void ScannerNextLine(int[] a) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(sc.nextLine());
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}

	public static void BufferedReaderReadLineIntValue(int[] a) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			a[i] = Integer.valueOf(bf.readLine()).intValue();
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}

	public static void BufferedReaderReadLine(int[] a) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			a[i] = Integer.parseInt(bf.readLine());
			if (a[i] < 1) {
				throw new NumberFormatException();
			}
		}
	}

}
