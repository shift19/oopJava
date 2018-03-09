package person_b;

public class Person {
	private String name;
	private int weight;
	private double height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

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
