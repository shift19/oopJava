package employee_b;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setName("John Johnson");
		emp.setSalary(125000);

		System.out.println(emp.getNameSalary());
		emp.increaseSalary(3500);
		System.out.println(emp.getNameSalary());
	}

}
