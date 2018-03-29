/*
 * K�sz�tsen egy futtathat� oszt�lyt, ahol l�trehoz egy t�mb�t, �s beolvassa a szem�lyek sz�m�t, 
 * majd a szem�lyek adatait. Ezut�n ki�rja azon szem�ly adatait, akinek a legnagyobb a fizet�se. 
 * Ki�rja azon szem�lyek adatait, akiknek kevesebb a fizet�s�k, mint a minim�lb�r. 
 * M�dos�tsa a minim�lb�rt, �s �gy �rja ki azoknak az adatait, akiknek kevesebb a fizet�s�k, 
 * mint a minim�lb�r.
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
