package tp;

//java tp.CarreApp 5 --> 25
//java tp.CarreApp 6 --> 36
//run as / Run configuration / 5 ou 6 dans arguments/programm arguments
public class CarreApp {

	public static void main(String[] args) {
		// recuperer la valeur du premier argument args[0]
		if(args.length<1) {
			System.out.println("il manque un argument.  Usage:  java tp.CarreApp 5");
			System.exit(0);
		}
		// Convertir cette valeur en double (Double.parseDouble())
		double valeur = Double.parseDouble(args[0]);
		
		// res = valeur * valeur;
		double res=valeur * valeur;
		
		//afficher res via S...out.println()
        System.out.println("le carre de "+valeur+" est " + res);
	}

}
