package tp;

public class PorteBattant extends Porte {
     private int angleRotation=0; //0 ferm�e , 90 degr� = ouvert
     
     private void pivoter(int angle) {
    	 this.angleRotation=angle;
    	 System.out.println("porte a 1 battant, angle rotation:"+this.angleRotation);
     }
}
