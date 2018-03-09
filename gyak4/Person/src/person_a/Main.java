package person_a;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();

		p.name = "Name";
		p.height = 1.8;
		p.weight = 75;
		
		System.out.println(p.getDetails());
	}

}
