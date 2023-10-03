package cui;

public class Oef2_5 {

	public static void main(String[] args) {
		new Oef2_5().berekenIncrementEnDecrement();
		
	}

	private void berekenIncrementEnDecrement() {
		int a = 0, b = 0, c = 0;
		a = ++b + ++c; // a = 2 b =1 c =1
		a = b++ + c++; // a = 2 b =1 c =1
		a = ++b + c++; // a = 2 b =1 c =1 
		a = b-- + c--; // a = -2 b = -1 c = -1
	}

}
