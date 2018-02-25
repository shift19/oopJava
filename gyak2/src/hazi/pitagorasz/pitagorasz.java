package hazi.pitagorasz;

public class pitagorasz {

	public static int MAX = 100;

	public static void main(String[] args) {

		for (int a = 1; a < MAX; a++) {
			for (int b = a + 1; b < MAX; b++) {
				if (lnko(a, b) == 1) {
					for (int c = b + 1; c < MAX; c++) {
						if (szamharmas(a, b, c)) {
							System.out.println(a + " " + b + " " + c);
						}
					}
				}
			}
		}
	}

	public static int lnko(int a, int b) {
		int c;
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	public static boolean szamharmas(int a, int b, int c) {
		if (a * a + b * b == c * c) {
			return true;
		} else {
			return false;
		}
	}
}
