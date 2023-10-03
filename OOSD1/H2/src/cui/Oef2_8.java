package cui;

public class Oef2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_8().method1();
	}
	
	private void method1() {
		int som = 0;
		int i = 0;
		for (i = 1; i < 500; i++) {
			som += i%12 == 0? i:0;		
		}
		System.out.println(som);
		
		for (i = 51; i >= 0; i--) {
			System.out.print(i%2 == 1? i + "\n":"");
		}
		
		char c = 'A';
		for (; c <= 'Z'; ++c) {
			System.out.print(c + " ");
		}
	}

}
