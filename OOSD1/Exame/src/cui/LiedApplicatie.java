package cui;

import java.util.Scanner;

import domein.Lied;

public class LiedApplicatie {

	public static void main(String[] args) {

		new LiedApplicatie().start();
	}

	private void start() {

		Lied[][] liedjes = maakLijsten();
		int lijstNum = 0;
		int som = 0;
		for (Lied[] lijst : liedjes) {
			System.out.printf("%nGeef de details van de liedjes voor afspeellijst %d%n", lijstNum + 1);
			
			for (int liedNum = 0;liedNum < lijst.length; liedNum++) {
				System.out.printf("Lied %d - duur (min): ", liedNum + 1);
				liedjes[lijstNum][liedNum] = new Lied(leesGetalIn(""));
				System.out.printf("Lied %d - aantal bpm: ", liedNum + 1);
				liedjes[lijstNum][liedNum].setBeatsPerMinut((int) leesGetalIn(""));
				System.out.printf("Je koos een %s nummer van %d bpm.%n%n", liedjes[lijstNum][liedNum].geefTempo(),
						liedjes[lijstNum][liedNum].getBeatsPerMinut());
				som += liedjes[lijstNum][liedNum].geefDuurinSeconden();
			}

			String text = "niet dansbaar";
			for (Lied lied : lijst) {
				if (lied.getBeatsPerMinut() >= 90) {
					text = "dansbaar";
					break;
				}
			}
			System.out.printf("Afspeellijst %d is %s!%n", lijstNum + 1, text);
			lijstNum++;
		}

		System.out.printf("%s is %d seconde!%n",
				liedjes.length > 1 ? "De gemiddelde duur van je afspeellijsten" : "De duur van je afspeellijst",
				som / liedjes.length);
	}

	private Lied[][] maakLijsten() {
		int aantalLijsten;
		do {
			aantalLijsten = (int) leesGetalIn("Hoeveel afsleeplijsten wil je maken: ");
		} while (aantalLijsten < 1 || aantalLijsten > 5);

		return new Lied[aantalLijsten][3];
	}

	private double leesGetalIn(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(prompt);
		return scan.nextDouble();
	}

}
