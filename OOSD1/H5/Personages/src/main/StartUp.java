package main;

import domein.DomeinController;
import cui.PersonagesApplicatie;

public class StartUp {

	public static void main(String[] args) {
		DomeinController dc = new DomeinController();
		PersonagesApplicatie persApp = new PersonagesApplicatie(dc);
		persApp.start();
	}

}
