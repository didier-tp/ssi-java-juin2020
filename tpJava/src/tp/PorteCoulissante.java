package tp;

public class PorteCoulissante extends Porte {
    private int translationGlissiere=0; //0 si fermée , 90 si ouvert (cm) 
    
    private void glisser(int translation) {
    	this.translationGlissiere = translation;
    	System.out.println("porte coulissante avec translation:" + this.translationGlissiere);
        //...
    }

	@Override
	public void ouvrir() {
		//super.ouvrir();
		this.glisser(90);//90cm
	}

	@Override
	public void fermer() {
		//super.fermer();
		this.glisser(0);//0cm
	}
    
    
}
