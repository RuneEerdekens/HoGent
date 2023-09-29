package cui;

import java.util.Scanner;

public class Oef13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een datum in <ddmmjjjj>");
		
		int date = scan.nextInt();
		
		int daysRaw = date - date%1000000;
		int years = date%10000;
		int monthsRaw = date - (daysRaw + years);
		
		int days = daysRaw/1000000;
		int months = monthsRaw/10000;
		
		int daysLeft = (30 - days) + (12 - months)*31;
		
		
		System.out.printf("%d", daysLeft);
		
	}

}
