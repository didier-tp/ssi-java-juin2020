package tp;

public class CodeTraitement implements Runnable{
	
	private int coeff;
	
	

	public CodeTraitement(int coeff) {
		super();
		this.coeff = coeff;
	}



	public CodeTraitement() {
		super();
		this.coeff =1;
	}



	@Override
	public void run() {
		int n=10;
		for(int i=0;i<n;i++) {
			System.out.println("i="+i);
			try {
				Thread.sleep(500*this.coeff); //pause de 500ms (simuler un traitement long / bloquant)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//fin du code à executer par le thread .
	}



}
