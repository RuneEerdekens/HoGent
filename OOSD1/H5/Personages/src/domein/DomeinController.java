package domein;

import java.util.ArrayList;
import java.util.List;

import dto.CategorieDTO;
import dto.PersonageDTO;

public class DomeinController {
	private CategorieRepository categorieRepo;
	private PersonageRepository personageRepo;
	private Categorie selectedCat;
	private Personage newPersonage;

	
	private void setNewPersonage(Personage newPersonage) {
		this.newPersonage = newPersonage;
	}
	
	public DomeinController() {
		categorieRepo = new CategorieRepository();
		personageRepo = new PersonageRepository();
	}

	public void maakCategorie(String omschrijving, int kracht, double snelheid, int lenigheid) {
		categorieRepo.voegToe(new Categorie(omschrijving, kracht, snelheid, lenigheid));
	}
	public List<PersonageDTO> geefPersonages(){
		List<Personage> personages = personageRepo.getPersonages();
		List<PersonageDTO> personageDTOs = new ArrayList<>();
		for (Personage personage : personages) {
			Categorie c = personage.getCategorie();
			personageDTOs.add(new PersonageDTO(personage.getNaam(), personage.getCategorie().getOmschrijving(), c.getKracht(),c.getSnelheid(), c.getLenigheid()));
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
	
	public void registreerPersonage(String naam) {
		setNewPersonage(new Personage(naam, selectedCat));
		personageRepo.voegToe(newPersonage);
	}
	
	public PersonageDTO geefPersonage() {
		Categorie c = newPersonage.getCategorie();
		return new PersonageDTO(newPersonage.getNaam(), c.getOmschrijving(), c.getKracht(), c.getSnelheid(), c.getLenigheid());
	}
	
}