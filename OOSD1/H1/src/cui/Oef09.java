package cui;

import java.util.Scanner;

public class Oef09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("geef maandsalaris in euro: ");
		double sal = scan.nextDouble();
		System.out.printf("Jaarsalaris = %.2f %nvakantiegeld = %.2f%n", sal*12, (sal*12)*0.08);
		scan.close();
	}

}
