package domein;

public class SpaarRekening extends Rekening {
	
	private static double aangroeiIntrest;
	
	
	
	public SpaarRekening() {
		super();
	}

	public SpaarRekening(long rekeningNr, String houder) {
		super(rekeningNr, houder);
	}

	public static double getAangroeiIntrest() {
		return aangroeiIntrest;
	}

	
	public static final void setAangroeiIntrest(double aangroeiIntrest) {
		if(aangroeiIntrest < 0) {
			throw new IllegalArgumentException("aangroeiIntrest mag niet onder 0 zijn");
		}
		SpaarRekening.aangroeiIntrest = aangroeiIntrest;
	}
	
	@Override
	public boolean haalAf(double bedrag) {
		if(bedrag > super.getSaldo()) {
			return false;
		}
		return super.haalAf(bedrag);
	}

	@Override
	public String toString() {
		return String.format("%s. Aangroeiintrest = %.2f%s",super.toString(), aangroeiIntrest, "%");
	}

}
