package domein;

public class Plant {
	private final String naam;
	private char soortCode;
	private int hoogteInCm, aantalInVoorraad;
	private double prijsInEuro;
	private final static int MIN_HOOGTE = 0, MAX_HOOGTE = 400, BTW_PERCENTAGE = 21;

	public Plant(String naam, char soortCode, int hoogteInCm, double prijsInEuro, int aantalInVoorraad) {
		controleerNaam(naam);
		this.naam = naam;
		setSoortCode(soortCode);
		setHoogteInCm(hoogteInCm);
		setAantalInVoorraad(aantalInVoorraad);
		setPrijsInEuro(prijsInEuro);
		
	}
	
	public Plant(String naam, char soortCode) {
		this(naam, soortCode, 100, 0, 0);
	}

	public char getSoortCode() {
		return soortCode;
	}

	
	private void setSoortCode(char soortCode) {
		if(soortCode != 'A' && soortCode != 'B' && soortCode != 'C') {
			throw new IllegalArgumentException("geef geldige soortCode");
		}
		this.soortCode = soortCode;
	}

	public int getHoogteInCm() {
		return hoogteInCm;
	}

	private void setHoogteInCm(int hoogteInCm) {
		if(hoogteInCm <= MIN_HOOGTE || hoogteInCm > MAX_HOOGTE) {
			throw new IllegalArgumentException(String.format("geef een geldige hoogte in, moet tussen %d en %d vallen", MIN_HOOGTE, MAX_HOOGTE));
		}
		this.hoogteInCm = hoogteInCm;
	}

	public int getAantalInVoorraad() {
		return aantalInVoorraad;
	}

	public void setAantalInVoorraad(int aantalInVoorraad) {
		if(aantalInVoorraad < 0) {
			throw new IllegalArgumentException("Geef een geldig aantal in voorraad");
		}
		this.aantalInVoorraad = aantalInVoorraad;
	}

	public double getPrijsInEuro() {
		return prijsInEuro;
	}

	public void setPrijsInEuro(double prijsInEuro) {
		this.prijsInEuro = prijsInEuro;
	}

	public String getNaam() {
		return naam;
	}
	
	public double berekenVerkoopprijs() {
		return prijsInEuro * (1 + ((double)BTW_PERCENTAGE/100));
	}
	
	private void controleerNaam(String naam) {
		
		if(naam == null || naam.isEmpty() || naam.isBlank()) {
			throw new IllegalArgumentException("geef een geldige naam in");
		}
		
	}

}
