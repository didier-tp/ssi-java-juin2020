package tp.dao;

import tp.data.Devise;

public class TestDaoApp {

	public static void main(String[] args) {
        DeviseDao deviseDao = null; //DeviseDao est une interface
        deviseDao = new DeviseDaoSimulation();
        Devise deviseDollar = deviseDao.rechercherDevise("USD");
        System.out.println("deviseDollar= "+deviseDollar);
        
        //Tests qui enchaine ajout , recup liste complete
        //modif , recupere via code pour verfier mise à jour
        //suppression
        Devise nouvelleDevise = new Devise("MS","Monnaie Singe",1223445555.0);
        deviseDao.creerDevise(nouvelleDevise); //creer/ajouter/sauvegarder
        
        //Récuperer toute la liste et afficher les devises 1 par 1 (1 par ligne)
        //...
        
        Devise deviseAmodifier = nouvelleDevise;
        deviseAmodifier.setNom("Monnaie Singe Reevaluee");
        deviseAmodifier.setChange(3455.666);
        deviseDao.updateDevise(deviseAmodifier);
        
        //...récuper via deviseDao.rechercherDevise la devise de code ="MS"
        //afficher les valeurs
        
        //...supprimer la monnaie de code "MS" + eventuelle verification
	}

}
