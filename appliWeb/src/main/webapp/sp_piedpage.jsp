<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<hr/>
<%
String usernamePiedPage = (String)session.getAttribute("username");
%>
<a href="index.html">index (retour accueil)</a> - username = <%=usernamePiedPage %>
