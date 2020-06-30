<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>selection</title>
</head>
<body>
    <%
    String nomProduit = request.getParameter("nomProduit");
    int nbProd=0;
    // ajouter le nomProduit dans un objet ArrayList<String>
    // et liste sera vue comme une partie de la session
    %>
    <form>
       nomProduit : <input name="nomProduit"> <br/>
       <input type=submit" value="ajouter au panier">
    </form>
    <%=nbProd%> produit(s) maintenant dans le panier .
</body>
</html>