package domein;

public class Sleutel extends Voorwerp {

	private int deur;
	private static int aantalInOmloop;

	public Sleutel(String naam, double gewicht, int niveau, int deur) {
		super(naam, gewicht, niveau);
		setDeur(deur);
		setAantalInOmloop(aantalInOmloop + 1);
	}

	public int getDeur() {
		return deur;
	}

	public final void setDeur(int deur) {
		if (deur < 0) {
			throw new IllegalArgumentException(String.format("deur moet positief zijn"));
		}
		this.deur = deur;
	}

	public static int getAantalInOmloop() {
		return aantalInOmloop;
	}

	public static final void setAantalInOmloop(int aantalInOmloop) {
		Sleutel.aantalInOmloop = aantalInOmloop;
	}

	public boolean pastOp(int deur) {
		return this.deur == deur;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s.%n%s%s%s", super.toString(), "past op deur", getDeur(),
				"Er" + (getAantalInOmloop() == 1 ? "is" : "zijn"), getAantalInOmloop(), "sleutel(s) in omloop.");

	}

}
