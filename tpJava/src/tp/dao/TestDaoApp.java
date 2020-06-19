package tp.dao;

import java.util.List;

import tp.data.Devise;
import util.MyUtil;

public class TestDaoApp {
	
	public static void testException1() {
		int a=6;
		int b=Integer.parseInt(MyUtil.inputDlg("b="));
		try {
			int res=a/b;
			System.out.println("res="+res);
		} catch (Exception e) {
			//System.err.println(e.getMessage());
			e.printStackTrace();
			// eventuel System.exit(0); pour arreter le programme
		}
		System.out.println("suite");
	}
	
	public static void testException2() {
	    String nombreSaisiEnTantString = MyUtil.inputDlg("x="); // "12.5" , "3a"
	    double x= Double.parseDouble(nombreSaisiEnTantString);
	    x=x*10;
	    System.out.println("x="+x);
	}

	public static void main(String[] args) {
		//testException1();
		testException2();
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
        List<Devise> toutesDevises = deviseDao.rechercherToutesDevises();
        for(Devise d : toutesDevises) {
        	System.out.println("\t"+d); // "\t" est une tabulation
        }
        
        Devise deviseAmodifier = nouvelleDevise;
        deviseAmodifier.setNom("Monnaie Singe Reevaluee");
        deviseAmodifier.setChange(3455.666);
        deviseDao.updateDevise(deviseAmodifier);
        
        //...récuper via deviseDao.rechercherDevise la devise de code ="MS"
        //afficher les valeurs
        Devise deviseMS_relue=deviseDao.rechercherDevise("MS");
        System.out.println("deviseMS_relue="+ deviseMS_relue);
        
        //...supprimer la monnaie de code "MS" + eventuelle verification
        deviseDao.supprimerDevise("MS");
        deviseMS_relue=deviseDao.rechercherDevise("MS");
        if(deviseMS_relue==null) {
        	System.out.println("devise MS bien suprimee");
        }
        //toutesDevises = deviseDao.rechercherToutesDevises();
        //System.out.println("toutesDevises apres suppression:"+toutesDevises);
	}

}
