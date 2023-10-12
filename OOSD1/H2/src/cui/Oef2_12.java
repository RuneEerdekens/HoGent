package cui;

public class Oef2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_12().method1();
	}
	
	private void method1() {
		int leeuwen = 50;
		int jaar = 0;
		do {
			leeuwen *= 1.15; //int rond automatich af naar benden als er een commagetal is dus geen halve leeuwen
			jaar++;
			System.out.printf("jaar %d : %d leeuwen%n", jaar, leeuwen);
		} while (leeuwen < 1000);
		System.out.printf("Het duurt %d jaar voor dat er 1000 leeuwen zijn", jaar);
	}
}
