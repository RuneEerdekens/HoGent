package cui;

import java.util.Scanner;

import domein.DomeinController;

public class PersonagesApplicatie {

	private DomeinController dc;

	public PersonagesApplicatie(DomeinController dc) {
		this.dc = dc;
	}

	public void start() {
		int keuze = geefMenu();
		if(keuze == 1) {
			maakCategorie();
		}
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
			System.out.print("maak u keuze: ");
			num = scan.nextInt();
		} while (num != 1);
		return num;

	}
}
