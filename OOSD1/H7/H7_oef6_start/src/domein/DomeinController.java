package domein;
import java.util.ArrayList;
import java.util.List;

import dto.VoorwerpDTO;

public class DomeinController {
	private VoorwerpRepository vr;
	
	public DomeinController() {
		vr = new VoorwerpRepository();
	}
	
	public List<VoorwerpDTO> geefVoorwerpDTOs() {
		List<VoorwerpDTO> voorwerpDTOs = new ArrayList();
		for (Voorwerp voor : vr.getVoorwerpen()) {
			if(voor instanceof Sleutel s) {
				voorwerpDTOs.add(new VoorwerpDTO(s.getNaam(), s.getGewicht(), s.getNiveau(), s.getAantalInOmloop(), s.getDeur()));
			}else if(voor instanceof Wapen w) {
				voorwerpDTOs.add(new VoorwerpDTO(w.getNaam(), w.getGewicht(), w.getNiveau(), w.getKracht(), w.isGebruikt()));
			}
		}
		
		return voorwerpDTOs;
	}
}
