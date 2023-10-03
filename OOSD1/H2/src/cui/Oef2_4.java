package cui;

public class Oef2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_4().method1();
	}

	private void method1() {
		int age = 70;
		int x, y = 1;
		int b = 0;
		
		System.out.println(age >= 65? "Age is greater then 65":"Age is less then 65");
		
		for (x = 1; x <= 10;x++) {
			y = x*x;
			b += y;
		}
		System.out.println(b);
	}
}
