package cui;

import java.util.Scanner;

public class Oef2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_10().method1();
	}

	private void method1() {
		Scanner scan = new Scanner(System.in);
		int num;
		int biggest = 0;
		int smallest = 0;
		double som = 0;
		int i = 0;

		System.out.print("Geef een getal in (0 om te stoppen): ");
		num = scan.nextInt();
		biggest = num > biggest ? num : biggest; // als ingeven nummer (num) groter is dan biggest dan word biggest
													// gelijk gesteld aan num, anders word biggest gelijkgesteld aan
													// biggest en blijft het hetzelvde
		smallest = num < smallest ? num : smallest;
		if (num < 0) {
			som += num;
			i++;
		}
		while (num != 0) {
			System.out.print("Geef een getal in (0 om te stoppen): ");
			num = scan.nextInt();
			biggest = num > biggest ? num : biggest;
			smallest = num < smallest ? num : smallest;
			if (num < 0) {
				som += num;
				i++;
			}
		}

		if (som < 0) {
			System.out.printf("het gemiddelde van alle negatieve getallen is %.1f%n", som / i);
		} else {
			System.out.println("Er werden geen negatieve getallen ingevoerd!");
		}

		if (biggest != 0 || smallest != 0) {
			System.out.printf("Het grootste van alle ingevoerde getallen is %d.%nHet kleinste %d", biggest, smallest);

		} else {
			System.out.println("er werden geen geldige getalen ingevoerd!");
		}
	}
}
