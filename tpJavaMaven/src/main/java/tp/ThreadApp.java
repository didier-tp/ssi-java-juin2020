package tp;

public class ThreadApp {

	public static void main(String[] args) {
		// instructions execut�es par le thread principal (cr��  d'office)
		
		CodeTraitement codeTraitement = new CodeTraitement();//avec .run()
		CodeTraitement codeTraitement2 = new CodeTraitement(2);
		
        Thread nouveauThread2 = new Thread(codeTraitement);
        Thread nouveauThread3 = new Thread(codeTraitement);
        Thread nouveauThread4 = new Thread(codeTraitement2);
        
        nouveauThread2.start(); //d�but d'une execution de code en //
        nouveauThread3.start();
        nouveauThread4.start();
	}

}
