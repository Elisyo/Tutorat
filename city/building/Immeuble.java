package city.building;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Immeuble {

	private String address;
	private List<Etage> etages = new ArrayList<Etage>();

	public Immeuble(String address){
		this.address = address;
		initEtages();
	}
	
	public void initEtages() {
		Random r = new Random();
		int valeur = 2 + r.nextInt(5 - 2);
		for (int i = 0; i < valeur; i++) {
			etages.add(new Etage(i+""));
		}
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<Etage> getEtages() {
		return etages;
	}
	public void setEtages(List<Etage> etages) {
		this.etages = etages;
	}
	
	public String toString() {
		return "Adresse : " + address + " ; nombre d'étages : " + etages.size() + "\n";
	}
}
