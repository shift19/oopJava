package person_a;

public class Person {
	String name;
	int weight;
	double height;

	public double getBMI() {
		double BMI = weight / (height * height);
		return Math.round(BMI * 100) / 100.0;
	}

	public String getCategory() {
		if (getBMI() < 18.5) {
			return "Underweight";
		} else if (getBMI() > 25) {
			return "Overweight";
		} else {
			return "Normal";
		}
	}

	public String getDetails() {
		return name + ", " + weight + ", " + height + ", " + getBMI() + ": " + getCategory();
	}
}
