<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>calculatrice</title>
<link rel="stylesheet" href="styles.css" />
</head>
<body>
     <%@ include file="sp_entete.jsp" %>
     <%
     double res=0;
     String sX = request.getParameter("x");
     String sY = request.getParameter("y");
     try{ 
	     if(sX!=null && sY!=null){
	    	 double x=Double.parseDouble(sX);
	    	 double y=Double.parseDouble(sY);
	    	 res=x+y;
	     }
     }catch(Exception ex){
    	 res=-1;
     }
     %>
     <form method="get"> <!--  sans action="url..." la page jsp se rappelle elle meme . 
      Au bout du premier appel request.getParameter(x) retournera null coté serveur
      Apres le second appel , ça retournera la valeur saisie -->
        x: <input type='text' name="x" value='<%=sX!=null?sX:""%>' /> <br/>
        y: <input type="text" name="y" value='<%=sY!=null?sY:""%>' /> <br/>
        <input type="submit" value="plus" /> <br/>
     </form>
     resultat=<b><%=res%></b>
     <%@ include file="sp_piedpage.jsp" %>
</body>
</html>