/*
 * K�sz�tsen egy szem�ly oszt�lyt n�v (string) kor(int), fizet�s(int), lakc�m(string), 
 * minim�lb�r (int, ezer) (kezdetben 120) (oszt�lyszint�) adattagokkal.
 * 
 * K�sz�tsen konstruktort az adattagok inicializ�l�s�ra.
 * Legyen met�dusa, amely visszaadja sz�vegesen az �rt�keket.
 * Legyen met�dusa, amely param�terben kapott �rt�kre �ll�tja a minim�lb�rt.
 * Legyen met�dusa, amely param�terk�nt kap k�t szem�lyt, �s azt adja vissza, 
 * amelyiknek nagyobb a fizet�se.
 * Legyen met�dusa, amely megadja, hogy mennyivel t�bb (vagy kevesebb) a fizet�se
 *  a minim�lb�rn�l a szem�lynek.
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
