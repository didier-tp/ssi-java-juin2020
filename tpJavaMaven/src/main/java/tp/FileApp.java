package tp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import tp.data.Produit;

public class FileApp {

	public static void main(String[] args) {
		// lire le fichier produits.csv et remonter le contenu dans une collection de String
		List<String> listeLignes = new ArrayList<>();
		try {
			FileInputStream ifile = new FileInputStream("....");
			BufferedReader dis =
			    new BufferedReader(new InputStreamReader(ifile));
			
			String ligneLue="";
			while (ligneLue!=null) {
			       ligneLue = dis.readLine(); // lecture d'une ligne dans le fichier
			       //ajouter ligneLue dans listeLignes
			}
			dis.close(); 
			ifile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// transformer la liste de lignes lues (List<String>) en liste de produit (List<Produit>)
		List<Produit> listeProduits = new ArrayList<>();
		listeLignes.remove(0);//on ignore la première ligne lue
		for(String ligne :    ) {
			String[] parties = ligne.split(";")
			//parties[0] : valeur de l'id , Integer.parseInt()
			//parties[1] : valeur du label , 
			//parties[2] : valeur du prixHt , Double.parseDouble()
			//parties[3] : valeur du tauxTva , Double.parseDouble()	
			Produit produit = new Produit();
			//produit.set..(); .
			listeProduits.add(produit);
		}
		// via une boucle for , on calculera la somme des prix
		double prixTotal=0.0;
		//...
		
		// afficher la somme des prix à l'écran
		//...
		
		//Tp falculatif , générer un fichiers stats.txt
		//qui comporte la ligne prixTotal=...

	}

}
