package tp;

public class PorteBattant extends Porte {
     private int angleRotation=0; //0 fermée , 90 degré = ouvert
     
     private void pivoter(int angle) {
    	 this.angleRotation=angle;
    	 System.out.println("porte a 1 battant, angle rotation:"+this.angleRotation);
     }

	@Override
	public void ouvrir() {
		super.ouvrir();
		this.pivoter(90);//90 degrés
	}

	@Override
	public void fermer() {
		super.fermer();
		this.pivoter(0);//0 degré
	}
     
     
}
