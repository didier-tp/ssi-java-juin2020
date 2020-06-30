<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>visuaPanier</title>
</head>
<body>
   <table border="1">
   <tr><th>nomProduit</tr><th>quantite</th></tr>
    <%
    List<String> caddy = //...;
    for(String nomProd : caddy){
    %>
    <tr><th><%=nomProd%></tr><th>1</th></tr>
    <%}
    %>
    </table>
</body>
</html>