package cui;

import java.util.Scanner;

public class Oef2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_11().method1();
	}

	private void method1() {
		Scanner scan = new Scanner(System.in);
		int num;
		int num2;

		do {
			System.out.print("strikt negatief oneven getal in: ");
			num = scan.nextInt();
		} while (num % 2 == 0 && num >= 0);

		// -----------------Opdracht 2--------------------

		do {
			System.out.print("geef een getal verschilden van 1000 en niet deelbaar door 12: ");
			num = scan.nextInt();
			System.out.printf("geef een getal dat grooter is dan %d in: ", num);
			num2 = scan.nextInt();
		} while (num < 1000 && num % 12 != 0 && num >= num2);
	}
}
