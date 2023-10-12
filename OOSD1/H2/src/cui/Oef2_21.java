package cui;

import java.util.Scanner;

public class Oef2_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_21().method1();
	}

	private void method1() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een strikt positief geheel getal in: ");
		int num = scan.nextInt();
		int deeler = 1;
		if (num > 0) {
			System.out.print("de deelers zijn:");

			while (deeler <= num) {
				if (num % deeler == 0) {
					System.out.printf(deeler == num ? "en %d%n" : " %d ", deeler);
				}
				deeler++;
			}
		}
	}
}
