package cui;

import java.util.Scanner;

public class Oef2_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_20().method1();
	}
	
	private void method1() {
		Scanner scan = new Scanner(System.in);
		
		int biggest = 0, second = 0;
		
		for (int i = 1; i <= 10; i++) {

			System.out.printf("Geef getal %d in: ", i);
			int num = scan.nextInt();
			biggest = num>biggest?num:biggest;
			second = num<biggest?num>second?num:second:second;
		}
		
		System.out.printf("Het op 1 na grootste getal is %d", second);
	}
}
