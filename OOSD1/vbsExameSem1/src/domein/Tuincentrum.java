package domein;

import java.util.ArrayList;
import java.util.List;

import persistentie.PlantMapper;

public class Tuincentrum {
	private List<Plant> planten;
	private final PlantMapper plantMapper;

	public Tuincentrum() {
		plantMapper = new PlantMapper();
		this.planten = plantMapper.geefPlanten();
	}

	public void voegPlantToe(Plant plant) {
		int i = 0;
		for (Plant p : planten) {
			if (p.getNaam().equals(plant.getNaam())) {
				planten.get(i).setAantalInVoorraad(p.getAantalInVoorraad() + plant.getAantalInVoorraad());
				return;
			}
			i++;
		}
		planten.add(plant);
	}

	public List<Plant> getPlanten() {
		return planten;
	}

	// TODO maakOverzichtPlantenPerHoogte
	public int[] maakOverzichtPlantenPerHoogte() {
		int[] overzicht = new int[] { 0, 0, 0 }; // <= 80, > 80 && <= 100, > 100
		for (Plant plant : planten) {
			int hoogte = plant.getHoogteInCm();

			if (hoogte > 100) {
				overzicht[2]++;
			} else if (hoogte > 80) {
				overzicht[1]++;
			} else {
				overzicht[0]++;
			}
		}

		return overzicht;
	}

	public double bepaalWaardeVerkoop() {
		double totaal = 0;
		for (Plant plant : planten) {
			totaal += plant.berekenVerkoopprijs() * plant.getAantalInVoorraad();
		}
		return totaal;
	}

	public List<Plant> geefPlanten(boolean inVoorraad){
		
		List<Plant> plantenReturn = new ArrayList();
		
		for (Plant plant : planten) {
			if(inVoorraad) {
				if(plant.getAantalInVoorraad() > 0) {
					plantenReturn.add(plant);
				}
			}else {
				plantenReturn.add(plant);
			}
		}
		
		return plantenReturn;
	}

}
