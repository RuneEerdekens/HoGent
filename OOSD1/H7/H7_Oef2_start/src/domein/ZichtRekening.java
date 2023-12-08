package domein;

public class ZichtRekening extends Rekening {

	private double maxKredietOnderNull;
	
	public ZichtRekening() {
		super();
	}

	public ZichtRekening(long rekeningNr, String houder, double maxKredietOnderNul) {
		super(rekeningNr, houder);
		
	}

	
}
