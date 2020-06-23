package tp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tp.data.Produit;

public class LambdaApp {

	public static void main(String[] args) {

        List<Produit> listeProduits = new ArrayList<>();
        listeProduits.add(new Produit(1,"stylo",1.2,20.0));
        listeProduits.add(new Produit(2,"classeur",3.2,20.0));
        listeProduits.add(new Produit(3,"gomme",2.0,20.0));
        listeProduits.add(new Produit(4,"cahier",4.0,20.0));

        for(Produit p : listeProduits) {
        	System.out.println(p);
        }
        
        //trier par ordre croissant de prix avec une lambda expression avec ? : ou une soustraction
        Collections.sort(listeProduits,  );
        
        
        //afficher
        
        
        //trier par odre alphabétique sur le label avec une lambda expression qui utilise .compare sur la sous partie label
        //Collections.sort(listeProduits,  );
        
        //afficher
        
	}

}
