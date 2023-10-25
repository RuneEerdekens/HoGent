package domein;

public class Product {
	
	private String naam;
	private double prijsExclBtw;
	private int btwPercentage, kortingStuksPercentage;
	
	public void Product(String naam, double prijsExclBtw, int btwPercentage, int kortingStuksPercentage) {
		setNaam(naam);
		setPrijsExclBtw(prijsExclBtw);
		setBtwPercentage(btwPercentage);
		setKortingStuksPercentage(kortingStuksPercentage);
	}
	
	public double getPrijsExclBtw() {
		return prijsExclBtw;
	}

	public void setPrijsExclBtw(double prijsExclBtw) {
		this.prijsExclBtw = prijsExclBtw;
	}

	public int getBtwPercentage() {
		return btwPercentage;
	}

	public void setBtwPercentage(int btwPercentage) {
		this.btwPercentage = btwPercentage;
	}

	public int getKortingStuksPercentage() {
		return kortingStuksPercentage;
	}

	public void setKortingStuksPercentage(int kortingStuksPercentage) {
		this.kortingStuksPercentage = kortingStuksPercentage;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}


}
