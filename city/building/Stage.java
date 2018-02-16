package city.building;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stage {

	private String numEtage;
	private List<Appartement> appartements = new ArrayList<Appartement>();

	public Stage(String numero){
		if(numero.equals("0")) {
			this.numEtage = "RDC";
		} else {
			this.numEtage = numero;
		}
		initAppartements();
	}
	
	public void initAppartements() {
		Random r = new Random();
		int valeur = 2 + r.nextInt(5 - 2);
		for (int i = 1; i < valeur+1; i++) {
			appartements.add(new Appartement(i));
		}
	}
	
	public String getNumEtage() {
		return numEtage;
	}
	public void setNumEtage(String numEtage) {
		this.numEtage = numEtage;
	}

	public List<Appartement> getAppartements() {
		return appartements;
	}
	public void setAppartements(List<Appartement> appartements) {
		this.appartements = appartements;
	}
	
	@Override
	public String toString() {
		return numEtage;
	}
}
