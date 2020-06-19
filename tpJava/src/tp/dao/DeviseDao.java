package tp.dao;

import java.util.List;

import tp.data.Devise;

/*
 * DAO = Data Access Object (objet java sp�cialis� dans l'acc�s aux donn�es)
 * avec m�thodes "CRUD" (Create/Cr�er , Rechercher , Update , Delete)
 */
public interface DeviseDao {
     public Devise creerDevise(Devise d); //ajout en memoire ou INSERT INTO
     public Devise rechercherDevise(String code);
     public List<Devise> rechercherToutesDevises(); //SELECT SQL
     public void updateDevise(Devise d);
     public void supprimerDevise(String code);
}
