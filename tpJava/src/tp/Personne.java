package tp;

public class Personne {
   public String nom;
   //public int age; // 0 par défaut
   public Integer age; //null par défaut
   public Double poids;
   
   
   
  


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((age == null) ? 0 : age.hashCode());
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	result = prime * result + ((poids == null) ? 0 : poids.hashCode());
	return result;
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
   
}
