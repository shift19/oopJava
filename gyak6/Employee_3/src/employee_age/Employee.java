package employee_age;

public class Employee {

	private static int retiringAge = 65;

	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name, int age) {
		this(name, age, age * 10000);
	}

	public static int getRetiringAge() {
		return retiringAge;
	}

	public static void setRetiringAge(int retiringAge) {
		Employee.retiringAge = retiringAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int timeToRetire() {
		int ttr = retiringAge - age;
		if (ttr > 0) {
			return ttr;
		} else {
			return 0;
		}
	}

	public String getDetails() {
		return name + " (" + age + ") " + salary + " [Retire in " + timeToRetire() + " year(s)]";
	}

	public static Employee moreTimeToRetire(Employee e1, Employee e2) {
		if (e1.timeToRetire() > e2.timeToRetire()) {
			return e1;
		} else {
			return e2;
		}
	}

}
