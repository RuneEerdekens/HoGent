package cui;

import java.util.Scanner;

public class Oef11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een getal (> 999 en <= 9999) in: ");
		int num = scan.nextInt();
		
		int duizenttal = (num - (num % 1000));
		int hondertal = (num - (num % 100)) - duizenttal;
		int tiental = (num - (num % 10)) - (duizenttal + hondertal);
		int eenheid = num - (duizenttal + hondertal + tiental);
		
		
		System.out.printf("Het getal bestaat uit:%n%d duizentallen%n%d hondertallen%n%d tientallen %n%d eenheden", duizenttal /1000, hondertal /100, tiental / 10, eenheid);
		scan.close();
	}

}
