package tp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCollectionApp {

	public static void printCollection(Collection<String> col){
		for(String e : col) {
			System.out.println("e="+e);
		}
	}
	
	public static void main(String[] args) {
		//m1();
		m2();
	}
	
	public static void m2() {
		//déclarer et construire une liste de Double
		
		//ajouter quelques valeurs dans la liste
		//ex: 1.2  3.3   5    2.8  2.9  4.0
		
		//parcourir les valeurs de la liste et calculer la somme 
		
		//calculer et afficher la moyenne
		
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
