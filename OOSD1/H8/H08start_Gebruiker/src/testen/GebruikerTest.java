package testen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Gebruiker;

public class GebruikerTest {

	@ParameterizedTest
	@ValueSource(strings = {"aa.aaa", "aaa..aaa", "a.a..aa", "a.aaaa", "aaaa.a"})
	void maakGebruiker_gelidgeNaamLenght_maaktGebruiker(String naam) {
		Gebruiker gb = new Gebruiker(naam);
		assertEquals(naam, gb.getGebruikersnaam());
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"a.aa", ".aaaaaa", "aaaaaa.", "aaaaaa", "aaa aaa"})
	void maakGebruiker_ongelidgNaamLenght_maaktGebruiker(String naam) {
		assertThrows(IllegalArgumentException.class, () -> new Gebruiker(naam));
	}
	
	
}
