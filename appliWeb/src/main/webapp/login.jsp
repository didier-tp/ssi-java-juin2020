<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link rel="stylesheet" href="styles.css" />
</head>
<body>
   <%@ include file="sp_entete.jsp" %>
   <!-- 
   a faire en Tp (en s'inspirant de calculatrice.jsp) :
   saisir "username" et "password"
   bouton submit de libellé "login"
   construire et afficher message (String)
   NB: pour simuler une vérification de password , on vérifiera 
   si password.equals("pwd"+username) .
   Autrement username=user1 et password=pwduser1 sera considéré comme login correct
   ---------------
   message sera par exemple "login fail , wrong username or password"
   ou bien "successful login , username=user1" .
    -->
    <%
     String message="";
     boolean cnOk = false;
     String username = request.getParameter("username");
     String password = request.getParameter("password");
     
	  if(username!=null && password!=null){
		 if( password.equals("pwd"+username) ){
			 message="successful login. username="+username;
			 session.setAttribute("username", username);
			 cnOk= true;
		 }else{
			 message="login fail , wrong username or password , try again";
			 session.setAttribute("username", null);
		 }
	  }
	   
     %>
     <form method="post"> <!--  sans action="url..." la page jsp se rappelle elle meme .-->
        username: <input type='text' name="username" value='<%=username!=null?username:""%>' /> <br/>
        password: <input type="password" name="password" value='<%=password!=null?password:""%>' /> (pwd...)<br/>
        <input type="submit" value="login" /> <br/>
     </form>
     <p class='<%=cnOk==true?"ok":"error"%>' > <%=message%> </p>
     <%@ include file="sp_piedpage.jsp" %>
</body>
</html>