package domein;

import java.util.ArrayList;
import java.util.List;

public class PersonageRepository {
	private List<Personage> personages;

	public PersonageRepository() {
		personages = new ArrayList<>();
	}
	
	public List<Personage> getPersonages() {
		return personages;
	}
	
	public void voegToe(Personage personage) {
		personages.add(personage);
	}
}
	