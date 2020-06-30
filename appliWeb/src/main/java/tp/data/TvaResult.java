package tp.data;

public class TvaResult {
	private double tva;
	private double ttc;
	
	
	public TvaResult() {
		super();
	}
	public TvaResult(double tva, double ttc) {
		super();
		this.tva = tva;
		this.ttc = ttc;
	}
	public double getTva() {
		return tva;
	}
	public void setTva(double tva) {
		this.tva = tva;
	}
	public double getTtc() {
		return ttc;
	}
	public void setTtc(double ttc) {
		this.ttc = ttc;
	}
	
}
