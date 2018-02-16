package city.bank;

import java.util.ArrayList;

import city.people.Person;

public class Bank {

	ArrayList<Client> clients;
	
	public Bank() {
		this.clients = new ArrayList<Client>();
	}
	
	/**
	 * Crée un client dans une banque à partir d'une personne présente dans la ville
	 * @param person
	 */
	public void createClient(Person person) {
		Client c = new Client(person.getFirstname(), person.getLastname());
		if(!clients.contains(c)) {
			clients.add(c);
		} else {
			System.out.println("Ce client est déjà présent dans la banque");
		}
	}
	
	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
}
