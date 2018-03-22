package employee_age;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of Employees: ");
		int num = readInt(sc);

		Employee[] emp = new Employee[num];

		int i = 0;
		do {
			addEmployee(sc, emp, i);
			i++;
		} while (i < num);
		System.out.println();

		// Setting static variable
		System.out.println("With retiring age " + Employee.getRetiringAge() + ":");
		printEmployees(emp);
		Employee.setRetiringAge(70);
		System.out.println("With retiring age " + Employee.getRetiringAge() + ":");
		printEmployees(emp);

		// Employees with less then 5 years to retire
		System.out.println();
		System.out.println("Employees with less than 5 years until retirement:");

		for (int f = 0; f < emp.length; f++) {
			if (emp[f].timeToRetire() < 5) {
				System.out.println(emp[f].getDetails());
			}
		}

		// Employees with more time to retire then average
		System.out.println();
		System.out.println("Employees with more time to retire than average: (" + averageAgeToRetire(emp) + ")");

		int averageTimeToRetire = averageAgeToRetire(emp);
		for (int f = 0; f < emp.length; f++) {
			if (emp[f].timeToRetire() > averageTimeToRetire) {
				System.out.println(emp[f].getDetails());
			}
		}

		// Sorting algorithms
		System.out.println();
		System.out.println("Original order:");
		printEmployees(emp); // print Employees
		System.out.println();

		System.out.println("Ascending order:");
		sortAscending(emp); // sort ascending
		printEmployees(emp); // print Employees
		System.out.println();

		System.out.println("Descending order:");
		sortDescending(emp); // sort descending
		printEmployees(emp); // print Employees

	}

	private static String readString(Scanner sc) {
		return sc.nextLine();
	}

	private static int readInt(Scanner sc) {
		return Integer.parseInt(sc.nextLine());
	}

	private static void addEmployee(Scanner sc, Employee[] e, int i) {
		System.out.print("Custom salary? [1/0] ");
		int c = readInt(sc);
		System.out.println();

		if (c == 1) {
			System.out.print("Enter name: ");
			String name = readString(sc);
			System.out.print("Enter age: ");
			int age = readInt(sc);
			System.out.print("Enter salary: ");
			int salary = readInt(sc);

			e[i] = new Employee(name, age, salary);
		} else {
			System.out.print("Enter name: ");
			String name = readString(sc);
			System.out.print("Enter age: ");
			int age = readInt(sc);

			e[i] = new Employee(name, age);
		}
	}

	private static int averageAgeToRetire(Employee[] e) {
		int sum = 0;
		for (int i = 0; i < e.length; i++) {
			sum += e[i].timeToRetire();
		}
		return (int) sum / e.length;
	}

	private static void sortAscending(Employee[] e) {
		for (int i = 0; i < e.length; i++) {
			int min = i;
			for (int j = i; j < e.length; j++) {
				if (e[j].timeToRetire() < e[min].timeToRetire()) {
					min = j;
				}
			}
			swapElements(e, i, min);
		}
	}

	private static void sortDescending(Employee[] e) {
		for (int i = 0; i < e.length; i++) {
			int max = i;
			for (int j = i; j < e.length; j++) {
				if (e[j].timeToRetire() > e[max].timeToRetire()) {
					max = j;
				}
			}
			swapElements(e, i, max);
		}
	}

	private static void swapElements(Employee[] e, int i, int swap) {
		Employee tmp = e[swap];
		e[swap] = e[i];
		e[i] = tmp;
	}

	private static void printEmployees(Employee[] e) {
		for (Employee i : e) {
			System.out.println(i.getDetails());
		}
	}
}
