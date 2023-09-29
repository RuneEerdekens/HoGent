package cui;

import java.util.Scanner;

public class Oef08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een getal: ");
		int num1 = scan.nextInt();
		System.out.print("Geef een 2de getal: ");
		int num2 = scan.nextInt();
		System.out.print("Geef een 3de getal: ");
		int num3 = scan.nextInt();
		System.out.printf("de vermeenigvuldiging van %d, %d en %d is %d%n", num1, num2, num3, num1+num2+num3);
		scan.close();
	}

}
