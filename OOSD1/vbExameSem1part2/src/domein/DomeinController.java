package domein;

import java.util.List;

import dto.PlantDTO;

public class DomeinController 
{
	private Tuincentrum tuincentrum;

	public DomeinController() {
		this.tuincentrum = new Tuincentrum();
	}

	public void voegPlantToe(String naam, char soortCode, int hoogteInCm, double prijsInEuro, int aantalInVoorraad) {
		tuincentrum.voegPlantToe(new Plant(naam, soortCode, hoogteInCm, prijsInEuro, aantalInVoorraad));
	}

	public PlantDTO[] geefAllePlanten(boolean inVoorraad) {
		List<Plant> planten = tuincentrum.geefPlanten(inVoorraad);
		PlantDTO[] plantDTOs = new PlantDTO[planten.size()]; 
		
		int index = 0;
		for (Plant p : planten) {
			plantDTOs[index] = new PlantDTO(p.getNaam(), p.getSoortCode(), p.getHoogteInCm(), p.getPrijsInEuro(), p.getAantalInVoorraad());
			index++;
		}
		
		return plantDTOs;
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
