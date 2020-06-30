<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<hr/>
<!--  EL=Expression langage , syntaxe en dollar accolade
      si pas de prefixe sessionScope , l'ojet (ici user)
       est recherché dans tous les scopes possibles -->
<a href="index.html">index (retour accueil)</a> * username = ${user.username} 
ou bien  ${sessionScope.user.username}
