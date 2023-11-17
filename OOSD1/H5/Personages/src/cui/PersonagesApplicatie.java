package cui;

import java.util.List;
import java.util.Scanner;

import domein.DomeinController;
import dto.CategorieDTO;
import dto.PersonageDTO;

public class PersonagesApplicatie {

	private DomeinController dc;

	public PersonagesApplicatie(DomeinController dc) {
		this.dc = dc;
	}

	public void start() {
		int keuze = geefMenu();
		switch (keuze) {
		case 1 -> maakCategorie();
		case 2 -> maakPersonage();
		}
	}
	
	

	private void maakPersonage() {
		Scanner scan = new Scanner(System.in);
		//List<PersonageDTO> personageLijst = dc.geefPersonages();
		
		List<CategorieDTO> categorieën = dc.geefCategorieën();
		for (CategorieDTO categorie : categorieën) {
			System.out.println(categorie.omschrijving());
		}
		System.out.print("kies een categorie: ");
		String catOmschrijving = scan.nextLine();
		dc.selecteerCategorie(catOmschrijving);
		System.out.print("kies een naam voor het nieuwe personage: ");
		dc.registreerPersonage(scan.nextLine());
	}

	private void maakCategorie() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Geef alle gegeven voor de categorie");
		System.out.print("Geef de omschrijving: ");
		String omschrijving = scan.nextLine();

		System.out.print("Geef de kracht: ");
		int kracht = scan.nextInt();

		System.out.print("Geef de snelheid: ");
		double snelheid = scan.nextDouble();

		System.out.print("Geef de lenigheid: ");
		int lenigheid = scan.nextInt();

		dc.maakCategorie(omschrijving, kracht, snelheid, lenigheid);
	}

	private int geefMenu() {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("1. maak categorie");
			System.out.println("2. maak nieuw personage");
			System.out.print("maak u keuze: ");
			num = scan.nextInt();
		} while (num != 1 && num != 2);
		return num;

	}
}
