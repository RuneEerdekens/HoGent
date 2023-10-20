package domein;

public class Driehoek {
	private int a, b, c;

	public Driehoek(int a, int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}

	public boolean isRechthoekig() {
		return a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;
		// if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
		// return true;
		// else
		// return false;
	}

	public int getA() {
		return a;
	}

	private void setA(int a) {
		if (a > 0)
			this.a = a;
		else
			this.a = 1;
	}

	public int getB() {
		return b;
	}

	private void setB(int b) {
		this.b = b > 0 ? b : 1;
	}

	public int getC() {
		return c;
	}

	private void setC(int c) {
		this.c = c > 0 ? c : 1;
	}

}
