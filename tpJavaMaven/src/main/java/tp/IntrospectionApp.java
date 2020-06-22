package tp;

import java.lang.reflect.Field;

public class IntrospectionApp {

	public static void main(String[] args) {
		String nomClasse="tp.data.Produit";
		//String nomClasse="java.text.SimpleDateFormat";
		try {
			Class c = Class.forName(nomClasse); //c de type java.lang.Class (méta classe)
			//est un objet technique decruit la structure d'une classe java ordinaire
			Field[] tabChamps = c.getDeclaredFields();
			for(Field f : tabChamps) {
				System.out.println("attribut " + f.getName() + " " + f.getType().getName());
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
