package tp;

import javax.swing.JOptionPane;

/**
 * 
 * @author didier
 *
 * MyApp = classe principale de l'application
 */
public class MyApp {

	/**
	 * methode/fonction principale
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("java maven");
        //JOptionPane.showMessageDialog(null, "java maven");
		String userName = System.getProperty("user.name");
		System.out.println("userName="+userName);
		String ModeDebug = System.getProperty("monAppli.Debug");
		System.out.println("ModeDebug="+ModeDebug);
	}

}
