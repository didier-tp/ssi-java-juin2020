package tp;

public class Porte {
	private String couleur;
	public void ouvrir() { System.out.print("ouverture ..."); }
	public void fermer() { System.out.print("fermeture ..."); }

	public Porte() {
		super();
	}
	public Porte(String couleur) {
		super();
		this.couleur = couleur;
	}
	
	
	@Override
	public String toString() {
		return "Porte [couleur=" + couleur + "]";
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
}
