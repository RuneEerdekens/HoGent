package domein;

import persistentie.VoorwerpMapper;

public class VoorwerpRepository {
	private Voorwerp[] voorwerpen;
	private final VoorwerpMapper rm;
	
	public VoorwerpRepository() {
		rm = new VoorwerpMapper();
		voorwerpen =  rm.geefVoorwerpen();
	}
	
	public Voorwerp[] getVoorwerpen() {
		return this.voorwerpen;
	}
}
