package domein;

public class Plant {
	private final String naam;
	private char soortCode;
	private int hoogteInCm, aantalInVoorraad;
	private double prijsEuro;
	private final static int MIN_HOOGTE = 0, MAX_HOOGTE = 400, BTW_PERCENTAGE = 21;

	public Plant(String naam, char soortCode) {
		this(naam, soortCode, 100, 0, 0);
	}

	public Plant(String naam, char soortCode, int hoogetInCm, double prijsEuro, int aantalInVoorraad) {
		controleerNaam(naam);
		this.naam = naam;
		setSoortCode(soortCode);
		setHoogteInCm(hoogetInCm);
		setAantalInVoorraad(aantalInVoorraad);
		setPrijsInEuro(prijsEuro);
	}

	public int getAantalInVoorraad() {
		return aantalInVoorraad;
	}

	public void setAantalInVoorraad(int aantalInVoorraad) {
		if (aantalInVoorraad >= 0) {
			this.aantalInVoorraad = aantalInVoorraad;
		} else {
			throw new IllegalArgumentException("aantal in voorraad moet positief zijn");
		}

	}

	public double getPrijsInEuro() {
		return prijsEuro;
	}

	public void setPrijsInEuro(double prijsEuro) {
		this.prijsEuro = prijsEuro;
	}

	public String getNaam() {
		return naam;
	}

	public char getSoortCode() {
		return soortCode;
	}

	public int getHoogteInCm() {
		return hoogteInCm;
	}

	private void setSoortCode(char soortCode) {
		if (soortCode == 'A' || soortCode == 'B' || soortCode == 'C') {
			this.soortCode = soortCode;
		} else {
			throw new IllegalArgumentException("soortCode moet A, B of C zijn");
		}
	}

	private void setHoogteInCm(int hoogteInCm) {
		if (hoogteInCm > MIN_HOOGTE && hoogteInCm < MAX_HOOGTE) {
			this.hoogteInCm = hoogteInCm;
		} else {
			throw new IllegalArgumentException(
					String.format("geef dse plant een gedlige hoogte tussen %d en %d", MIN_HOOGTE, MAX_HOOGTE));
		}
	}

	public double berekenVerkoopprijs() {
		return this.prijsEuro * (1 + ((double) BTW_PERCENTAGE / 100));
	}

	private void controleerNaam(String naam) {
		if (naam == null || naam.isEmpty() || naam.isBlank()) {
			throw new IllegalArgumentException("naam mag niet leeg of blank zijn");
		}
	}
}
