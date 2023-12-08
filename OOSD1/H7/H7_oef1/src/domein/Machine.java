package domein;

public class Machine {
	private int aantalMunten;
	private boolean muntInGleuf;
	private boolean balInBak;
	private boolean itemsInBak;

	public Machine(int aantalItems) {
		throw new UnsupportedOperationException();
	}

	public void betaal() {
		throw new UnsupportedOperationException();
	}

	public boolean draaiHendel() {
		throw new UnsupportedOperationException();
	}

	public void neemItem() {
		throw new UnsupportedOperationException();
	}

	public void neemMuntTerug() {
		throw new UnsupportedOperationException();
	}

	public void setAantalMunten(int aantalMunten) {
		this.aantalMunten = aantalMunten;
	}

	public int getAantalMunten() {
		return this.aantalMunten;
	}

	public void setMuntInGleuf(boolean muntInGleuf) {
		this.muntInGleuf = muntInGleuf;
	}

	public boolean isMuntInGleuf() {
		return this.muntInGleuf;
	}

	public void setBalInBak(boolean balInBak) {
		this.balInBak = balInBak;
	}

	public boolean isBalInBak() {
		return this.balInBak;
	}

	public void setItemsInBak(boolean itemsInBak) {
		this.itemsInBak = itemsInBak;
	}

	public boolean isItemsInBak() {
		return this.itemsInBak;
	}
}