<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>      
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
    <%
    List<String> caddy = (List<String>) session.getAttribute("caddy");
    for(String nomProd : caddy){
    %>
    <tr><td><%=nomProd%></td><td>1</td></tr>
    <%}
    %>
    </table>
    <%@ include file="sp_piedpage.jsp" %>
</body>
</html>