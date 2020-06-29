package tp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TvaServlet
 */
@WebServlet("/TvaServlet")
public class TvaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TvaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sHt = request.getParameter("ht"); //pour r�cup�rer la valeur saisie dans <input name="ht" ...>
	    double ht = Double.parseDouble(sHt);
	    String sTaux = request.getParameter("taux"); //pour r�cup�rer la valeur saisie dans <input name="taux" ...>
	    double taux = Double.parseDouble(sTaux);
	    
	    double tva = ht * taux /100;
	    double ttc = ht +tva;
	    
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<html><body>");
	    out.println("<p>tva=<i>"+tva+"</i></p>");
	    out.println("<p>ttc=<b>"+ttc+"</b></p>");
	    out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
