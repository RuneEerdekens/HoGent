package cui;

import java.util.Scanner;

public class Oef2_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_27().method1();
	}
	private void method1() {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int num = 1;
		
		int A1, A2, A3, A4;
		A1 = A2 = A3 = A4 = 0;
		
		boolean stop = false;
		
		while(i < 15 && num != 0) {
			System.out.printf("Geef antwoord %d in (1, 2, 3 of 4), STOP met 0: ", i);
			num = scan.nextInt();
			if(num > 4 || num < 1) {
				System.out.println("Foutive waarde probeer opnieuw!");
			}else {
				A1 += num==1?1:0;
				A2 += num==2?1:0;
				A3 += num==3?1:0;
				A4 += num==4?1:0;
				i++;
			}
			
		}
		
		System.out.println("Aantal 1 = " + A1);
		System.out.println("Aantal 2 = " + A2);
		System.out.println("Aantal 3 = " + A3);
		System.out.println("Aantal 4 = " + A4);
	}
}
