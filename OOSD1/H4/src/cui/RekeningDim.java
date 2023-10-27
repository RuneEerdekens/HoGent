package cui;

import java.util.Scanner;

import domein.Rekening;

public class RekeningDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RekeningDim().start();
	}

	private void start() {
		Rekening[][] rekeningen = new Rekening[3][];
		for(int i = 0; i<rekeningen.length;i++) {
			rekeningen[i] = new Rekening[leesGetal(i + 1)];
			for (int j = 0; j < rekeningen[i].length; j++) {
				rekeningen[i][j] = new Rekening();
				rekeningen[i][j].stort((i+1)*10 + j+1);
			}
		}
		
		for(Rekening[] rij : rekeningen) {
			for(Rekening rekening : rij) {
				System.out.printf("%-8.0f",  rekening.getSaldo());
			}
			System.out.println();
		}
	}
	
	private int leesGetal(int teller) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Geef aantal kolommen in de rij %d: ", teller);
		return scan.nextInt();
	}
	
}
