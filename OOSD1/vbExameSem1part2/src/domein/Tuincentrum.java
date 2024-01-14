package domein;

import java.util.ArrayList;
import java.util.List;

import persistentie.PlantMapper;

public class Tuincentrum 
{
	private List<Plant> planten;
	private final PlantMapper plantMapper;

	public Tuincentrum() 
	{
		plantMapper = new PlantMapper();
		this.planten = plantMapper.geefPlanten();
	}

	public void voegPlantToe(Plant plant) 
	{ 
		for (Plant p : planten) {
			if(p.getNaam() == plant.getNaam()) {
				p.setAantalInVoorraad(p.getAantalInVoorraad() + plant.getAantalInVoorraad());
				return;
			}
		}
		planten.add(plant);
	}

	public List<Plant> getPlanten() {
		return planten;
	}

	public int[] maakOverzichtPlantenPerHoogte() {
		
		int[] overzicht = new int[]{0,0,0};
		
		for (Plant p : planten) {
			if(p.getHoogteInCm() <= 80) {
				overzicht[0]++;
			}else if(p.getAantalInVoorraad() <= 100) {
				overzicht[1]++;
			}else{
				overzicht[2]++;
			}
		}
		return overzicht;
	}
	
	
	public double bepaalWaardeVerkoop() {
		
		double waarde = 0;
		
		for (Plant p : planten) {
			waarde += p.getAantalInVoorraad() * p.berekenVerkoopprijs();
		}
		
		return waarde;
	}

	public List<Plant> geefPlanten(boolean inVoorraad){
		
		if(inVoorraad) {
			List<Plant> voorraadLijst = new ArrayList<>();
			for (Plant p : planten) {
				if(p.getAantalInVoorraad() != 0) {
					voorraadLijst.add(p);
				}
			}
			return voorraadLijst;
		}
		
		return planten;
		
	}
	
	
	

}
