package cui;

import java.util.Scanner;

import domein.Lied;

public class LiedApplicatie {

	public static void main(String[] args) {

		new LiedApplicatie().start();
	}

	private void start() {

		int aantal = maakLijsten();
		int som = 0;
		for (int lijstNum = 0; lijstNum < aantal; lijstNum++) {
			System.out.printf("%nGeef de details van de liedjes voor afspeellijst %d%n", lijstNum + 1);
			String text = "niet dansbaar";

			for (int liedNum = 0; liedNum < 3; liedNum++) {
				System.out.printf("Lied %d - duur (min): ", liedNum + 1);
				Lied lied = new Lied(leesGetalIn(""));
				System.out.printf("Lied %d - aantal bpm: ", liedNum + 1);
				lied.setBeatsPerMinut((int) leesGetalIn(""));
				System.out.printf("Je koos een %s nummer van %d bpm.%n%n", lied.geefTempo(), lied.getBeatsPerMinut());

				som += lied.geefDuurinSeconden();
				if (lied.getBeatsPerMinut() >= 90) {
					text = "dansbaar";
				}
			}

			System.out.printf("Afspeellijst %d is %s!%n", lijstNum + 1, text);
		}

		System.out.printf("%s is %d seconde!%n",
				aantal > 1 ? "De gemiddelde duur van je afspeellijsten" : "De duur van je afspeellijst", som / aantal);
	}

	private int maakLijsten() {
		int aantalLijsten;
		do {
			aantalLijsten = (int) leesGetalIn("Hoeveel afsleeplijsten wil je maken: ");
		} while (aantalLijsten < 1 || aantalLijsten > 5);

		return aantalLijsten;
	}

	private double leesGetalIn(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(prompt);
		return scan.nextDouble();
	}

}
