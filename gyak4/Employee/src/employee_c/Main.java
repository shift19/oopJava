package employee_c;

public class Main {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.setName("John");
		emp1.setSalary(125000);

		emp2.setName("Johnson");
		emp2.setSalary(185000);

		System.out.println(emp1.getNameSalary());
		/*
		 * emp1.increaseSalary(3500); System.out.println(emp1.getNameSalary());
		 */
		System.out.println(emp2.getNameSalary());
		/*
		 * emp2.increaseSalary(3500); System.out.println(emp2.getNameSalary());
		 */

		int min = 120000;
		int max = 130000;

		System.out.println(emp1.getName() + "'s salary is in range? " + emp1.getRange(min, max));
		System.out.println(emp2.getName() + "'s  salary is in range? " + emp2.getRange(min, max));

		System.out.println("Tax of Emp1: " + emp1.getTax());
		System.out.println("Tax of Emp2: " + emp2.getTax());

		System.out.println(emp1.getName() + "'s salary gt " + emp2.getName() + "? " + emp1.compareSalary(emp2));
		System.out.println(emp2.getName() + "'s salary gt " + emp2.getName() + "? " + emp2.compareSalary(emp1));
	}
}
