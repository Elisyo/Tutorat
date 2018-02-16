package city.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import city.building.Appartement;
import city.building.Stage;
import city.building.Flat;
import city.people.Owner;

public class CityMain {

	static List<Flat> imbs;
	static List<?> persons;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String [] args ){
		imbs = new ArrayList<Flat>();
		persons = new ArrayList<>();
		menu();
	}

	public static void menu() {
		boolean exit = false;
		do {
			System.out.println("======================== MENU ========================");
			System.out.println("Que voulez-vous faire ?");
			System.out.println("1. Gérer les batiments");
			System.out.println("2. Gérer les personnes");
			System.out.println("3. Quitter l'application");
			System.out.println("Merci d'indiquer le numéro correspondant.");
			String str = sc.nextLine();
			switch (str) {
			case "1":
				manageBuildings();
				break;
			case "2":
				managePerson();
				break;
			case "3":
				exit = true;
				break;
			default:
				System.out.println("Merci de rentrer une valeur entre 1 et 3.");
				break;
			}
		}while(!exit);
	}
	
	public static void manageBuildings() {
		boolean goodUser = false;
		System.out.println("======================== Gestion des batiments ========================");
		do {
			System.out.println("Que voulez-vous faire ?");
			System.out.println("1. Créer un batiment");
			System.out.println("2. Voir tous les batiments (voir toutes les adresses)");
			System.out.println("3. Gérer un batiment");
			System.out.println("4. Supprimer un batiment");
			System.out.println("5. Supprimer tous les batiments");
			System.out.println("6. Retourner au menu");
			System.out.println("Merci d'indiquer le numéro correspondant.");
			
			String str = sc.nextLine();
			switch (str) {
			case "1":
				createOneBuilding();
				break;
			case "2":
				System.out.println("Liste des immeubles : \n"+imbs);
				break;
			case "3":
				// gestion d'un batiment
				break;
			case "4":
				// supprimer un batiment
				break;
			case "5":
				imbs.clear();
				break;
			case "6":
				goodUser=true;
				break;
			default:
				System.out.println("Merci de rentrer une valeur entre 1 et 5.");
				goodUser=false;
				break;
			}
		}while(!goodUser);
	}

	private static void createOneBuilding() {
		boolean goodUser = false;
		System.out.println("======================== Création d'un batiment ========================");
		do {
			System.out.println("Rentrez l'adresse de ce batiment ?");
			String adress = sc.nextLine();
			
			System.out.println("Voici l'adresse rentrée : " + adress);
			System.out.println("Est-ce bien cela ?");
			System.out.println("1. Oui");
			System.out.println("2. Non");
			System.out.println("Merci d'indiquer le numéro correspondant.");
			String sure = sc.nextLine();
			
			switch (sure) {
			case "1":
				imbs.add(new Flat(adress));
				goodUser=true;
				break;
			case "2":
				goodUser=false;
				break;
			default:
				System.out.println("Merci de rentrer une valeur entre 1 et 2.");
				goodUser=false;
				break;
			}
		}while(!goodUser);
	}
	
	public static void manageOneBuilding() {
		System.out.println("Liste des etages du " + imbs.get(0).getAddress() + ": "+imbs.get(0).getEtages());
		Owner florian = new Owner("Florian", "Guilbert");
		imbs.get(0).getEtages().get(0).getAppartements().get(0).setOwner(florian);
		System.out.println("Liste des apparts du " + imbs.get(0).getAddress() + ": "+imbs.get(0).getEtages().get(0).getAppartements());
	}
	
	public static void managePerson() {
		
	}

	public static void createPerson() {
		boolean goodUser = false;
		do {
			goodUser = true ;
			System.out.println("======================== Création d'une personne ========================");
			System.out.println("Quel type de personne voulez-vous créer ?");
			System.out.println("1. Une simple personne");
			System.out.println("2. Un propriétaire");
			System.out.println("3. Un locataire");
			System.out.println("4. Un habitant");
			System.out.println("Merci d'indiquer le numéro correspondant.");

			String str = sc.nextLine();
			switch (str) {
			case "1":

				break;

			case "2":

				break;

			case "3":

				break;

			case "4":

				break;

			default:
				System.out.println("Merci de rentrer une valeur entre 1 et 4.");
				goodUser=false;
				break;
			}
		}while(!goodUser);
	}
}
