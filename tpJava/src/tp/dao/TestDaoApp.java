package tp.dao;

import tp.data.Devise;

public class TestDaoApp {

	public static void main(String[] args) {
        DeviseDao deviseDao = null; //DeviseDao est une interface
        deviseDao = new DeviseDaoSimulation();
        Devise deviseDollar = deviseDao.rechercherDevise("USD");
        System.out.println("deviseDollar= "+deviseDollar);
	}

}
