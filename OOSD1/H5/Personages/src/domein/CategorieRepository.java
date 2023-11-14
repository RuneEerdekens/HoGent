package domein;

import java.util.ArrayList;
import java.util.List;

public class CategorieRepository {
	private List<Categorie> categorieën;

	public List<Categorie> getCategorieen() {
		return categorieën;
	}

	public CategorieRepository() {
		categorieën = new ArrayList<>();
	}
	
	public void voegToe(Categorie categorie) {
		categorieën.add(categorie);
	}
	
	public Categorie geefCategorie(String omschrijving) {
		for (Categorie categorie : categorieën) {
			if(categorie.getOmschrijving().equals(omschrijving)) {
				return categorie;			
			}
		}
		return null;
	}
}