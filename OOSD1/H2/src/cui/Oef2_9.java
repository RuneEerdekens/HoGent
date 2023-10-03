package cui;

import java.util.Scanner;

public class Oef2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_9().method1();
		
	}
	
	private void method1() {
		Scanner scan = new Scanner(System.in);
		int som = 0;
		int deel2 = 0;
		int deel3 = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Geef getal %d: ", i);
			int nextNum = scan.nextInt();
			deel2 += nextNum%2 == 0? 1:0;
			deel3 += nextNum%3 == 0? 1:0;
			som += nextNum;
			
		}
		System.out.printf("de som van de getalen = %d%n", som);
		System.out.printf("Je gaf %d even getallen in en %d getallen deelbaar door 3 in.%n", deel2, deel3);
		
		System.out.println("N\t10*N\t100*N\t1000*N");
		
		for (int j = 1; j <= 5; j++) {
			System.out.printf("%d\t%d\t%d\t%d%n", j, j*10, j*100, j*1000);
		}
	}
	

}
