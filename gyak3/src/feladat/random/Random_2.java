package feladat.random;

public class Random_2 {

	public static void main(String[] args) {
		int[] tomb = new int[10];

		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = (int) (Math.random() * 50) + 1;
		}

		for (int i = tomb.length - 1; i >= 0; i--) {
			System.out.println((i + 1) + " elem: " + tomb[i]);
		}

		int max = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				if (max < tomb[i]) {
					max = tomb[i];
				}
			}
		}

		System.out.println("Legnagyobb páros szám: " + max);
	}

}
