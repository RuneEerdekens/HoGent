package cui;

import domein.Rekening;

public class RekeningApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RekeningApplicatie().start();
	}
	

	private void start() {
		double[] saldos = new double[] {100, 777.77, 287.15, -350, 399.99, 123.45, 987.65, -68.18, 413.26};
		Rekening[] rekeningen = new Rekening[saldos.length];
		int num = 0;
		
		for (double saldo : saldos) {
			rekeningen[num] = new Rekening(num, String.format("%c", 'A'+num));
			rekeningen[num].stort(saldo);
			num++;
			

		}
		
		double gem = 0;
		for (Rekening rekening : rekeningen) {
			
			System.out.printf("Rekening %d van %s bevat %.2f Euro%n", rekening.getRekeningNummer(), rekening.getNaamHouder(), rekening.getSaldo());
			gem += rekening.getSaldo();
		}
		
		System.out.printf("%nHet gemidelde van deze %d rekeningen is %.2f Euro%n", rekeningen.length, gem/rekeningen.length);
		
	}
}