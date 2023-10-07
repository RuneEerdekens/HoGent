package cui;

import java.util.Scanner;

public class Oef2_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_24().method1();
	}

	private void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een strikt positief geheel getal in: ");
		int num = scan.nextInt();
		
		int wijzigingen = 0;
		
		while(num != 1 && num>0) {num = num%2==0?num/2:(num*3)+1; wijzigingen++;}
		
		System.out.printf(num>0?"het getal wijzigt %d keer":"",wijzigingen);
	}
}
