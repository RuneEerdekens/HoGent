package cui;

import java.util.Scanner;

public class Oef4_11 {

	public static void main(String[] args) {
		new Oef4_11().start();

	}

	private void start() {
		double[][] matrix = new double[3][2];
		double som = 0;
		for (int rij = 0; rij < matrix.length; rij++) {
			for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
				matrix[rij][kolom] = geefElement(rij + 1, kolom + 1);
			}
		}
		int i = 0;
		for (int rij = 0; rij < matrix.length; rij++) {
			for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
				som += matrix[rij][kolom];
				i++;
			}
		}
		System.out.printf("Het gemidelde van alle getallen in de matrix is %.1f%n", som/i);
	}

	private double geefElement(int rij, int kolom) {
		Scanner invoer = new Scanner(System.in);
		System.out.printf("Geef getal op rij %d en kolom %d: ", rij, kolom);
		return invoer.nextDouble();
	}

}
