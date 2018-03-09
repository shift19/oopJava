/*
 * 1 és 50 közötti számokból képezzük a Pitagoraszi számhármasokat és írjuk 
 * ki táblázatos formában (megoldás: 20 ilyen számhármas van). 
 * A Pitagoraszi számhármasok egy derékszögû háromszög oldalainak egész mérõszámai, 
 * azaz teljesül rájuk, hogy a2 + b2 = c2 és a < b < c.
 */

package pitagorasz;

public class Pitagorasz {

	public static int MAX = 50;
	
	public static void main(String[] args) {
		
		System.out.format("|  a  |  b  |  c  |\n");
		System.out.format("+-----+-----+-----+\n");

		for (int a = 1; a <= MAX; a++) {
			for (int b = a + 1; b <= MAX; b++) {
				for (int c = b + 1; c <= MAX; c++) {
					if (szamharmas(a, b, c)) {
						System.out.format("| %3d | %3d | %3d |\n", a, b, c);
					}
				}
			}
		}
		
		System.out.format("+-----+-----+-----+\n");
	}

	public static boolean szamharmas(int a, int b, int c) {
		if (a * a + b * b == c * c) {
			return true;
		} else {
			return false;
		}
	}
}
