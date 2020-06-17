package tp;

public class MyApp {

	public static void main(String[] args) {
		System.out.println("Hello world");
		//m1();
		//m2();
		//testPersonne();
		//testGc();
		testStringEtTableau();
	}
	
	
	public static void testStringEtTableau() {
		String s1="azerty";
		//construire s1Inverse et l'afficher (.charAt(i))
		
		String s2="juin";
		//afficher en majuscule
		
		String s3="rueXy;75001;Paris";
		//r�cuperer et afficher la sous-chaine entre les 2 ;
		//.indexOf()  , .lastIndexOf() , .substring
		
		
		//page 35 inspiration
		//construire un tableau de 10 entier avec les valeurs 0,1,9
		
		//construire un 2eme tableau ou chaque valeur est le double du tableau 1 
		//+ affichage (version boucle while ET AUSSI boucle for)
		
		int tab3[] = { 2 , 5 , 8 ,9, 4 };
		//calculer et afficher la moyenne
	}
	
	public static void testGc() {
		int n=10;
	    Personne[] tabRefPers = new Personne[n];
	    for(int i=0;i<n;i++) {
	    	tabRefPers[i]=new Personne();
	    }
	    for(int i=0;i<n;i++) {
	    	tabRefPers[i]=null;
	    }
	    System.gc();
	    try {
			Thread.sleep(1000*5); //5000ms = 5s de pause
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println("fin de testGc");
	}
	
	public static void testPersonne() {
		Personne p1=null;
		p1 = new Personne("toto",45,60.0);
		//avec v1 (tout en public): p1.nom="Dupond"; p1.age=45; p1.poids=60.0;
		p1.setNom("Dupond"); p1.setAge(45); p1.setPoids(60.0);
		p1.incrementerAge();
		//p1.afficher();
		System.out.println("p1="+p1.toString());
		
		Personne p2=null;
		p2 = new Personne();//via constructeur par defaut
		p2.setNom("Durant"); p2.setAge(35); p2.setPoids(40.0);
		p2.incrementerAge();
		p2.afficher();
		//System.out.println("p2="+p2);//p2.toString() appel� implicitement
		p2.setAge(-50);//valeur interdite refus�e
		p2.afficher();
		if(p1.equals(p2)) {
			System.out.println("p1 et p2 ont les memes valeurs");
		}else{
			System.out.println("p1 et p2 ont des valeurs diff�rentes");
		}
	}
	
	public static void m2() {
		String s1 = null;
		System.out.println("s1="+s1);
		s1 = new String("abc");
		String s2 = new String("def");
		String s3 ="ijk";
		System.out.println("s1="+s1);
		
		int i1;
		i1=0; i1=-5; i1=23; 
		//	i1=null; impossible car int pas objet
		Integer oi1=null;
		//oi1=new Integer(4);
		oi1=4;
		// oi1.setValue(5); n'existe pas car IMMUTABLE 
	
	}
	
	public static void m1() {
		String s1="12.5";
		String s2="3.5";
		char carA = 'A';
		String prenom="didier";
		String nom ="Defrance";
		String nomComplet = prenom+" "+nom;
		System.out.println("nomComplet="+nomComplet);
		boolean okOuPas ;
		okOuPas = (3 > 0);
		System.out.println("okOuPas="+okOuPas);
		double v1,v2,res;
		int i1;
		// calculer addition et afficher le resultat
		v1=Double.parseDouble(s1); //12.5
		i1= (int) v1;
		System.out.println("i1="+i1);
		v2=Double.parseDouble(s2);
		res=v1+v2;
		if(res>0) {
			System.out.println("res est positif");
		}
		System.out.println("res="+res);
	}

}
