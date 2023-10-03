package cui;

public class Oef2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oef2_1 obj = new Oef2_1();
		obj.method1();
	}

	private void method1() {

		int x = 10;
		int temp = 30;

		System.out.println(x % 2 == 0 ? x >= 0 ? "Positief en even" : "Negatief en even" : x >= 0 ? "Positief en oneven" : "Negatief en oneven");
		System.out.println(temp < 20 ? temp <= 10 ? "koud" : "goed" : "warm");
	}

}
