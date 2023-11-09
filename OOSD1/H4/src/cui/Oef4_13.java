package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oef4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Oef4_13().start();
	}

	private void start() {
		List<Double> uitgave = new ArrayList<>();
		List<Double> inkomsten = new ArrayList<>();
		int uitgaveTotaal = 0, inkomstenTotaal = 0;
		double bedrag = leesGetal();
		while (bedrag != 0) {

			if(Math.abs(bedrag)%1 > 0) {
				if (bedrag > 0) {
					inkomsten.add(bedrag);
					inkomstenTotaal+= bedrag;
				} else if (bedrag < 0) {
					uitgave.add(- bedrag);
					uitgaveTotaal -= bedrag;
				}

				bedrag = leesGetal();
			}
		}
		
		System.out.printf("Inkomst (Totaal = %.2f Euro):%n", inkomstenTotaal);
		

	}

	private double leesGetal() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef bedrag op (0 om te stoppen): ");
		return scan.nextDouble();

	}

}
