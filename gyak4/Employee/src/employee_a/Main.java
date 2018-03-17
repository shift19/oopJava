package employee_a;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.name = "John Johnson";
		emp.salary = 125000;

		System.out.println(emp.getNameSalary());
		emp.increaseSalary(3500);
		System.out.println(emp.getNameSalary());
	}

}
