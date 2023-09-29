package cui;

import java.util.Scanner;

public class Welcome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("geef een getal: ");
		int num = scan.nextInt();
		
		System.out.printf("het double van %d is %d%n", num, num*2);
		
		scan.close();
	}

}
