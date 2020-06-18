package tp;

public class MyApp {

	public static void main(String[] args) {
		System.out.println("Hello world");
		//m1();
		//m2();
		//testPersonne();
		testPorte();
		//testGc();
		//testStringEtTableau();
		//testAvion();
		/*MyApp myApp = new MyApp();
		myApp.testMath();*/
		//testStatic();
		//testCercle();
	}
	
	public static void testPorte() {
		Porte p=null;
		PorteCoulissante pc = new PorteCoulissante();
		PorteBattant pb = new PorteBattant();
		p = pc;
		p.ouvrir(); p.fermer(); //Polymorphisme
		/*
		 En langage C , if( p.type == PORTE_COULISSANTE)
		          ouvrirPorteCoulissante(p);
		      else if( p.type == PORTE_BATTANT)
		            ouvrirPorteBattant(p);
		 */
		p = pb;
		p.ouvrir(); p.fermer(); //Polymorphisme
		
		//------------- polymorphimse en boucle -----
		Porte[] tabRefPortes = new Porte[2];
		tabRefPortes[0]=pc;
		tabRefPortes[1]=pb;
		for(int i=0;i<2;i++) {
			tabRefPortes[i].ouvrir();
		}
		for(int i=0;i<2;i++) {
			tabRefPortes[i].fermer();
		}
	}
	
	public static void testCercle() {
		int a=0;
		System.out.println("a="+a);
		Cercle c1= new Cercle();
		MyUtil.display("coordonnées de c1=" + c1); //ou bien + c1.toString()
		c1.setXc(5);c1.setYc(15);c1.setRayon(100);
		MyUtil.display("coordonnées de c1=" + c1); //ou bien + c1.toString()
		MyUtil.display("perimetre de c1=" + c1.perimetre());
		MyUtil.display("surface de c1=" + c1.surface());
		//...
		Cercle c2= new Cercle(12.0,12.0,50.0);//xc,yc,rayon
		MyUtil.display("coordonnées de c2=" + c2); //ou bien + c1.toString()
		MyUtil.display("perimetre de c2=" + c2.perimetre());
		MyUtil.display("surface de c2=" + c2.surface());
	}
	
	public static void testStatic() {
		String nom = MyUtil.input("nom:");
		MyUtil.display("nom="+nom);
		//Integer age = Integer.parseInt(MyUtil.inputDlg("age:"));
		//MyUtil.displayDlg("age="+age);
		MyUtil.display("VITESSE_MAXI_STOP="+Reglements.VITESSE_MAXI_STOP);
		
		MyUtil.display("vitesseMaxiAgglomeration="+Reglements.vitesseMaxiAgglomeration);
		Reglements.vitesseMaxiAgglomeration=45;
		MyUtil.display("vitesseMaxiAgglomeration="+Reglements.vitesseMaxiAgglomeration);
	}
	
	public  void testMath() {
		double x = Math.sin(Math.PI/2);
		System.out.println("x="+x);
	}
	
	public static void testAvion() {
		AvionV1 avion1 = new AvionV1(); 
		avion1.initialiser();
		avion1.addElement(new Personne("Jean Bon",42,68.4));
		avion1.afficher();
	}
	
	public static void testStringEtTableau() {
		String s1="azerty";
		//construire s1Inverse et l'afficher (.charAt(i))
		StringBuilder buffer=new StringBuilder(s1.length());
		for(int i=s1.length()-1;i>=0;i--) {
			buffer.append(s1.charAt(i));
		}
		String s1Inverse = buffer.toString();
		System.out.println("s1Inverse ="+s1Inverse);
		
		String s2="juin";
		//afficher en majuscule
		String s2Maj = s2.toUpperCase();
		System.out.println("s2Maj="+s2Maj);
		
		String s3="rueXy;75001;Paris";
		//récuperer et afficher la sous-chaine entre les 2 ;
		//.indexOf()  , .lastIndexOf() , .substring
		int posPremierPointVirgule=s3.indexOf(";");
		int posDeuxiemePointVirgule=s3.lastIndexOf(";");
		String codePostal = s3.substring(posPremierPointVirgule+1, posDeuxiemePointVirgule);
		System.out.println("codePostal="+codePostal);
		
		//page 35 inspiration
		//construire un tableau de 10 entier avec les valeurs 0,1,9
		int[] tab1 = new int[10];
		for(int i=0;i<tab1.length;i++) {
			tab1[i]=i;
		}
		int[] tab2 = new int[tab1.length];
		//construire un 2eme tableau ou chaque valeur est le double du tableau 1 
		//+ affichage (version boucle while ET AUSSI boucle for)
		for(int i=0;i<tab1.length;i++) {
			tab2[i]=2*tab1[i];
		}
		int index=0;
		while(index<tab2.length) {
			System.out.println(tab2[index]);
			index++;
		}
		
		int tab3[] = { 2 , 5 , 8 ,9, 4 };
		//calculer et afficher la moyenne
		int somme=0;
		for(int i=0;i<tab3.length;i++) {
			somme+=tab3[i];//somme=somme+tab3[i];
		}
		int moyenne = somme/tab3.length;
		System.out.println("moyenne="+moyenne);
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
		//System.out.println("p2="+p2);//p2.toString() appelé implicitement
		p2.setAge(-50);//valeur interdite refusée
		p2.afficher();
		if(p1.equals(p2)) {
			System.out.println("p1 et p2 ont les memes valeurs");
		}else{
			System.out.println("p1 et p2 ont des valeurs différentes");
		}
		
		Personne eOuP = null;
		Employe e1 = new Employe();
		e1.setNom("axelle Aire"); e1.setPoids(67.7); e1.setAge(33);
		e1.setSalaire(2500.0);
		//e1.afficher();
		MyUtil.display(e1.toString());
		
		//eOuP=p1;
		eOuP=e1;
		//eOuP=new Employe();
		eOuP.incrementerAge();
		if(eOuP instanceof Employe) {
			//Employe eOuPasEmploye = (Employe) eOuP;
			//eOuPasEmploye.setSalaire(2700.0);
			((Employe)eOuP).setSalaire(2700.0);
		}
		
		//Personne eOuP = null; quelques lignes au dessus
		eOuP = new Personne("nom1",45,67.0);
		MyUtil.display("** eOuP.toString()="+eOuP.toString()); //Polymorphisme
		eOuP = new Employe("nom1",45,67.0,2500.0);
		MyUtil.display("** eOuP.toString()="+eOuP.toString()); //Polymorphisme
		
		
		
		Employe e2 = new Employe("alex Therieur",45,88.88,2000.0);//nom,age,poids,salaire
	    e2.augmenterSalairePct(3); //3% augmentation
	    e2.incrementerAge();
		MyUtil.display(e2.toString());
		
		
		Commercial c1;
		c1 = new Commercial("c1",43,67.0,1500.0);
		c1.setTauxCommission(1.0);
		c1.setVentesDuMois(30000.0);
		
		Employe eOuC;
		eOuC=c1;
		MyUtil.display("salaireTotal de eOuC=c1 :"+eOuC.getSalaireTotal());
		eOuC=e1;
		MyUtil.display("salaireTotal de eOuC=e1 :"+eOuC.getSalaireTotal());
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
