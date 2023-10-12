package cui;

import java.util.Scanner;

public class Oef2_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_30().method1();
	}

	private void method1() {
		Scanner scan = new Scanner(System.in);

		int num;
		int primeNums = 0;

		do {
			System.out.print("Geef een geheel getal in (0 om te stoppen): ");
			num = scan.nextInt();
			if (num != 0) {
				if (isPrime(num)) {
					primeNums++;
					System.out.printf("%d is EEN priemgetal%n", num);
				} else {
					System.out.printf("%d is GEEN priemgetal%n", num);
				}
			}

		} while (num != 0);

		System.out.println("Het aantal priemgetalen is " + primeNums);
	}

	private boolean isPrime(int num) // this method was stolen from the internet
	{
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if ((num % i) == 0)
				return false;
		}
		return true;
	}

}
