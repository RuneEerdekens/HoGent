package cui;

import java.util.Scanner;

import domein.DomeinController;
import domein.Plant;
import dto.PlantDTO;

public class TuincentrumApplicatie 
{
	private final DomeinController dc;
	
	private Scanner input = new Scanner(System.in);

	public TuincentrumApplicatie(DomeinController dc) {
		this.dc = dc;
	}

	public void start() 
	{
		String[] menuKeuzes = {"Toon overzicht alle planten", "Toon overzicht voorradige planten","Voeg plant toe","Geef overzicht per hoogte",  "Geef verkoopwaarde", "Stoppen"};
		int keuze;
		do{
			keuze = maakMenuKeuze(menuKeuzes,"Wat kies je? ");
			switch (keuze) {
			case 1 -> geefPlantenInVoorraad(false);
			case 2 -> geefPlantenInVoorraad(true);
			case 3 -> voegPlantToe();
			case 4 -> maakOverzichtPlantenPerHoogte();
			case 5 -> System.out.printf("De verkoopwaarde van de stock planten in EUR: %.2f%n", dc.bepaalWaardeVerkoop());
			}
		}while (keuze != 6);
			
	}
	
	private int maakMenuKeuze(String[] keuzes, String hoofding) 
	{
		int gemaakteKeuze;
		do {
			System.out.println(hoofding);
			int index = 1;
			for (String text : keuzes) {
				System.out.printf("%d: %s%n", index, text);
				index++;
			}
			System.out.print("Maak je keuze: ");
			gemaakteKeuze = input.nextInt();
		}while(gemaakteKeuze > 6 || gemaakteKeuze < 1);
		return gemaakteKeuze;
	}
	

	private void voegPlantToe()
	{
		
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
	private void maakOverzichtPlantenPerHoogte()
	{
		int[] hoogtes = dc.maakOverzichtPlantenPerHoogte();
		System.out.printf("%20s%20s%20s%n%20d%20d%20d%n", "Kleiner dan 80cm", "80-100cm", "groter dan 1m", hoogtes[0], hoogtes[1], hoogtes[2]);
	}
	
	private void geefPlantenInVoorraad(boolean inVoorraad)
	{
		PlantDTO[] planten = dc.geefAllePlanten(inVoorraad);
		for (PlantDTO p : planten) {
			System.out.printf("%s met code %s, %d cm hoog, kost EUR: %.2f: %d in voorraad%n", p.naam(), p.soortCode(), p.hoogteInCm(), p.prijsInEuro(),p.aantalInVoorraad());
		}
	}
}
