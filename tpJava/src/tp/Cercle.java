package tp;

public class Cercle {
	private double xc;
	private double yc;
	private double rayon ;
	//...
	
	//avec get, set , constructeurs , toString() , ...
	
	
	public Cercle(double xc, double yc, double rayon) {
		super();
		this.xc = xc;
		this.yc = yc;
		this.rayon = rayon;
	}
	
	public Cercle() {
		super();
	}
	
	
  
	@Override
	public String toString() {
		return "Cercle [xc=" + xc + ", yc=" + yc + ", rayon=" + rayon + "]";
	}

	public double perimetre(){
	    return 2*Math.PI*this.rayon;
	}
	
	

	public double surface(){
		//PI*rayon*rayon
		return Math.PI*Math.pow(rayon,2);
	}

	public double getXc() {
		return xc;
	}

	public void setXc(double xc) {
		this.xc = xc;
	}

	public double getYc() {
		return yc;
	}

	public void setYc(double yc) {
		this.yc = yc;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
	
}
