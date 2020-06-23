package tp;

public class ThreadApp {

	public static void main(String[] args) {
		// instructions executées par le thread principal (créé  d'office)
		
		CodeTraitement codeTraitement = new CodeTraitement();//avec .run()
		CodeTraitement codeTraitement2 = new CodeTraitement(2);
		
        Thread nouveauThread2 = new Thread(codeTraitement);
        Thread nouveauThread3 = new Thread(codeTraitement);
        Thread nouveauThread4 = new Thread(codeTraitement2);
        
        nouveauThread2.start(); //début d'une execution de code en //
        nouveauThread3.start();
        nouveauThread4.start();
	}

}
