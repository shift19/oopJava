package feladat.elso;

public class elsofeladat {

	public static void main(String[] args) {
		double wallis = 1;
		double nevezo = 1;
		double szamlalo = 0;

		for (int i = 0; i < 1000; i++) {
			// paros
			if (i % 2 == 0) {
				szamlalo = szamlalo + 2;
			}

			// paratlan
			if (i % 2 == 1) {
				nevezo = nevezo + 2;
			}
			wallis = wallis * (szamlalo * 1.0 / nevezo);
		}
		System.out.println("PI értéke: (Wallis) " + (wallis * 2));

		double liebnitz = 0;
		nevezo = 1;
		szamlalo = 1;
		for (int i = 0; i < 1000; i++) {
			if (i % 2 == 0) {
				liebnitz = liebnitz + (szamlalo * 1.0 / nevezo);
			} else {
				liebnitz = liebnitz - (szamlalo * 1.0 / nevezo);
			}
			nevezo = nevezo + 2;
		}
		System.out.println("PI értéke: (Liebnitz) " + (liebnitz * 4));
	}
}
