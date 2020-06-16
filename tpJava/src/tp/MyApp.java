package tp;

public class MyApp {

	public static void main(String[] args) {
		System.out.println("Hello world");
		//m1();
		//m2();
		testPersonne();
	}
	
	public static void testPersonne() {
		Personne p1=null;
		//p1 = .
		//p1.nom;
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
