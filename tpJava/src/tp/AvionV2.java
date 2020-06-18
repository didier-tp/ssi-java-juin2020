package tp;

public class AvionV2 {
	
	private Descriptible[] tabElements;
	private int nbElements;
	private int tailleMax=50;
	
	public AvionV2(){
		//tailleMax=50;
		tabElements = new Descriptible[tailleMax]; //tableau de 50 références (au début à null)
		                                       //vers des choses Descriptibles (Personne ou Bagage ou ...)
		nbElements=0;
	}
	
	public void initialiser(){
		this.addElement(new Employe("pilote",45,68.4,4000.0));
		this.addElement(new Employe("hotesse",35,58.4,2000.0));
		this.addElement(new Personne("passager1",55,78.4));
		this.addElement(new Personne("passager2",25,88.4));
		this.addElement(new Bagage("sacXy",12.5,20.6));
		this.addElement(new Bagage("valiseZz",25.5,50.6));
	}
	
	public void addElement(Descriptible p){
		if(nbElements<tailleMax) {
			tabElements[nbElements]=p;
			nbElements++;
		   }
		else {
			System.err.println("plus de place disponible");
		}
	}
	
	public void afficher() {
		double poidsTotal=0;
		System.out.println("avion nbElements=" + this.nbElements);
		for(int i=0;i<this.nbElements;i++) {
			System.out.println("\t"+this.tabElements[i].getDesignation());//polymorphisme
			poidsTotal += this.tabElements[i].getPoids();//polymorphisme
		}
		System.out.println("poidsTotal des éléments placés dans l'avion (bagages+passagers)="
				           +poidsTotal + " " + Descriptible.UNITE_POIDS);  
	}

}