package cui;

import java.util.Scanner;

public class Oef15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Geef 1ste getal: ");
		int num1 = scan.nextInt();
		System.out.print("Geef 2ste getal: ");
		int num2 = scan.nextInt();
		System.out.print("Geef 3ste getal: ");
		int num3 = scan.nextInt();
		
		int som = num1+num2+num3;
		int gem = som/3;
		int rest = som%gem;
		
		System.out.printf("Van de ingevoerde getalen %d, %d en %d%n", num1, num2, num3);
		System.out.printf("is de som %d%n", som);
		System.out.printf("het gemidlde %d%n", gem);
		System.out.printf("en de rest %d%n", rest);
	}

}
