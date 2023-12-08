package domein;

public class Wapen extends Voorwerp {

	private int kracht;
	private boolean gebruikt;
	private static final int MAX_NIVEAU = 5;

	public Wapen(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		super(naam, gewicht, niveau);
		controleerNiveau(niveau);
		setKracht(kracht);
		setGebruikt(gebruikt);
	}

	public int getKracht() {
		return kracht;
	}

	public boolean isGebruikt() {
		return gebruikt;
	}

	public void setGebruikt(boolean gebruikt) {
		this.gebruikt = gebruikt;
	}

	public void setKracht(int kracht) {
		if (kracht < 0)
			throw new IllegalArgumentException(String.format("kracht moet positief zijn"));
		this.kracht = kracht;
	}

	private void controleerNiveau(int niveau) {
		if (niveau < 1 || niveau >= MAX_NIVEAU) {
			throw new IllegalArgumentException(String.format("Niveau moet tussen 1 en %d liggen;", MAX_NIVEAU));
		}
	}

	@Override
	public String toString() {
		return String.format("%s%s%d%s%n", super.toString(), " en met kracht ", kracht,
				gebruikt ? " al gebruikt." : " nog niet gebruikt.");
	}

}
