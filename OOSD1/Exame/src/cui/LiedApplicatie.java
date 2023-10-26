package cui;

import domein.Lied;

public class LiedApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lied nieuwLied = new Lied(6, 90);
		System.out.printf("duurperMinute %.1f BeatsPerMinuten %d%n", nieuwLied.getDuurInMinuten(), nieuwLied.getBeatsPerMinut());
		System.out.println(nieuwLied.geefDuurinSeconden());
		System.out.println(nieuwLied.geefTempo());
	}

}
