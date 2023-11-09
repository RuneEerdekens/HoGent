package domein;

public class Auto {
	private boolean elektrisch;
	private double aantalKilometers;
	private int vergoeding;

	public Auto(boolean elektrisch, double aantalKilometers, int vergoeding) {
		setElektrisch(elektrisch);
		setAantalKilometers(aantalKilometers);
		setVergoeding(vergoeding);
	}

	public Auto(double aantalKilometers, int vergoeding) {
		this(true, aantalKilometers, vergoeding);
	}

	public Auto(int vergoeding) {
		this(400.5, vergoeding);
	}

	public double getAantalKilometers() {
		return aantalKilometers;
	}

	public void setAantalKilometers(double aantalKilometers) {
		this.aantalKilometers = aantalKilometers >= 0 && aantalKilometers <= 1000 ? aantalKilometers : 400.5;
	}

	public int getVergoeding() {
		return vergoeding;
	}

	public void setVergoeding(int vergoeding) {
		this.vergoeding = vergoeding > 0 && vergoeding <= 5 ? vergoeding : 2;
	}

	public boolean isElektrisch() {
		return elektrisch;
	}

	public boolean heeftExtraVergoeding() {

		return elektrisch && aantalKilometers <= 400.5;

	}

	public double berekenTotaleVergoeding() {
		double totaal = (1000 - aantalKilometers) * vergoeding;
		if (heeftExtraVergoeding()) {
			return totaal * 2;
		}
		return totaal;
	}

	private void setElektrisch(boolean elektrisch) {
		this.elektrisch = elektrisch;
	}

}
