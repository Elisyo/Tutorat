package location;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String [] args ){
		
		List<Immeuble> imb = new ArrayList<Immeuble>();
		
		imb.add(creerImmeuble());
		
	}
	
	public static Immeuble creerImmeuble(){
		Immeuble im = new Immeuble();
		im.getEtages().add(creerEtage());
		return im;
	}
	
	public static Etage creerEtage(){
		Etage et = new Etage();
		et.getAppartements().add(creerAppartement());
		return et;
	}
	
	public static Appartement creerAppartement(){
		Appartement ap = new Appartement();
		return ap;
	}
}
