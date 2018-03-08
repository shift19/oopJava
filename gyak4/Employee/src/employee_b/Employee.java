package employee_b;

public class Employee {

	private String name;
	private int salary;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void increaseSalary(int amount) {
		salary = salary + amount;
	}

	public String getNameSalary() {
		return name + " " + salary;
	}

}
