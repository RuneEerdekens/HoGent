package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Lift;

public class LiftTest {
	Lift L;

	@BeforeEach
	private void setUp() {
		L = new Lift(-5, 5);
	}

	@Test
	void liftGaatOmhoog_netGeldigeWaardeOndergrens() { // Geldig
		L.gaNaarOmhoog(1);
		assertEquals(1, L.getVerdieping());
	}

	@Test
	void liftGaatOmhoog_ruimGeldigeWaarde(){ // Geldig
		L.gaNaarOmhoog(3);
		assertEquals(3, L.getVerdieping());
	}

	@ParameterizedTest
	@ValueSource(ints= {5, 6, 1000})
	void liftGaatOmhoog_GeldigeWaardeBovengrens(int waarde){ //
		L.gaNaarOmhoog(waarde);
		assertEquals(5, L.getVerdieping());
	}

	@ParameterizedTest
	@ValueSource(ints = { -1000, 0 })
	void liftGaatOmhoog_ongeldigeWaardeOndergrens(int waarde) { // fout
		
		assertThrows(IllegalArgumentException.class, () -> L.gaNaarOmhoog(waarde));
	}
}
