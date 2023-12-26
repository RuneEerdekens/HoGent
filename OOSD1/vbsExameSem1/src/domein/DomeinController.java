package domein;

import dto.PlantDTO;
import java.util.List;

public class DomeinController 
{
	private Tuincentrum tuincentrum;

	public DomeinController() {
		tuincentrum = new Tuincentrum();
	}

	public void voegPlantToe(String naam, char soortCode, int hoogteInCm, double prijsInEuro, int aantalInVoorraad) {
		tuincentrum.voegPlantToe(new Plant(naam, soortCode, hoogteInCm, prijsInEuro, aantalInVoorraad));
		
	}

	public PlantDTO[] geefAllePlanten(boolean inVoorraad) {
		
		List<Plant> planten = tuincentrum.geefPlanten(inVoorraad);
		PlantDTO[] plantenDTOs = new PlantDTO[planten.size()];
		
		int i = 0;
		
		for (Plant p : planten) {
			plantenDTOs[i] = new PlantDTO(p.getNaam(), p.getSoortCode(), p.getHoogteInCm(), p.getAantalInVoorraad(), p.getPrijsInEuro());
			i++;
		}
		
		return plantenDTOs;
	}

	
	public double bepaalWaardeVerkoop()
	{
		return tuincentrum.bepaalWaardeVerkoop();
	}

	public int[] maakOverzichtPlantenPerHoogte() 
	{
		return tuincentrum.maakOverzichtPlantenPerHoogte();
	}

}
