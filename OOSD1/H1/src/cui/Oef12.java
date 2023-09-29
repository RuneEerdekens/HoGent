package cui;

import java.util.Scanner;

public class Oef12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef de hoogte van de muur in m in: ");
		double hight = scan.nextDouble();
		System.out.print("Geef de breete van de muur in m in: ");
		double width = scan.nextDouble();
		
		double oppMuur = hight * width;
		double oppPapier = 10 * 0.5;
		
		System.out.printf("Het aantal benodigde rollen = %.1f%n", oppMuur/oppPapier);
	}

}
