package cui;

public class Oef2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oef2_3 obj = new Oef2_3();
		obj.method1();
		obj.method2();
	}

	private void method1() {
		int i, k;
		i = 4;
		switch (i) {
		case 1 -> k = 3;
		case 2 -> k = 6;
		case 3, 4 -> k = 10;
		
		default -> k = 20; 	

		}
		System.out.println(k);
		
	}
	
	private void method2() {
		int x, y = 0;
		x = 100;
		switch (x) {
		case 100, 150, 170, 199 -> y++;
		}
		
		System.out.println(y);
	}

}
