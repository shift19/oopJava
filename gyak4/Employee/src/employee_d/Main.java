package employee_d;

public class Main {

	public static void main(String[] args) {

		Employee[] emp = new Employee[5];

		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
		}

		emp[0].setName("John A");
		emp[1].setName("John B");
		emp[2].setName("John C");
		emp[3].setName("John D");
		emp[4].setName("John E");

		emp[0].setSalary(125000);
		emp[1].setSalary(135000);
		emp[2].setSalary(155000);
		emp[3].setSalary(105000);
		emp[4].setSalary(165000);

		int maxSalaryIndex = 0;
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].compareSalary(emp[maxSalaryIndex])) {
				maxSalaryIndex = i;
			}
		}
		System.out.println("Max salary: " + emp[maxSalaryIndex].getNameSalary());

		int min = 100000;
		int max = 1500000;
		int countInRange = 0;
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getRange(min, max)) {
				countInRange++;
			}
		}
		System.out.println("Salary in range: " + countInRange);
		
	}
}
