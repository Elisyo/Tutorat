package location;
import java.util.ArrayList;
import java.util.List;

public class Etage {

	private List<Appartement> appartements;

	public Etage(){
		appartements = new ArrayList<Appartement>();
	}
	
	public List<Appartement> getAppartements() {
		return appartements;
	}

	public void setAppartements(List<Appartement> appartements) {
		this.appartements = appartements;
	}
}
