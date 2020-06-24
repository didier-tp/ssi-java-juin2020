package tp.svg;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import tp.figure.Figure2D;

public class MySvgUtil {
	
	public static void generateSvgFile(List<Figure2D> listeFig , String fileName) {
		//ex de fileName : "dessin.svg"
		
		try {
			//ouvrir le fichier en �criture (flux �l�mentaire + PrintStream)
			FileOutputStream fos = new FileOutputStream(fileName);
			PrintStream ps = new PrintStream(fos);
					
			//g�n�rer/�crire via .println() la premi�re ligne du fichier svg
			//<svg xmlns='http://www.w3.org/2000/svg' height='400' width='500'>
			ps.println("<svg xmlns='http://www.w3.org/2000/svg' height='600' width='800'>");
			//boucler sur chaque �l�ment de la liste listeFig
			//et g�n�rer/�crire via .println() une ligne dont la valeur est construite
			//via la m�thode .toSvgStringWithColor()
			for(Figure2D fig : listeFig) {
				ps.println(fig.toSvgStringWithColor());
			}
			//g�n�rer/�crire via .println() la derni�re ligne du fichier svg
			//</svg> 
			ps.println("</svg>");
			//fermer les flux ouverts 
			ps.close(); fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
