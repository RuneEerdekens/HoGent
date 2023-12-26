package main;
import cui.TuincentrumApplicatie;
import domein.*;


public class StartUp {
	
	public static void main(String[] args) 
	{
		new TuincentrumApplicatie(new DomeinController()).start();
	}

}
