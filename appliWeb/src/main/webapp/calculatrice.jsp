<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>calculatrice</title>
</head>
<body>
     <%
     double res=0;
     String sX = request.getParameter("x");
     String sY = request.getParameter("y");
     if(sX!=null && sY!=null){
    	 double x=Double.parseDouble(sX);
    	 double y=Double.parseDouble(sY);
    	 res=x+y;
     }
     %>
     <form method="get"> <!--  sans action="url..." la page jsp se rappelle elle meme . 
      Au bout du premier appel request.getParameter(x) retournera null coté serveur
      Apres le second appel , ça retournera la valeur saisie -->
        x: <input type="text" name="x" /> <br/>
        y: <input type="text" name="y" /> <br/>
        <input type="submit" value="plus" /> <br/>
     </form>
     resultat=<%=res%>
</body>
</html>