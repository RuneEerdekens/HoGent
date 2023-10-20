package cui;

import java.util.Scanner;
import domein.*;

public class VormApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VormApplicatie va = new VormApplicatie();
		va.start();
	}
	
	private void start() {
		int aantalVormen = 0, aantalGroteRechthoeken = 0,aantalRechthoekigeDriehoeken = 0;
		
		int num = geeftGetalIn();
		while(num != 0) {
			aantalVormen++;
			if(num ==1) {
				Rechthoek r = geefEenRechthoekIn();
				if(r.berekenOppervlakte() > 50) {
					aantalGroteRechthoeken++;
				}
			}else{
				if(geefEenDriehoekIn().isRechthoekig()) {
					aantalRechthoekigeDriehoeken++;
				}
			}
			
			num = geeftGetalIn();
		}
		
		System.out.println("Overzicht vormen: ");
		System.out.printf("Totaal aantal vormen: %d%n", aantalVormen);
		System.out.printf("Aantal grote rechthoeken: %d%n", aantalGroteRechthoeken);
		System.out.printf("Aantal rechthoekige driehoeken: %d%n", aantalRechthoekigeDriehoeken);
	}
	
	
	private int geeftGetalIn() {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.print("Wil je nog een vorm ingeven (0=stop, 1=rechthoek, 2=driehoek): ");
			num = scan.nextInt();
		} while(num > 2 || num < 0);
		
		return num;

	}
	
	private Rechthoek geefEenRechthoekIn() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Geef de lengte van de rechthoek: ");
		double lengte = scan.nextDouble();
		System.out.print("Geef de lengte van de rechthoek: ");
		double breedte = scan.nextDouble();
		
		return new Rechthoek(lengte, breedte);

		
		
	}
	
	private Driehoek geefEenDriehoekIn() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef lengte A in: ");
		int a = scan.nextInt();
		System.out.print("Geef lengte B in: ");
		int b = scan.nextInt();
		System.out.print("Geef lengte C in: ");
		int c = scan.nextInt();
		
		return new Driehoek(a, b, c);

	}

}
