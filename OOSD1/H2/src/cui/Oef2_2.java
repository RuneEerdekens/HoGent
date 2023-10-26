package cui;

import java.util.Scanner;

public class Oef2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_2().method1();
		
	}
	
	private void method1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Geef getal in: ");
		int aantal = scan.nextInt();
		
		System.out.println(aantal == 1? "Student":"Studenten");
		
	}
}
