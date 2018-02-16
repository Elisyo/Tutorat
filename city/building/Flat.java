package city.building;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Flat {

	private String address;
	private List<Stage> etages = new ArrayList<Stage>();

	public Flat(String address){
		this.address = address;
		initEtages();
	}
	
	public void initEtages() {
		Random r = new Random();
		int valeur = 2 + r.nextInt(5 - 2);
		for (int i = 0; i < valeur; i++) {
			etages.add(new Stage(i+""));
		}
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<Stage> getEtages() {
		return etages;
	}
	public void setEtages(List<Stage> etages) {
		this.etages = etages;
	}
	
	public String toString() {
		return "Adresse : " + address + " ; nombre d'étages : " + etages.size() + "\n";
	}
}
