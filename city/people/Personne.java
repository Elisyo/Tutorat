package city.people;

public class Personne {

	private String firstname;
	private String lastname;
	
	public Personne (String firstname, String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String toString(){
		return firstname + " " + lastname;
	}
}
