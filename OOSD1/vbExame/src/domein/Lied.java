package domein;

public class Lied {

	double duurInMinuten;
	int beatsPerMinut;

	public Lied(double duurPerMinute, int BeatsPerMinuten) {
		setBeatsPerMinut(BeatsPerMinuten);
		setDuurInMinuten(duurPerMinute);
	}

	public Lied(double duurperMinute) {
		this(duurperMinute, 100);
	}

	public int getBeatsPerMinut() {
		return beatsPerMinut;
	}

	public void setBeatsPerMinut(int beatsPerMinut) {
		if (beatsPerMinut >= 10 && beatsPerMinut <= 200) {
			this.beatsPerMinut = beatsPerMinut;
		} else {
			this.beatsPerMinut = 100;
		}
	}

	public double getDuurInMinuten() {
		return duurInMinuten;
	}

	private void setDuurInMinuten(double duurInMinuten) {
		if (duurInMinuten >= 0.5 && duurInMinuten <= 10) {
			this.duurInMinuten = duurInMinuten;
		} else {
			this.duurInMinuten = 4;
		}

//		this.duurInMinuten = duurInMinuten > 0.5 && duurInMinuten < 20?duurInMinuten:4; 2de optie
	}

	public String geefTempo() {

		String retVal;

		if (beatsPerMinut < 71) {
		    retVal = "traag";
		} else if (beatsPerMinut < 91) {
		    retVal = "relaxed";
		} else if (beatsPerMinut < 121) {
		    retVal = "fris";
		} else if (beatsPerMinut < 181) {
		    retVal = "levindig";
		} else {
		    retVal = "Snel";
		}

		return retVal;
	}

	public int geefDuurinSeconden() {
		return (int) (duurInMinuten * 60);
	}

}
