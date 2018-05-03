package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

	public static void main(String[] args) {
		int[] a = new int[5];

		// Scanner
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("5 number: ");
		for (int i = 0; i < 5; i++) {
			try {
				a[i] = sc.nextInt();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("Error");
				return;
			}
		}
		printArray(a);

		System.out.println("5 number: ");
		sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			try {
				a[i] = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error");
				e.printStackTrace();
				return;
			}
		}
		printArray(a);
		sc.close();

		// BufferedReader
		System.out.println("5 number: ");
		BufferedReader bf;
		bf = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			try {
				a[i] = Integer.valueOf(bf.readLine()).intValue();
			} catch (NumberFormatException e) {
				System.out.println("Error");
				e.printStackTrace();
				return;
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
		printArray(a);

		System.out.println("5 number: ");
		bf = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			try {
				a[i] = Integer.parseInt(bf.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Error");
				e.printStackTrace();
				return;
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}
		printArray(a);
	}

	private static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
