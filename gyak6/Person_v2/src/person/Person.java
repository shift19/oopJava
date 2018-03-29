/*
 * Készítsen egy személy osztályt név (string) kor(int), fizetés(int), lakcím(string), 
 * minimálbér (int, ezer) (kezdetben 120) (osztályszintû) adattagokkal.
 * 
 * Készítsen konstruktort az adattagok inicializálására.
 * Legyen metódusa, amely visszaadja szövegesen az értékeket.
 * Legyen metódusa, amely paraméterben kapott értékre állítja a minimálbért.
 * Legyen metódusa, amely paraméterként kap két személyt, és azt adja vissza, 
 * amelyiknek nagyobb a fizetése.
 * Legyen metódusa, amely megadja, hogy mennyivel több (vagy kevesebb) a fizetése
 *  a minimálbérnél a személynek.
 */

package person;

public class Person {
	private static int minimumWage = 120;

	private String name;
	private int age;
	private int wage;
	private String address;

	public Person(String name, int age, String address, int wage) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.wage = wage;
	}

	public static int getMinimumWage() {
		return minimumWage;
	}

	public static void setMinimumWage(int minimumWage) {
		Person.minimumWage = minimumWage;
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

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", wage=" + wage + "]";
	}

	public static Person higherWage(Person p1, Person p2) {
		if (p1.getWage() > p2.getWage()) {
			return p1;
		} else {
			return p2;
		}

	}

	public int wageDifference() {
		return wage - minimumWage;
	}

}
