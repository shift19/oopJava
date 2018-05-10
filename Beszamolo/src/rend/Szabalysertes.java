package rend;

public abstract class Szabalysertes {
	private String nev;
	private int alapbirsag;

	public Szabalysertes(String nev, int birsag) {
		this.nev = nev;
		this.alapbirsag = birsag;
	}

	public int getAlapbirsag() {
		return alapbirsag;
	}

	public String getNev() {
		return nev;
	}

	public abstract double getBirsag();

}
