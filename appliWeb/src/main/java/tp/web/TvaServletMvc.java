package tp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tp.data.TvaResult;

/**
 * Servlet implementation class TvaServlet
 */
@WebServlet("/TvaServletMvc")
public class TvaServletMvc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int compteur=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TvaServletMvc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sHt = request.getParameter("ht"); //pour récupérer la valeur saisie dans <input name="ht" ...>
	    double ht = Double.parseDouble(sHt);
	    String sTaux = request.getParameter("taux"); //pour récupérer la valeur saisie dans <input name="taux" ...>
	    double taux = Double.parseDouble(sTaux);
	    
	    double tva = ht * taux /100;
	    double ttc = ht +tva;
	    
	    TvaResult tvaResult = new TvaResult(tva,ttc);
	    HttpSession session = request.getSession();
	    session.setAttribute("tvaResult",tvaResult); //stoke des valeurs dans une chose qui sera visible par la page jsp
	    //request.setAttribute("tvaResult",tvaResult);
	    RequestDispatcher rd ; // RequestDispatcher existe depuis la version 2.1 des servlets
	    rd = this.getServletContext().getRequestDispatcher("/resTva.jsp");
	    rd.forward(request, response); //redirection vers page jsp
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
