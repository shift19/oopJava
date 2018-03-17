package employee_c;

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

	public boolean getRange(int min, int max) {
		return min <= salary && salary <= max;
	}

	public int getTax() {
		double taxPercent = 16;
		return (int) (salary * (taxPercent / 100));
	}

	public boolean compareSalary(Employee emp) {
		return salary > emp.getSalary();
	}

}
