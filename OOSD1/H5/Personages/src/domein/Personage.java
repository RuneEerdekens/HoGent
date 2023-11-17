package domein;

public class Personage {

	private String naam;
	private Categorie categorie;


	public Personage(String naam, Categorie categorie) {
		setNaam(naam);
		setCategorie(categorie);
	}
	
	private void setNaam(String naam) {
		this.naam = naam;
	}

	private void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}

	public String getNaam() {
		return naam;
	}

	
}
