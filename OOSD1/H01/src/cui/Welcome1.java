package cui;

import java.util.Scanner;

public class Welcome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a interger: ");
		
		int num1 = scan.nextInt();
		System.out.print("Input next integer: ");
		int num2 = scan.nextInt();
		
		System.out.printf("de som van %d en %d is %d%n", num1, num2, num1 + num2);
		scan.close();
	}

}
