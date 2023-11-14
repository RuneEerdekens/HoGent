package domein;

import java.util.ArrayList;
import java.util.List;

import dto.CategorieDTO;
import dto.PersonageDTO;

public class DomeinController {
	private CategorieRepository categorieRepo;
	private PersonageRepository personageRepo;
	private Categorie selectedCat;

	public DomeinController() {
		categorieRepo = new CategorieRepository();
	}

	public void maakCategorie(String omschrijving, int kracht, double snelheid, int lenigheid) {
		categorieRepo.voegToe(new Categorie(omschrijving, kracht, snelheid, lenigheid));
	}
	public List<PersonageDTO> geefPersonages(){
		List<Personage> personages = personageRepo.getPersonages();
		List<PersonageDTO> personageDTOs = new ArrayList<>();
		for (Personage personage : personages) {
			personageDTOs.add(new PersonageDTO(personage.getNaam(), personage.getCategorie().getOmschrijving()));
		}
		return personageDTOs;
	}
	
	public List<CategorieDTO> geefCategorieën(){
		List<Categorie> categorieën = categorieRepo.getCategorieen();
		List<CategorieDTO> categorieDTOs = new ArrayList<>();
		for (Categorie categorie : categorieën) {
			categorieDTOs.add(new CategorieDTO(categorie.getOmschrijving()));
		}
		return categorieDTOs;
	}
	
	public void selecteerCategorie(String omschrijving) {
		selectedCat = categorieRepo.geefCategorie(omschrijving);
	}
	
}