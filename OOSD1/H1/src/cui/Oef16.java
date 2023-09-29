package cui;

import java.util.Scanner;

public class Oef16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een geheel getal in: ");
		int num = scan.nextInt();
		System.out.printf("octagonale notatie = %o%n", num);
		System.out.printf("hexadecimale notatie (klein) = %x%n", num);
		System.out.printf("hexadecimale notatie (groot) notatie = %X%n", num);

	}

}
