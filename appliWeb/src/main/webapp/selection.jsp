<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, java.util.ArrayList" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>selection</title>
</head>
<body>
   <%@ include file="sp_entete.jsp" %>
    <%
    String nomProduit = request.getParameter("nomProduit");
    int nbProd=0;
    // ajouter le nomProduit dans un objet ArrayList<String>
    // et liste sera vue comme une partie de la session
    if(nomProduit!=null && !nomProduit.isEmpty()){
    	List<String> caddy = (List<String>) session.getAttribute("caddy");
    	if(caddy==null){
    		caddy = new ArrayList<String>(); 
    		session.setAttribute("caddy",caddy);
    	}
    	caddy.add(nomProduit);
    	nbProd=caddy.size();
    }
    %>
    <form>
       nomProduit : <input name="nomProduit"> <br/>
       <input type="submit" value="ajouter au panier">
    </form>
    <%=nbProd%> produit(s) maintenant dans le panier .
    <%@ include file="sp_piedpage.jsp" %>
</body>
</html>