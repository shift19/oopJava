package pitagorasz;

public class PrimitivPitagorasz {

	public static int MAX = 50;

	public static void main(String[] args) {

		System.out.format("|  a  |  b  |  c  |\n");
		System.out.format("+-----+-----+-----+\n");
		
		for (int a = 1; a < MAX; a++) {
			for (int b = a + 1; b < MAX; b++) {
				if (lnko(a, b) == 1) {
					for (int c = b + 1; c < MAX; c++) {
						if (szamharmas(a, b, c)) {
							System.out.format("| %3d | %3d | %3d |\n", a, b, c);
						}
					}
				}
			}
		}
		System.out.format("+-----+-----+-----+\n");
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