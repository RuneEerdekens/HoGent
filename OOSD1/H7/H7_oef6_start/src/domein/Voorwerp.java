package domein;

public class Voorwerp {

	private final String naam;
	private double gewicht;
	private int niveau;
	
	private static final int MAX_NIVEAU = 10;
	private static final int MAX_GEWICHT = 1000;
	private static final int MIN_GEWICHT = 0;
	private static final int MIN_NIVEAU = 1;
	
	
	
	
	public Voorwerp(String naam, double gewicht, int niveau) {
		controleerNaam(naam);
		this.naam = naam;
		setGewicht(gewicht);
		setNiveau(niveau);
	}
	
	
	
	
	public Voorwerp(String naam, double gewicht) {
		this(naam, gewicht, MIN_NIVEAU);
	}




	public double getGewicht() {
		return gewicht;
	}

	public int getNiveau() {
		return niveau;
	}

	public String getNaam() {
		return naam;
	}
	
	private void setGewicht(double gewicht) {
		if(gewicht<MIN_GEWICHT || gewicht>=MAX_GEWICHT)
			throw new IllegalArgumentException(String.format("Gewicht is niet binnen bereik"));
			
		this.gewicht = gewicht;
	}
	
	private void setNiveau(int niveau) {
		if(niveau<MIN_NIVEAU || niveau>MAX_NIVEAU)
			throw new IllegalArgumentException(String.format("Niveau is niet binnen bereik"));
			
		this.niveau = niveau;
	}
	
	
	private void controleerNaam(String naam) {
		if(naam == null || naam.isBlank()) {
			throw new IllegalArgumentException(String.format("Geen naam ingegeven"));
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s%s%s%.3f%s%d", "Voorwerp ", getNaam(), " met gewicht ", getGewicht(), " kg uit niveau ", getNiveau());
	}
	
	
	
	
}
