package city.building;

import java.util.ArrayList;
import java.util.List;

import city.people.LeaseHolder;
import city.people.Owner;
import city.people.Resident;

public class Appartement {

	private int number;
	private Owner owner;
	private LeaseHolder leaseHolder;
	private List<Resident> residents = new ArrayList<Resident>();
	
	public Appartement(int number) {
		this.number=number;
	}
	
	@Override
	public String toString() {
		String myToString = "Appartement " + number;
		
		if(owner!=null) {
			myToString = myToString + "; proprio : " + owner;
		}
		if(leaseHolder!=null){
			myToString = myToString + "; locataire : " + leaseHolder;
		}
		if(residents.size()!=0) {
			myToString = myToString + "; liste des habitants : " + residents; 
		}
		return myToString;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public LeaseHolder getLeaseHolder() {
		return leaseHolder;
	}
	public void setLeaseHolder(LeaseHolder leaseHolder) {
		this.leaseHolder = leaseHolder;
	}

	public List<Resident> getResidents() {
		return residents;
	}
	public void setResidents(List<Resident> residents) {
		this.residents = residents;
	}
}
