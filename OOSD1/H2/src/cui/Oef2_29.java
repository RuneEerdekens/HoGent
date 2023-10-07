package cui;

import java.util.Scanner;

public class Oef2_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_29().method1();
	}
	private void method1() {
		Scanner scan = new Scanner(System.in);
		int pNum;
		System.out.print("Geef een geheel getal(-2000 om te stoppen): ");
		int num = scan.nextInt();
		
		int volg = 0;
		
		while(num != -2000) {
			pNum = num;
			System.out.print("Geef een geheel getal(-2000 om te stoppen): ");
			num = scan.nextInt();
			volg += num>pNum&&num!=-2000?1:0;
		}
		System.out.println("Het aantal getalen dat direct gevolgd word door een kleiner getal is " + volg);
	}
}
