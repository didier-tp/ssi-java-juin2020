package tp;

public class ThreadApp {
	
	public static void traitementSimple() {
		System.out.println("debut");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("fin");
	}

	public static void main(String[] args) {
		// instructions executées par le thread principal (créé  d'office)
		
		CodeTraitement codeTraitement = new CodeTraitement();//avec .run()
		CodeTraitement codeTraitement2 = new CodeTraitement(2);
		
        Thread nouveauThread2 = new Thread(codeTraitement);
        Thread nouveauThread3 = new Thread(codeTraitement);
        Thread nouveauThread4 = new Thread(codeTraitement2);
        
        Thread nouveauThread5 = new Thread(()-> { ThreadApp.traitementSimple();}) ;
        //ou bien Thread nouveauThread5 = new Thread(ThreadApp::traitementSimple );
        
        nouveauThread2.start(); //début d'une execution de code en //
        nouveauThread3.start();
        nouveauThread4.start();
        nouveauThread5.start();
	}

}
