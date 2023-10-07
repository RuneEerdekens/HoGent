package cui;

import java.util.Scanner;

public class Oef2_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_26().method1();
	}
	private void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een geheel getal in: ");
		int num = scan.nextInt();
		System.out.printf("Het ingevoerde getal %d is een %s getal",num, num%2==0?"even":"oneven");
	}
}
