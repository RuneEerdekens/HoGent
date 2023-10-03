package cui;

public class Oef2_5 {

	public static void main(String[] args) {
		new Oef2_5().berekenIncrementEnDecrement();
		
	}

	private void berekenIncrementEnDecrement() {
		int a = 0, b = 0, c = 0;
		a = ++b + ++c; // a = 2 b =1 c =1
		a = b++ + c++; // a = 2 b =2 c =2
		a = ++b + c++; // a = 5 b =3 c =3 
		a = b-- + c--; // a = 6 b = 2 c = 2
	}

}
