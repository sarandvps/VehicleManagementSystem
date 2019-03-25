<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="display.jsp"%></br>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
                     if(request.getAttribute("dpvehicle")!=null)
                     {
                         if(request.getAttribute("dpvehicle").equals("fail"))
                         {
                         %>
                         <font color="red"><p>Vehicle not found!! Please give correct Registration Number</p></font>
                         <%
                         }
                     }
                     %>
</body>
</html>