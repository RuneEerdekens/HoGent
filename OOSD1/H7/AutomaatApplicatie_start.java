package cui;

import domein.Grijpkraan;
import domein.KauwgomAutomaat;

public class AutomaatApplicatie_start 
{
	public static void main(String[] args)
	{
		String resultaat;
		boolean gelukt;
		int aantalKeer = 10;
		
		KauwgomAutomaat k1 = new KauwgomAutomaat(200);	
		
		// 10 keer KauwgomAutomaat
		System.out.printf("%d keer aan de hendel draaien van een %s met %d ballen%n", aantalKeer, k1.getClass().getSimpleName().toLowerCase(), k1.getAantalItems());
		draaiNKeer(k1, aantalKeer, true);

		// 10 keer Grijpkraan
		Grijpkraan g1 = new Grijpkraan(20);
		System.out.printf("%d keer aan de hendel draaien van een %s met %d ballen%n", aantalKeer, g1.getClass().getSimpleName().toLowerCase(), g1.getAantalItems());
		draaiNKeer(g1, aantalKeer);
		
		// zonder betalen
		gelukt = k1.draaiHendel();
		resultaat = gelukt ? "ge" : "mis";
		System.out.printf("Zonder te betalen... %slukt%n%n", resultaat);
		
		// munt teruggenomen
		k1.betaal();
		k1.neemMuntTerug();
		gelukt = k1.draaiHendel();
		resultaat = gelukt ? "ge" : "mis";
		System.out.printf("Munt teruggenomen... %slukt%n%n", resultaat);	
		
		// 2 keer zonder kauwgom er uit te nemen na eerste keer
		aantalKeer = 2;
		System.out.printf("%d pogingen, maar vergeten item er uit te nemen na de eerste...%n", aantalKeer);
		draaiNKeer(k1, aantalKeer, false);
		
		// 2 keer terwijl er maar 1 kauwgom meer in zit
		System.out.println("En als alle items op zijn...");
		KauwgomAutomaat k2 = new KauwgomAutomaat(1);
		draaiNKeer(k2, 2, true);
	}
	
	private static void draaiNKeer(KauwgomAutomaat k, int n, boolean neem)
	{
		boolean gelukt;
		
		
		
		
		
		System.out.println();
	}

	private static void draaiNKeer(Grijpkraan g, int n)
	{
		boolean gelukt;
		String resultaat; 
		
		
		
		
		System.out.println();
	}
}	