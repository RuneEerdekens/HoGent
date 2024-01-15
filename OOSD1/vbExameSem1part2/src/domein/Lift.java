package domein;

public class Lift {
	private final int laagsteVerdieping;
	private final int hoogsteVerdieping;
	private int verdieping;

	public Lift(int laagsteVerdieping, int hoogsteVerdieping) {
		this.laagsteVerdieping = laagsteVerdieping;
		this.hoogsteVerdieping = hoogsteVerdieping;
		setVerdieping(0);
	}

	public void gaNaarOmhoog(int aantalVerdiepingen) {
		if(aantalVerdiepingen <= 0) {
			throw new IllegalArgumentException("aantalVerdiepingen moet striks positief zijn");
		}
		
		if(aantalVerdiepingen + verdieping >= hoogsteVerdieping) {
			this.verdieping = hoogsteVerdieping;
		}else {
			this.verdieping += aantalVerdiepingen;
		}
	}

    private void controleerLaagsteEnHoogsteVerdieping(int laagsteVerdieping, int hoogsteVerdieping) {
        if (laagsteVerdieping > hoogsteVerdieping) {
            throw new IllegalArgumentException("Ongeldige instelling van verdiepingen: laagsteVerdieping > hoogsteVerdieping");
        }
    }

	private void setVerdieping(int verdieping) {
		this.verdieping = verdieping;
	}

	public int getVerdieping() {
		return verdieping;
	}

	public int getLaagsteVerdieping() {
		return laagsteVerdieping;
	}

	public int getHoogsteVerdieping() {
		return hoogsteVerdieping;
	}

}
