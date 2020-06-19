package tp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tp.data.Devise;

public class TestCollectionApp {

	public static void printCollection(Collection<String> col){
		for(String e : col) {
			System.out.println("e="+e);
		}
	}
	
	public static void main(String[] args) {
		//m1();
		//m2();
		m3();
	}
	
	public static void m3() {
		List<Devise> listeDevises = new ArrayList<>();
		Devise d1 = new Devise("EUR","Euro",1.0);
		listeDevises.add(d1);
		listeDevises.add(new Devise("USD","Dollar",1.1));
		listeDevises.add(new Devise("GBP","Livre",0.9));
		listeDevises.add(new Devise("JPY","Yen",120.0));
		
		java.util.Collections.sort(listeDevises, new java.util.Comparator<Devise>(){
				@Override
				public int compare(Devise d1, Devise d2) {
					if (d1.getChange() > d2.getChange()) { return 1; }
					else if (d1.getChange() < d2.getChange()) { return -1; }
					else { return 0; }
				}
			});
		
		System.out.println("listeDevises="+listeDevises);//listeDevises.toString() appelé implicitement
	}
	
	public static void m2() {
		//déclarer et construire une liste de Double
		List<Double> listeD = new ArrayList<>();
		//ajouter quelques valeurs dans la liste
		//ex: 1.2  3.3   5    2.8  2.9  4.0
		listeD.add(1.2);		listeD.add(3.3);
		listeD.add(5.0);		listeD.add(2.8);
		listeD.add(2.9);		listeD.add(4.0);
		//parcourir les valeurs de la liste et calculer la somme 
		double somme =0.0;
		for(Double d : listeD) {
			somme+=d;//ou bien somme=somme+d;
		}
		//calculer et afficher la moyenne
		double moyenne=somme/listeD.size();
		System.out.println("moyenne="+moyenne);
		
		System.out.println("listeD="+listeD);
		java.util.Collections.sort(listeD);
		System.out.println("listeD="+listeD);
	}
	
	public static void m1() {
		Set<String> set1 = new HashSet<String>();
		set1.add("France");
		set1.add("Espagne");
		//set1.add("France"); //ligne inutile car France déjà ajouté
		printCollection(set1);
		
		//List<String> liste1 = new LinkedList<String>();
		//List<Object> listeChoses = new ArrayList<Object>();
		List<String> liste1 = new ArrayList<String>();
		liste1.add("lundi");
		liste1.add("mardi");
		liste1.add("mercredi");
		liste1.add("jeudi");
		//liste1.add(5); erreur vue par le compilateur
		liste1.remove("lundi");
		System.out.println("nb elts de liste1="+ liste1.size());
        //liste1.clear();
		
		printCollection(liste1);
		
		for(String jour : liste1) {
			System.out.println("jour="+jour);
		}
		
		for(int i=0;i<liste1.size();i++) {
			String jour = liste1.get(i); //ressemble à tab1[i]
			System.out.println("i="+i +" jour="+jour);
		}
		
        System.out.println("liste1="+liste1.toString());
        
        
        List<Integer> liste2 = new ArrayList<Integer>();
        //List<int> liste2Bis = new ArrayList<int>(); IMPOSSIBLE car int n'est pas un cas particulier de Object
        //liste2.add(new Integer(10));
        liste2.add(10); 
        liste2.add(20);
        for(Integer val : liste2) {
			System.out.println("val="+val);
		}
        
	}

}
