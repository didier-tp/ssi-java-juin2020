package tp;

public class Personne {
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
