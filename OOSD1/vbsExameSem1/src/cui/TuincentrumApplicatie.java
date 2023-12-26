package cui;

import dto.PlantDTO;

import java.util.Scanner;

import domein.DomeinController;
import domein.Plant;

public class TuincentrumApplicatie {
	private final DomeinController dc;

	private Scanner input = new Scanner(System.in);

	public TuincentrumApplicatie(DomeinController dc) {
		this.dc = dc;
	}

	public void start() {
		String[] menuKeuzes = { "Toon overzicht alle planten", "Toon overzicht voorradige planten", "Voeg plant toe",
				"Geef overzicht per hoogte", "Geef verkoopwaarde", "Stoppen" };
		int keuze;
		do {
			keuze = maakMenuKeuze(menuKeuzes, "Wat kies je? ");
			switch (keuze) {
			case 1 -> geefPlantenInVoorraad(false);
			case 2 -> geefPlantenInVoorraad(true);
			case 3 -> voegPlantToe();
			case 4 -> maakOverzichtPlantenPerHoogte();
			case 5 -> System.out.printf("De verkoopwaarde van de stock in EUR: %.2f%n", dc.bepaalWaardeVerkoop());
			}
		} while (keuze != 6);

	}

	private int maakMenuKeuze(String[] keuzes, String hoofding) {
		int keuze;

		do {
			System.out.printf("%n%s%n", hoofding);
			int i = 1;
			for (String text : keuzes) {
				System.out.printf("%d %s%n", i, text);
				i++;
			}
			System.out.print("Jouw keuze: ");
			keuze = input.nextInt();
		} while (keuze < 1 || keuze > 6);

		return keuze;
	}

	private void voegPlantToe() {
		System.out.print("Geef de naam: ");
		String naam = input.next();
		System.out.print("Geef de soortcode (A, B of C): ");
		char code = input.next().charAt(0);
		System.out.print("Geef de hoogte in cm: ");
		int hoogte = input.nextInt();
		System.out.print("geef de prijs in EUR: ");
		double prijs = input.nextDouble();
		System.out.print("Hoeveelheid in voorraad? ");
		int voorraad = input.nextInt();

		dc.voegPlantToe(naam, code, hoogte, prijs, voorraad);
	}

	// Bepaal aantal planten tss 0-80cm, 80cm-1m, groter dan 1 m
	private void maakOverzichtPlantenPerHoogte() {
		int[] aantalPerHoogte = dc.maakOverzichtPlantenPerHoogte();
		System.out.println("\nKleiner dan 80 cm\t\t80-100cm\t   groter dan 1 m");
		System.out.printf("\t\t%d\t\t\t%d\t\t\t%d\n", aantalPerHoogte[0], aantalPerHoogte[1], aantalPerHoogte[2]);
	}

	private void geefPlantenInVoorraad(boolean inVoorraad) {
		PlantDTO[] planten = dc.geefAllePlanten(inVoorraad);

		for (PlantDTO p : planten) {
			System.out.printf("%s met code %s, %d cm hoog, kost EUR %.2f: %d in voorraad\n", p.naam(), p.soortCode(),
					p.hoogteInCm(), p.prijs(), p.aantalInVoorraad());
		}
	}

}
