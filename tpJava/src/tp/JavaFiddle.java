package tp;

public class JavaFiddle {

public static void main(String[] args) {
		System.out.println("Hello world");
		JavaFiddle javaFiddle = new JavaFiddle();
		javaFiddle.testPersonne();
	}
	
	public  void testPersonne() {
		Personne p1=null;
		p1 = new Personne();
		p1.nom="Dupond"; p1.age=45; p1.poids=60.0;
		p1.incrementerAge();
		p1.afficher();
		
		Personne p2=null;
		p2 = new Personne();
		p2.nom="jean Bon"; p2.age=35; p2.poids=40.0;
		p2.incrementerAge();
		p2.afficher();
	}
	
	public class Personne{
		   public String nom;
		   //public int age; // 0 par défaut
		   public Integer age; //null par défaut
		   public Double poids;
		   
		   public void afficher() {
			   System.out.println("personne nom="+this.nom + " age="+this.age + " poids=" + this.poids);
		   }
		   
		   public void incrementerAge() {
			   this.age++;
			   //this.age = this.age + 1
		   }
	}
	

}

