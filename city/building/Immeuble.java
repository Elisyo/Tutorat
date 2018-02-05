package city.building;
import java.util.ArrayList;
import java.util.List;

public class Immeuble {

	private List<Etage> etages;

	public Immeuble(){
		etages = new ArrayList<Etage>();
	}
	
	public List<Etage> getEtages() {
		return etages;
	}

	public void setEtages(List<Etage> etages) {
		this.etages = etages;
	}
}
