package cui;

import java.util.Scanner;

public class Oef2_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_25().method1();
	}
	private void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef de teller in van de breuk: ");
		int teller = scan.nextInt();
		System.out.print("Geef de noemer in van de breuk: ");
		int noemer = scan.nextInt();
		
		int breuk = teller/noemer;
		
		System.out.printf("%d/%d = %d%n", teller, noemer, breuk);
		System.out.printf("rest = %d%n%n", teller%noemer);
		
		if(teller%noemer == 0) {
			System.out.printf("vereenvoudigde breuk = %d/1%n", breuk);
		}
	}
}
