package ds.candy.crush;

/**
 * Fonctions utilitaires
 * @author fguilbert
 *
 */
public class CandyCrush {

	/**
	 * Initialise le tableau
	 * @return char [][] init
	 */
	public static char [][] initialisation(){
		char [][] init = new char [5][8];
		char [] lettresPossibles = new char [5];
		int r=0;
		
		lettresPossibles[0]='B';
		lettresPossibles[1]='O';
		lettresPossibles[2]='J';
		lettresPossibles[3]='V';
		lettresPossibles[4]='R';
		
		for(int i = 0;i<5;i++){
			for (int j = 0; j < 8; j++) {
				r= 0 + (int)(Math.random() * ((4 - 0) + 1));
				if(r>=0&&r<5){
					init[i][j] = lettresPossibles[r];
				}
			}
		}
		
		return init;
	}
	
	/**
	 * Affichage du plateau de jeu
	 * @param plateau
	 */
	public static void affichage(char [][] plateau){
		System.out.println("------------------");
		System.out.println(" | 1 2 3 4 5 6 7 8");
		for(int i = 0;i<5;i++){
			switch (i) {
			case 0:
				System.out.print("A| ");
				break;
			case 1:
				System.out.print("B| ");
				break;
			case 2:
				System.out.print("C| ");
				break;
			case 3:
				System.out.print("D| ");
				break;
			case 4:
				System.out.print("E| ");
				break;
			default:
				break;
			}
			for (int j = 0; j < 8; j++) {
				System.out.print(plateau[i][j] + " ");
			}
			System.out.println("");
		}	
	}
	
	/**
	 * Boite à outils transformant mes lettres en int dans un tableau
	 * @param x
	 * @return
	 */
	public static int [] translate(String cases){
		int [] trans = new int [4];
		for (int i = 0; i < cases.length(); i++) {
			if(i==0 || i==2){
				if(cases.charAt(i) == 'A'){
					trans[i]  =  1;
				}else if(cases.charAt(i) == 'B'){
					trans[i]  =  2;
				}else if(cases.charAt(i) == 'C'){
					trans[i]  =  3;
				}else if(cases.charAt(i) == 'D'){
					trans[i]  =  4;
				}else if(cases.charAt(i) == 'E'){
					trans[i]  =  5;
				}
			}else{
				trans[i]  = cases.charAt(3)-48;
			}
		}
		return trans;
	}
	
	/**
	 * Je regarde si les 2 cases données par l'utilisateur sont bien adjacentes
	 * @param cases
	 * @return
	 */
	public static boolean casesAdjacentes(String cases){
		int [] trans = translate(cases);
		int ligne1 = trans[0];
		int colonne1 = trans[1];
		
		int ligne2 = trans[2];
		int colonne2 = trans[3];
		
		if(ligne1 == ligne2){
			if(colonne1==colonne2-1){
				return true;
			}else if(colonne1==colonne2+1){
				return true;
			}else{
				return false;
			}
		}
		
		if(colonne1 == colonne2){
			if(ligne1==ligne2-1){
				return true;
			}else if(ligne1==ligne2+1){
				return true;
			}else{
				return false;
			}
		}
		
		return false;
	}
	
	public static boolean peutEchanger(char [][] plateau, String cases){
		if(cases.length()>4 || cases.equals("")){
			System.out.println(cases.length());
			return false;
		}
		if(casesAdjacentes(cases)){
			return true;
		}
		return false;
	}
	
	public static char [][] echangeCoordonnees(char [][] plateau, String cases){
		char [][] resultat = plateau;
		int [] trans = translate(cases);
		
		char temp = ' ';
		
		temp = resultat[trans[0]-1][trans[1]-1];
		
		resultat[trans[0]-1][trans[1]-1] = resultat[trans[2]-1][trans[3]-1];
		resultat[trans[2]-1][trans[3]-1] = temp;
		return resultat;
	}
	
	public static void main(String [] args){
		char [][] plateau = initialisation();
		affichage(plateau);
		if(peutEchanger(plateau, "A7B7")){
			plateau = echangeCoordonnees(plateau, "A7B7");
		}
		affichage(plateau);
	}
	
}
