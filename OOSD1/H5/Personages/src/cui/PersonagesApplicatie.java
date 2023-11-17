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
		while(keuze != 4) {			
			switch (keuze) {
			case 1 -> maakCategorie();
			case 2 -> maakPersonage();
			case 3 -> toonPersonages();
			}
			keuze = geefMenu();
		}
	}
	
	private void toonPersonages(){
		List<PersonageDTO> personageLijst = dc.geefPersonages();
		for (PersonageDTO personage : personageLijst) {
			System.out.println();
			System.out.printf("naam: %s%nomschijving: %s%nkracht: %d%nsnelheid: %.2f%nlenigheid: %d%n", personage.naam(), personage.omschrijving(), personage.kracht(), personage.snelheid(), personage.lenigheid());
		}
	}

	private void maakPersonage() {
		Scanner scan = new Scanner(System.in);
		
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
			System.out.println("3. toon personages");
			System.out.println("4. stop applicatie");
			System.out.print("maak u keuze: ");
			num = scan.nextInt();
		} while (num < 1 || num > 4);
		return num;

	}
}
