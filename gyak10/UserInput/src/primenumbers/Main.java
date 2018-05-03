package primenumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[5];

		// Scanner
		try {
			ScannerNextInt(a);
		} catch (PrimeNumberException e) {
			e.printStackTrace();
		}
		try {
			ScannerNextLine(a);
		} catch (PrimeNumberException e) {
			e.printStackTrace();
		}

		// BufferedReader
		try {
			BufferedReaderReadLineIntValue(a);
		} catch (PrimeNumberException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			BufferedReaderReadLine(a);
		} catch (PrimeNumberException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void ScannerNextInt(int[] a) throws PrimeNumberException {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			for (int j = 2; j < input; j++) {
				if (input % j == 0) {
					throw new PrimeNumberException();
				}
			}
			a[i] = input;
			if (a[i] < 1) {
				throw new PrimeNumberException();
			}
		}
	}

	public static void ScannerNextLine(int[] a) throws PrimeNumberException {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int input = Integer.parseInt(sc.nextLine());
			for (int j = 2; j < input; j++) {
				if (input % j == 0) {
					throw new PrimeNumberException();
				}
			}
			a[i] = input;
			if (a[i] < 1) {
				throw new PrimeNumberException();
			}
		}
	}

	public static void BufferedReaderReadLineIntValue(int[] a) throws PrimeNumberException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			int input = Integer.valueOf(bf.readLine()).intValue();
			for (int j = 2; j < input; j++) {
				if (input % j == 0) {
					throw new PrimeNumberException();
				}
			}
			a[i] = input;
			if (a[i] < 1) {
				throw new PrimeNumberException();
			}
		}
	}

	public static void BufferedReaderReadLine(int[] a) throws PrimeNumberException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			int input = Integer.parseInt(bf.readLine());
			for (int j = 2; j < input; j++) {
				if (input % j == 0) {
					throw new PrimeNumberException();
				}
			}
			a[i] = input;
			if (a[i] < 1) {
				throw new PrimeNumberException();
			}
		}
	}

}
