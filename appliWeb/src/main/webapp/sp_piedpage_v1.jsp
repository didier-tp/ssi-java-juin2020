<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="tp.data.User" %>    
<hr/>
<%
User u = (User) session.getAttribute("user");
String usernamePiedPage = (u!=null)?u.getUsername():"?";
//(String)session.getAttribute("username");
%>
<a href="index.html">index (retour accueil)</a> - username = <%=usernamePiedPage %>
