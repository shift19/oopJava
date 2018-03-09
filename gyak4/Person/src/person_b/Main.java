package person_b;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();

		p.setName("Name");
		p.setHeight(1.8);
		p.setWeight(75);

		System.out.println(p.getDetails());
	}

}
