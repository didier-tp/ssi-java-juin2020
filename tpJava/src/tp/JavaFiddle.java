package tp;

public class JavaFiddle {

public static void main(String[] args) {
		System.out.println("Hello world");
		JavaFiddle javaFiddle = new JavaFiddle();
		javaFiddle.testPersonne();
	}
	
	public  void testPersonne() {
		Personne p1 = null;
		p1 = new Personne();
		p1.nom="dupond";
		System.out.println("nom="+p1.nom);
	}
	
	public class Personne{
		public String nom;
	}
	

}

