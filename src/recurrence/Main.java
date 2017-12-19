package recurrence;

public class Main {

	public static void main(String [] args ){
		System.out.println(inversionChaine("fedcba"));
		
		// factorielle de x (ici, x a pour valeur 3)
		System.out.println(factorielleTerminale(3, 1));
		System.out.println(factorielleNonTerminale(3));
	}
	
	private static int factorielleTerminale(int x, int result){
		if(x==1){
			return result;
		} else {
			return factorielleTerminale(x-1, result*x);
		}
	}
	
	private static int factorielleNonTerminale(int x){
		if(x==1){
			return x;
		} else {
			return factorielleNonTerminale(x-1)*x;
		}
	}
	
	private static String inversionChaine(String mot){
		if(mot.length()==0){
			return mot;
		}else{
			return inversionChaine(mot.substring(1)) + mot.substring(0, 1);
		}	
	}	
}

