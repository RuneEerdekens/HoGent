package cui;

import java.util.Scanner;

public class Oef14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een postief getal in: ");
		int num = scan.nextInt();
		System.out.println(" 1\t 10\t 100\t 1000\t 10000");
		System.out.printf("%d\t%d\t%d\t%d\t%d", num, num*10, num*100, num*1000, num*10000);

	}

}
