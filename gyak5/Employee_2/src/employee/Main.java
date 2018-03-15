package employee;

public class Main {

	public static void main(String[] args) {

		Employee[] emp = new Employee[5];

		emp[0] = new Employee("John A", 125000);
		emp[1] = new Employee("John B", 135000);
		emp[2] = new Employee("John C");
		emp[3] = new Employee("John D", 105000);
		emp[4] = new Employee("John E", 165000);

		/* Search max salary */
		int maxSalaryIndex = 0;
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].compareSalary(emp[maxSalaryIndex])) {
				maxSalaryIndex = i;
			}
		}
		System.out.println("Max salary: " + emp[maxSalaryIndex].getNameSalary());

		/* Count salary in rage of min, max */
		int min = 100000;
		int max = 1500000;
		int countInRange = 0;
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getRange(min, max)) {
				countInRange++;
			}
		}
		System.out.println("Salary in range: " + countInRange);

		/* Calc average salary */
		int averageSalary = 0;
		for (int i = 0; i < emp.length; i++) {
			averageSalary += emp[i].getSalary();
		}
		averageSalary /= emp.length;
		System.out.println("Average salary: " + averageSalary);

		/* Calc sum of taxes */
		int sumTax = 0;
		for (int i = 0; i < emp.length; i++) {
			sumTax += emp[i].getTax();
		}
		System.out.println("Sum of taxes: " + sumTax);
	}
}
