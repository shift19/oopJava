package employee_date;

import java.time.LocalDate;

public class Employee {

	private static int retiringAge = 65;

	private String name;
	private LocalDate birth;
	private int salary;

	public Employee(String name, int[] birthday, int salary) {
		this.name = name;
		this.birth = LocalDate.of(birthday[0], birthday[1], birthday[2]);
		this.salary = salary;
	}

	public Employee(String name, int[] birthday) {
		this(name, birthday, (LocalDate.now().getYear() - birthday[0]) * 10000);
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

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(int[] birthday) {
		this.birth = LocalDate.of(birthday[0], birthday[1], birthday[2]);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return LocalDate.now().getYear() - birth.getYear();
	}

	public int timeToRetire() {
		int ttr = retiringAge - getAge();
		if (ttr > 0) {
			return ttr;
		} else {
			return 0;
		}
	}

	public String getDetails() {
		return name + ", " + getAge() + " : " + getMonthInHungarian(birth.getMonthValue()) + " "
				+ birth.getDayOfMonth();
	}

	public String getMoreDetails() {
		return name + ", " + getAge() + " : " + getMonthInHungarian(birth.getMonthValue()) + " " + birth.getDayOfMonth()
				+ " " + salary + " [Retire in " + timeToRetire() + " year(s)]";
	}

	public static Employee moreTimeToRetire(Employee e1, Employee e2) {
		if (e1.timeToRetire() > e2.timeToRetire()) {
			return e1;
		} else {
			return e2;
		}
	}

	public String getMonthInHungarian(int i) {
		String[] month = { "", "január", "február", "március", "április", "május", "június", "július", "augusztus",
				"szeptember", "október", "november", "december" };
		return month[i];
	}

}
