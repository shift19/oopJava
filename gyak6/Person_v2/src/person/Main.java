/*
 * Készítsen egy futtatható osztályt, ahol létrehoz egy tömböt, és beolvassa a személyek számát, 
 * majd a személyek adatait. Ezután kiírja azon személy adatait, akinek a legnagyobb a fizetése. 
 * Kiírja azon személyek adatait, akiknek kevesebb a fizetésük, mint a minimálbér. 
 * Módosítsa a minimálbért, és így írja ki azoknak az adatait, akiknek kevesebb a fizetésük, 
 * mint a minimálbér.
 */

package person;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Number of Person: ");
		int n = Integer.parseInt(sc.nextLine());
		Person[] p = new Person[n];

		int i = 0;
		do {
			addPerson(sc, p, i);
			i++;
		} while (i < p.length);

		// write person details
		writePerson(p);

		// print wage less then minimun
		System.out.println("Person with wage less than minimum wage " + Person.getMinimumWage());
		personLTMin(p);
		
		Person.setMinimumWage(150); // set wage
		
		// print wage less then minimun
		System.out.println("Person with wage less than minimum wage " + Person.getMinimumWage());
		personLTMin(p);
		
		sc.close();
	}

	private static void addPerson(Scanner sc, Person[] p, int i) {
		// private String name;
		// private int age;
		// private int wage;
		// private String address;
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Age: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("Address: ");
		String address = sc.nextLine();
		System.out.print("Wage: ");
		int wage = Integer.parseInt(sc.nextLine());
		p[i] = new Person(name, age, address, wage);
	}

	private static void writePerson(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].toString());
		}
	}
	
	private static void personLTMin(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].wageDifference() < 0) {
				System.out.println(p[i]);
			}
		}
	}
}
