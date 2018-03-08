package employee_d;

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
		if (min <= salary && salary <= max) {
			return true;
		} else {
			return false;
		}
	}

	public int getTax() {
		double taxPercent = 16;
		return (int) (salary * (taxPercent / 100));
	}

	public boolean compareSalary(Employee emp) {
		if (salary > emp.getSalary()) {
			return true;
		} else {
			return false;
		}
	}

}
