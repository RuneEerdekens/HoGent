package domein;

public class Categorie {
	private String omschrijving;

	private int kracht;
	private double snelheid;
	private int lenigheid;

	public Categorie(String omschrijving, int kracht, double snelheid, int lenigheid) {
		setOmschrijving(omschrijving);
		setKracht(kracht);
		setSnelheid(snelheid);
		setLenigheid(lenigheid);
	}

	public String getOmschrijving() {
		return omschrijving;
	}
	
	private void setOmschrijving(String omschrijving) {
		if (omschrijving == null || omschrijving.isBlank()|| omschrijving.length() > 100) {
			this.omschrijving = "anoniem";
		}else {
			this.omschrijving = omschrijving;
		}
	
	}

	private void setKracht(int kracht) {
		this.kracht = kracht >= 1 && kracht <= 10 ? kracht : 1;
	}

	private void setSnelheid(double snelheid) {
		this.snelheid = snelheid > 0 ? snelheid : 1;
	}

	private void setLenigheid(int lenigheid) {
		this.lenigheid = lenigheid >= 1 && lenigheid <= 5 ? lenigheid : 1;
	}
}