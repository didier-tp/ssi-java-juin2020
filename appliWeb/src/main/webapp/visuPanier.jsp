<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>visuPanier</title>
</head>
<body>
   <%@ include file="sp_entete.jsp" %>
   <table border="1">
	   <tr><th>nomProduit</th><th>quantite</th></tr>
	    <c:forEach var="nomProd" items="${caddy}">
	       <tr><td>${nomProd}</td><td>1</td></tr>
	    </c:forEach>
    </table>
    <%@ include file="sp_piedpage.jsp" %>
</body>
</html>