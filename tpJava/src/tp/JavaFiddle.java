package tp;

public class JavaFiddle {

public static void main(String[] args) {
		System.out.println("Hello world");
		JavaFiddle javaFiddle = new JavaFiddle();
		javaFiddle.testPersonne();
	}
	
	public  void testPersonne() {
		Personne p1=null;
		p1 = new Personne("toto",45,60.0);
		//avec v1 (tout en public): p1.nom="Dupond"; p1.age=45; p1.poids=60.0;
		p1.setNom("Dupond"); p1.setAge(45); p1.setPoids(60.0);
		p1.incrementerAge();
		//p1.afficher();
		System.out.println("p1="+p1.toString());
		
		Personne p2=null;
		p2 = new Personne();//via constructeur par defaut
		p2.setNom("Durant"); p2.setAge(35); p2.setPoids(40.0);
		p2.incrementerAge();
		p2.afficher();
		//System.out.println("p2="+p2);//p2.toString() appelé implicitement
		p2.setAge(-50);//valeur interdite refusée
		p2.afficher();
		if(p1.equals(p2)) {
			System.out.println("p1 et p2 ont les memes valeurs");
		}else{
			System.out.println("p1 et p2 ont des valeurs différentes");
		}
	}
	
	public class Personne{
		private String nom;
		   //public int age; // 0 par défaut
		   private Integer age; //null par défaut
		   private Double poids;
		   

		public Personne() {
			super();
		}

		//MALHEUREUSEMENT PAS de =valeur par défaut comme en c++ !!!!
		//public Personne(String nom="?", Integer age=0, Double poids=0.0) impossible en java (snif, snif)
		public Personne(String nom, Integer age, Double poids) {
			super();
			this.nom = nom;
			this.age = age;
			this.poids = poids;
		}
 
		  
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Personne other = (Personne) obj;
			if (age == null) {
				if (other.age != null)
					return false;
			} else if (!age.equals(other.age))
				return false;
			if (nom == null) {
				if (other.nom != null)
					return false;
			} else if (!nom.equals(other.nom))
				return false;
			if (poids == null) {
				if (other.poids != null)
					return false;
			} else if (!poids.equals(other.poids))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "Personne [nom=" + nom + ", age=" + age + ", poids=" + poids + "]";
		}


		public void afficher() {
			 System.out.println(this.toString());
			   //System.out.println("personne nom="+this.nom + " age="+ this.age + " poids=" + this.poids);
		   }
		   
		public void incrementerAge() {
			   this.age++;
			   //this.age = this.age + 1;
		}


		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			if(age<0) {
				 System.err.println("age négatif invalide");
				 //throw new RuntimeException("age négatif invalide");
			}else {
			    this.age = age;
			}
		}


		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}


		public Double getPoids() {
			return poids;
		}


		public void setPoids(Double poids) {
			this.poids = poids;
		}

	}
	

}

