package cui;

import java.util.Scanner;

public class Oef11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een getal  (> 999 en <= 9999) in: ");
		int num = scan.nextInt();
		
		double duizenden = num/1000;
		double honderden = num/100 - num%1000;
		double tienden = num/10;
		double eenheeden = num;
		
		System.out.printf("Het getal bestaat uit:%n%.f duizentallen%n%d hondertallen%n%d tientallen %n%d eenheden", duizenden, honderden, num, num);
	}

}
