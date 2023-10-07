package cui;

import java.util.Scanner;

public class Oef2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_22().method1();
	}

	private void method1() {
		Scanner scan = new Scanner(System.in);

		int num;
		int deel2 = 0;
		int deel3 = 0;
		int deel6 = 0;

		do {
			System.out.print("Geef een positief geheel getal in (stoppen met 0): ");
			num = scan.nextInt();
			if(num != 0) {
				if (num % 6 == 0) {
					deel2++;
					deel3++;
					deel6++;
				} else {
					deel2 += num % 2 == 0 ? 1 : 0;
					deel3 += num % 3 == 0 ? 1 : 0;
				}
			}

		} while (num != 0);
		
		System.out.printf(deel2>1?"Er zijn %d getallen deelbaar door 2%n":"Er is %d getal deelbaar door 2%n", deel2);
		System.out.printf(deel3>1?"Er zijn %d getallen deelbaar door 3%n":"Er is %d getal deelbaar door 3%n", deel3);
		System.out.printf(deel6>1?"Er zijn %d getallen deelbaar door 6%n":"Er is %d getal deelbaar door 6%n", deel6);
	}
}
