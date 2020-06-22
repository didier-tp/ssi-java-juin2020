package tp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.FileSystems;
//import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import tp.data.Produit;

public class FileApp {

	public static void main(String[] args) {
		// lire le fichier produits.csv et remonter le contenu dans une collection de String
		List<String> listeLignes = new ArrayList<>();
		try {
			FileInputStream ifile = new FileInputStream("produits.csv"); //sera recherché à la racine du projet eclipse tpJavaMaven
			BufferedReader dis =
			    new BufferedReader(new InputStreamReader(ifile));
			//Scanner dis = new Scanner(ifile);
			
			String ligneLue="";
			while (ligneLue!=null) {
				   /* if(dis.hasNext())
				       ligneLue=dis.next();
				   else ligneLue=null; */
			       ligneLue = dis.readLine(); // lecture d'une ligne dans le fichier
			       //ajouter ligneLue dans listeLignes
			       if(ligneLue!=null)
			    	   listeLignes.add(ligneLue);
			}
			dis.close(); 
			ifile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*//version simplifiée via nio (classes java plus récentes)
		try {
			listeLignes = Files.readAllLines(
					FileSystems.getDefault().getPath("produits.csv"), StandardCharsets.UTF_8);
		} catch (IOException e1) {
			e1.printStackTrace();
		}*/
		
		// transformer la liste de lignes lues (List<String>) en liste de produit (List<Produit>)
		List<Produit> listeProduits = new ArrayList<>();
		listeLignes.remove(0);//on ignore la première ligne lue
		for(String ligne : listeLignes  ) {
			String[] parties = ligne.split(";");
			//parties[0] : valeur de l'id , Integer.parseInt()
			//parties[1] : valeur du label , 
			//parties[2] : valeur du prixHt , Double.parseDouble()
			//parties[3] : valeur du tauxTva , Double.parseDouble()	
			Produit produit = new Produit();
			produit.setId(Integer.parseInt(parties[0])); 
			produit.setLabel(parties[1]);
			produit.setPrixHt(Double.parseDouble(parties[2]));
			produit.setTauxTva(Double.parseDouble(parties[3]));
			listeProduits.add(produit);
		}
		// via une boucle for , on calculera la somme des prix
		double prixTotal=0.0;
		for(Produit prod : listeProduits) {
			prixTotal+=prod.getPrixHt(); //prixTotal=prixTotal+prod.getPrixHt(); 
		}
		
		//générer un fichier produits.json dans le format JSON .
		try {
			ObjectMapper objMapperJackson = new ObjectMapper();
			String listeProduitsAsJsonString = objMapperJackson.writeValueAsString(listeProduits);
			//equivalent java de JSON.stringify()
			/*
			Produit[] tabProduits = objMapperJackson.readValue(listeProduitsAsJsonString, Produit[].class);
			//equivalent java de JSON.parse()
			for(Produit p: tabProduits)
			    System.out.println("p="+p);
			*/
			System.out.println("listeProduitsAsJsonString="+listeProduitsAsJsonString);
			
			FileOutputStream of = new FileOutputStream("produits.json");
			objMapperJackson.writeValue(of, listeProduits);
			of.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		// afficher la somme des prix à l'écran
		System.out.println("prixTotal="+prixTotal);
		
		//Tp falculatif , générer un fichiers stats.txt
		//qui comporte la ligne prixTotal=...
		try {
			FileOutputStream of = new FileOutputStream("stats.txt"); //ce ficher sera visible après un refresh
			PrintStream ps = new PrintStream(of);
			ps.println("prixTotal (HT)="+prixTotal);
			ps.println("...");
			ps.close(); of.close();// fermetures dans l'ordre inverse des ouvertures:
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
