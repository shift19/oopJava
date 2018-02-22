package feladat.negyedik;

public class negyedikfeladat {

	public static void main(String[] args) {
		int[] szamok = new int[] { 45, 3, 4, 10, 15, 25, 78, 4, 5, 7 };

	}

	public static int linearis(int keresett, int[] szamok) {
		int index = 0;
		for (int szam : szamok) {
			if (szam == keresett) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public static void rendezes(int[] szamok) {
		for (int i = 0; i < szamok.length; i++) {
			int min = i;
			for (int j = i; j < szamok.length; j++) {
				if (szamok[i] < szamok[min]) {
					min = j;
				}
			}
			int seged = szamok[min];
			szamok[min] = szamok[i];
			szamok[i] = seged;
		}
	}

	public static int binaris(int keresett, int[] szamok){
		int E=0;
		int U=szamok.length -1;
		while(E <= U){
			int K=E+(U-E)/2;
			 //.............
		}
	 //.............
		return -1;
	}
}
