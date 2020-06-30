<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- afficher la date  -->
<div class="entete">
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<% 
Date d = new Date(); 
SimpleDateFormat simpleDateFormat_fr = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
String sdate_fr = simpleDateFormat_fr.format(d);
%>
MYWEBAPP - date=<%=sdate_fr%>
<hr/>
</div>
