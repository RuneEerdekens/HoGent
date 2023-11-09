package cui;

import java.util.Scanner;

import domein.Auto;

public class AutoApplicatie {

	public static void main(String[] args) {

		new AutoApplicatie().start();
	}

	private void start() {
		int num;
		Auto tempAuto = null;
		double som = 0;
		int aantal = 0;
		int aantalExtraVergoed = 0;
		do {
			System.out.println("Menu");
			System.out.println("1: niet elektrische auto");
			System.out.println("2: elektrische auto met aantal kilometers");
			System.out.println("3: elektrische auto met vergoeding");
			System.out.println("-1: stoppen");
			num = (int) geefGetal("");

			switch (num) {
			case 1 -> tempAuto = new Auto(false, geefGetal("Geef aantal kilometers: "), 1);
			case 2 -> tempAuto = new Auto(geefGetal("Geef aantal kilometers: "), (int) geefGetal("Geef vergoeding: "));
			case 3 -> tempAuto = new Auto((int) geefGetal("Geef vergoeding: "));
			default -> tempAuto = null;
			}

			if (tempAuto != null) {
				som += tempAuto.berekenTotaleVergoeding();
				aantal++;
				aantalExtraVergoed += tempAuto.heeftExtraVergoeding()?1:0;
			}

		} while (num != -1);
		
		if(aantal > 0) {
			System.out.printf("%s %d %s waar je recht hebt op extra vergoeding%n", aantalExtraVergoed==1?"is": "zijn", aantalExtraVergoed, aantalExtraVergoed==1?"auto":"auto's");
			System.out.printf("gemidelde totaale vergoeding is %.2f%n", som / aantal);
		}else {
			System.out.println("Geen Auto's ingegeven.");
		}

	}

	private double geefGetal(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(prompt);
		return scan.nextDouble();
	}

}
