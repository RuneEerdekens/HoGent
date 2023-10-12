package cui;

public class Oef2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_15().method1();
	}
	
	private void method1() {
		int i, j, k;

		// Patroon A
		
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");		
			}
			System.out.println();
		}
		
		// Patroon B
		
		for (i = 1; i <= 10; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");	
			}
			for (k = 10; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Patroon C
		
		for (i = 1; i <= 10; i++) {
			for (j = 10; j >= i; j--) {
				System.out.print("*");		
			}
			System.out.println();
		}
		
		//Patroon D
		
		for (i = 1; i <= 10; i++) {
			for (k = 10; k > i; k--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}

}
