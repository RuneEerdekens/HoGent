package dto;

public record PersonageDTO(String naam, String omschrijving, int kracht, double snelheid, int lenigheid) {
	
	public PersonageDTO(String naam, String omschrijving) {
		this(naam, omschrijving, 0, 0, 0);
	}
}
