package cui;

import java.util.Scanner;

public class Oef2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_19().method1();
	}

	private void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een afstand in kilometer (strikt positief geheel getal): ");
		int distance = scan.nextInt();
		
		int startSpeed = 40;
		int speedIncrement = 10;
		
		int speed;
		
		double time;
		int uur;
		int min;
		
		if (distance > 0) {
			for(int i = 0; i <= 10; i++) {
				
				speed = startSpeed + speedIncrement*i;
				
				time = (double) distance/speed; // uitleg: deze shit suckt de balle 
				// int/int geeft ook een int (aleen geheel getal) en dan zet hij het om naar commagetal
				// maar tegen dan zijt ge ales na de comma al kwijt dus krijgt ge 0
				// die (double) noemt type casting als ge et wil opzoeke
				
				uur = (int) (time - time%1);
				
				min = (int) ((time%1) * 60);
				
				
				
				System.out.printf("%3d km \t\t %3d km/u \t\t %2d u %2d min%n", distance, speed, uur, min);
				
			}
			
			
		}
	}
}
