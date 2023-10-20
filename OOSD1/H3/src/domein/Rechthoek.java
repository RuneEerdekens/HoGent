package domein;

public class Rechthoek {

	private double lengte, breedte;

	public Rechthoek(double lengte, double breedte) {
		setLengte(lengte);
		setBreedte(breedte);

	}

	public Rechthoek() {
		// setLengte(10);
		// setBreedte(7);
		this(10, 7);
	}

	public double berekenOmtrek() {
        return 2*(lengte+breedte);
    }

	public double berekenOppervlakte() {
		return (lengte*breedte);
	}

	public double getLengte() {
		return lengte;
	}

	private void setLengte(double lengte) {
		this.lengte = lengte > 0 ? lengte : 1;
	}

	public double getBreedte() {
		return breedte;
	}

	private void setBreedte(double breedte) {
		this.breedte = breedte > 0 ? breedte : 1;
	}

}
