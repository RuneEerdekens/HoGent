package cui;

import java.util.List;

import domein.DomeinController;
import dto.VoorwerpDTO;

public class VoorwerpApplicatie {

	private DomeinController dc;

	public VoorwerpApplicatie(DomeinController dc) {
		super();
		this.dc = dc;
	}

	public void start() {
		List<VoorwerpDTO> voorwerpen = dc.geefVoorwerpDTOs();
		for (VoorwerpDTO v : voorwerpen)
			if (v.soort() == 'W') {
				System.out.printf("Waapen %s met gewicht %.3f uit niveau %d met kracht %d %s.%n", v.naam(), v.gewicht(),
						v.niveau(), v.kracht(), v.gebruikt()?"is al gerbuikt":"is nog niet gebruikt");

			} else if (v.soort() == 'S') {
				System.out.printf(
						"Sleutel %s met gewicht %.3f uit niveau %d past op deur %d.%nEr %s %d Sleutel(s) in omloop.%n",
						v.naam(), v.gewicht(), v.niveau(), v.deur(), v.aantalInOmloop() == 1 ? "is" : "zijn",
						v.aantalInOmloop());
			}
	}
}