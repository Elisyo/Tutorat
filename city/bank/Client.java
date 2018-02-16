package city.bank;

import java.util.ArrayList;

import city.people.Person;

public class Client extends Person{

	ArrayList<Account> accounts;
	
	public Client(String firstname, String lastname) {
		super(firstname, lastname);
		accounts = new ArrayList<Account>();
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
}
