package cui;

import java.util.Scanner;

public class Oef2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_13().method1();
	}

	private void method1() {
		Scanner scan = new Scanner(System.in);
		int num;
		int i = 0;
		int som = 0;
		
		int[] ans = leesGetal(som, i);
		num = ans[0];
		som = ans[1];
		i = ans[2];
		
		while (num != -1 && i != 10) {
			ans = leesGetal(som, i);
			num = ans[0];
			som = ans[1];
			i = ans[2];
		}
		System.out.println(i > 0 ? "Het gemidelde van de ingegeven getallen is " + som / i : "Geen getallen ingegeven");
	}
	
	private int[] leesGetal(int somIn, int iIn) {
		Scanner scan = new Scanner(System.in);
		int num;
		int i = iIn;
		int som = somIn;
		
		System.out.printf("geef %d getallen in (of -1 om te stoppen): ", 10 - i);
		num = scan.nextInt();
		if(num != -1) {
			som += num;
			i++;
		}
		int[] ans = {num, som, i};
		return ans;
	}
}
