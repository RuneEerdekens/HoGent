package cui;

import java.util.*;

public class Oef2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef2_18().method1();
	}
	
	private void method1() {
		
		Dictionary<Integer, String> dict = new Hashtable<>();
		
		dict.put(9300, "Aalst");
		dict.put(2000, "Antwerpen");
		dict.put(1000, "Brussel");
		dict.put(9200, "Dendermonde");
		dict.put(9000, "Gent");
		dict.put(8500, "Korterijk");
		dict.put(9700, "Oudenaarde");
		dict.put(2300, "Turnhout");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef een postcode in (4 cijfers): ");
		int postcode = scan.nextInt();
		if(dict.get(postcode) != null) {
			System.out.printf("Postnummer %d komt overeen met de stad %s%n", postcode, dict.get(postcode));
		}else {
			System.out.printf("Postnummer %d bestaat niet of komt overeen met een stad die niet in de tabel is opgenomen%n", postcode);
		}
	}
}
