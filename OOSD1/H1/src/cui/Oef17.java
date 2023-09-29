package cui;

import java.util.Scanner;

public class Oef17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("geef een prijs in (=kommagetal): ");
		double prijs = scan.nextDouble();
		System.out.print("geef een kortingspecentage in (=geheel getal): ");
		int kortingsPer = scan.nextInt();
		
		
		double korting = prijs - prijs / kortingsPer;
		
		System.out.printf("%f € met %d korting is %f €%n", prijs, kortingsPer, korting);
		System.out.printf("%.2f € met %d korting is %.2f €%n", prijs, kortingsPer, korting);
	}

}
