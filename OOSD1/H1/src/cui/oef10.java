package cui;

import java.util.Scanner;

public class oef10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef de lengte van de rechthoek in: ");
		int length = scan.nextInt();
		System.out.print("Geef de breete van de rechthoek in: ");
		int width = scan.nextInt();
		System.out.printf("De omtrek = %d%nDe oppervalkte = %d%n", length*2+width*2, length*width);
		scan.close();
	}

}
