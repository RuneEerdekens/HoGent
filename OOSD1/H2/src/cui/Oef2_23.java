package cui;

import java.util.Scanner;

public class Oef2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_23().method1();
	}
	private void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("geef een strikt positieve deeler in: ");
		int deeler = scan.nextInt();
		int deelAmount = -1; // init naar -1 zodat op de 1ste cycle deelamount 0 word aangezien num begint op 0
		int num = 0;
		int i = 0;
		while (deeler > 0 && num != -1) {
			deelAmount += num%deeler==0?1:0;
			i++;
			System.out.printf("geef positief getal %d in (of stop met -1): ", i);
			num = scan.nextInt();
		}
		System.out.printf(deelAmount>-1?deelAmount==1?"Er is %d getal deelbaar door %d%n":"Er zijn %d getallen deelbaar door %d%n":"", deelAmount, deeler);
	}
}
