package city.building;

import java.util.List;

import city.people.Personne;

public class Appartement {

	private Personne owner;
	private List<Personne> residents;
	
	public Appartement() {
	}
	
	public Appartement(Personne owner) {
		this.owner = owner;
	}

	public Personne getOwner() {
		return owner;
	}

	public void setOwner(Personne owner) {
		this.owner = owner;
	}

	public List<Personne> getResidents() {
		return residents;
	}

	public void setResidents(List<Personne> residents) {
		this.residents = residents;
	}
}
