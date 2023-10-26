package domein;

public class Rekening {
	private long rekeningNummer;
	private double saldo;
	private String naamHouder;
	
	
	public Rekening(long rekeningNummer, String naamHouder) {
		setRekeningNummer(rekeningNummer);
		setNaamHouder(naamHouder);
	}
	
	public Rekening(long rekeningNummer) {
		this(rekeningNummer, "onbekend");
	}
	
	public Rekening() {
		this(123456789);
	}

	public long getRekeningNummer() {
		return rekeningNummer;
	}
	
	private final void setRekeningNummer(long rekeningNummer) {
		this.rekeningNummer = rekeningNummer;
	}
	
	public String getNaamHouder() {
		return naamHouder;
	}
	
	public void setNaamHouder(String naamHouder) {
		this.naamHouder = naamHouder;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean stort(double bedrag) {
		boolean corectBedrag = bedrag > 0;
		if(corectBedrag) saldo += bedrag;
		return corectBedrag;
	}
	
	public boolean haalAf(double bedrag) {
		boolean corectBedrag = bedrag > 0 && bedrag <= getSaldo();
		if(corectBedrag) saldo -= bedrag;
		return corectBedrag;
	}
}
