package employee_a;

public class Employee {

	protected String name;
	protected int salary;

	public void increaseSalary(int amount) {
		salary = salary + amount;
	}

	public String getNameSalary() {
		return name + " " + salary;
	}

}
