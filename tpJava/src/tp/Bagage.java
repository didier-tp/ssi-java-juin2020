package tp;

public class Bagage implements Descriptible{
	private String label;
	private Double poids; //en kg
	private Double volume; //en litre
	
	@Override
	public Double getPoids() {
		return poids;
	}
	@Override
	public String getDesignation() {
		return label;
	}
	

	@Override
	public String toString() {
		return "Bagage [label=" + label + ", poids=" + poids + ", volume=" + volume + "]";
	}
	public Bagage() {
		super();
	}
	public Bagage(String label, Double poids, Double volume) {
		super();
		this.label = label;
		this.poids = poids;
		this.volume = volume;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public void setPoids(Double poids) {
		this.poids = poids;
	}
	
}
