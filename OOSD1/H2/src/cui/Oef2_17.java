package cui;

import java.util.Scanner;

public class Oef2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_17().method1();
	}
	
	private void method1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een getal in: ");
		int num = scan.nextInt();
		
		String text = num==0?"Het ingegevn getal was 0 en is vemeerderd met 1.":num>0?"Het ingegeven getal was strikt positief en werd verminderd met 10.":"Het ingegeven getal was negatief en werd vermeerderd met 10.";
		System.out.println(text);
		System.out.printf("Het heeft nu de waarde %d", num==0?1:num>0?num-10:num+10);
	}
}
