package cui;

public class Oef2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oef2_1 obj = new Oef2_1();
		obj.method1();
	}

	private void method1() {

		int x = -12;
		int temp = 10;

		if (x >= 0) {
			System.out.print("Positief");
			if(x%2 == 0) {
				System.out.println(" en even");
			}else {
				System.out.println(" en oneven");
			}
		} else {
			System.out.print("Negatief");
			if(x%2 == 0) {
				System.out.println(" en even");
			}else {
				System.out.println(" en oneven");
			}
		}
		
		

		if (temp < 20) {
			if (temp <= 10) {
				System.out.println("Koud");
			} else {
				System.out.println("Goed");
			}

		} else {
			System.out.println("warm");
		}
	}

}
