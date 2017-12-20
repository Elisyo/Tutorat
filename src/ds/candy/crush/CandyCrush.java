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
	 * Boite à outils transformant mes lettres en int
	 * @param x
	 * @return
	 */
	public static int translate(char x){
		switch (x) {
		case 'A':
			return 1;
		case 'B':
			return 2;
		case 'C':
			return 3;
		case 'D':
			return 4;
		case 'E':
			return 5;
		default:
			break;
		}
		return 0;
	}
	
	/**
	 * Je regarde si les 2 cases données par l'utilisateur sont bien adjacentes
	 * @param cases
	 * @return
	 */
	public static boolean casesAdjacentes(String cases){
		char ligneChar1 = cases.charAt(0);
		int ligne1 = translate(ligneChar1);
		char colonneChar1 = cases.charAt(1);
		int colonne1 = colonneChar1-48;
		
		char ligneChar2 = cases.charAt(2);
		int ligne2 = translate(ligneChar2);;
		char colonneChar2 = cases.charAt(3);
		int colonne2 = colonneChar2-48;
		
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
		
		return false;
	}
	
	
	
	public static void main(String [] args){
		char [][] plateau = initialisation();
		affichage(plateau);
		
	}
	
}
