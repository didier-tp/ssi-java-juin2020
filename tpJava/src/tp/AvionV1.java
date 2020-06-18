package tp;

public class AvionV1 {
	
	private Personne[] tabElements;
	private int nbElements;
	private int tailleMax=50;
	
	public AvionV1(){
		//tailleMax=50;
		tabElements = new Personne[tailleMax]; //tableau de 50 références (au début à null)
		                                       //vers des personnes
		nbElements=0;
	}
	
	public void initialiser(){
		this.addElement(new Employe("pilote",45,68.4,4000.0));
		this.addElement(new Employe("hotesse",35,58.4,2000.0));
		this.addElement(new Personne("passager1",55,78.4));
		this.addElement(new Personne("passager2",25,88.4));
	}
	
	public void addElement(Personne p){
		if(nbElements<tailleMax) {
			tabElements[nbElements]=p;
			nbElements++;
		   }
		else {
			System.err.println("plus de place disponible");
		}
	}
	
	public void afficher() {
		System.out.println("avion nbElements=" + this.nbElements);
		for(int i=0;i<this.nbElements;i++) {
			System.out.println("\t"+this.tabElements[i].toString());//polymorphisme
		}
	}

}