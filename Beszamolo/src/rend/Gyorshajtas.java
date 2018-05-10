package rend;

import java.time.LocalDate;

public class Gyorshajtas extends Szabalysertes {
	private int tullepes;
	private LocalDate datum;
	
	/*
	public Gyorshajtas(String nev, int birsag, int tullepes) {
		super(nev, birsag);
		this.tullepes = tullepes;
	}
	 */
	
	public Gyorshajtas(String nev, int birsag, int tullepes) {
		super(nev, birsag);
		this.tullepes = tullepes;
		this.datum = LocalDate.now();
	}
	
	@Override
	public double getBirsag() {
		return getAlapbirsag() * (tullepes / 100.0 + 1);
	}
	
	/*
	@Override
	public String toString() {
		return "Nev: " + getNev() + " Birsag: " + getBirsag();
	}
	*/
	
	public LocalDate getDatum() {
		return datum;
	}
	
	@Override
	public String toString() {
		return "Nev: " + getNev() + " Birsag: " + getBirsag() + " Datum: " + datum;
	}

	public boolean compareBirsag(Gyorshajtas gy) {
		return this.getBirsag() > gy.getBirsag();
	}

}
