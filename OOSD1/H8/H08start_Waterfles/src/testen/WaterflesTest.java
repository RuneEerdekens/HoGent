package testen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Waterfles;

public class WaterflesTest {

//	@Test
//	void maakWaterfles_geldigeCap_maaktWaterfles() {
//		int cap = 550;
//		Waterfles wf = new Waterfles(cap);
//		assertEquals(cap, wf.getCapaciteit());
//		assertEquals(0, wf.getInhoud());
//	}
//
//	@Test
//	void maakWaterfles_capNetGrootGenoeg_maaktWaterfles() {
//		int cap = 100;
//		Waterfles wf = new Waterfles(cap);
//		assertEquals(cap, wf.getCapaciteit());
//		assertEquals(0, wf.getInhoud());
//	}
//
//	@Test
//	void maakWaterfles_capGrootstMogelijk_maaktWaterfles() {
//		int cap = 2000;
//		Waterfles wf = new Waterfles(cap);
//		assertEquals(cap, wf.getCapaciteit());
//		assertEquals(0, wf.getInhoud());
//	}

//	@Test
//	void maakWaterfles_capTeKlein_maaktWaterfles() {
//		int cap = 50;
//		assertThrows(IllegalArgumentException.class, () -> new Waterfles(cap));
//	}
//
//	@Test
//	void maakWaterfles_capNetTeKlein_maaktWaterfles() {
//		int cap = 99;
//		assertThrows(IllegalArgumentException.class, () -> new Waterfles(cap));
//	}
//
//	@Test
//	void maakWaterfles_capTeGroot_maaktWaterfles() {
//		int cap = 2200;
//		assertThrows(IllegalArgumentException.class, () -> new Waterfles(cap));
//	}
//
//	@Test
//	void maakWaterfles_capNetTeGroot_maaktWaterfles() {
//		int cap = 2001;
//		assertThrows(IllegalArgumentException.class, () -> new Waterfles(cap));
//	}
	private Waterfles wf;
	
	@BeforeEach
	void maakGevuldeFles() {
		wf = new Waterfles(250);
		wf.vulBij(50);	
	}
	

	@ParameterizedTest
	@ValueSource(ints = { 100, 550, 2000 })
	void maakWaterfles_geldigeCap_maaktWaterfles(int cap) {
		Waterfles wf = new Waterfles(cap);
		assertEquals(cap, wf.getCapaciteit());
		assertEquals(0, wf.getInhoud());
	}

	@ParameterizedTest
	@ValueSource(ints = { 50, 99, 2001, 2200 })
	void maakWaterfles_fouteCap_maaktWaterfles(int cap) {
		assertThrows(IllegalArgumentException.class, () -> new Waterfles(cap));
	}

	@ParameterizedTest
	@ValueSource(ints = { 200, 201, 260 })
	void vulBij_hoeveelheidMetOverloopOfNetNiet_flesWordGevuld(int hoeveelheid) {
		wf.vulBij(hoeveelheid);
		assertEquals(wf.getCapaciteit(), wf.getInhoud());
	}

	@ParameterizedTest
	@ValueSource(ints = { 0, -150 })
	void vulBij_HoeveelheidWaterTeKlein_werptException(int hoeveelheidWater) {

		// act-assert
		assertThrows(IllegalArgumentException.class, () -> wf.vulBij(hoeveelheidWater));
	}

	@Test
	void vulBij_geldigeHoeveelheidWater_flesWordtBijgevuld() {
		int hoeveelheidWater = 100;

		// act
		wf.vulBij(hoeveelheidWater);

		// assert
		assertEquals(150, wf.getInhoud());
	}

	@Test
	void vulBij_kleinstMogelijkeWaardeHoeveelheidWater_flesWordtBijgevuld() {
		int hoeveelheidWater = 1;

		// act
		wf.vulBij(hoeveelheidWater);

		// assert
		assertEquals(51, wf.getInhoud());
	}

}
