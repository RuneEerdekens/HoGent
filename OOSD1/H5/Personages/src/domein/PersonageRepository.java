package domein;

import java.util.List;

public class PersonageRepository {
	private List<Personage> personages;

	public List<Personage> getPersonages() {
		return personages;
	}
	
	public void voegToe(Personage personage) {
		personages.add(personage);
	}
}
	