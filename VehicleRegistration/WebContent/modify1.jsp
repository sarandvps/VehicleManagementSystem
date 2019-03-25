<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="modify.jsp"%></br>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
                     if(request.getAttribute("upvehicle")!=null)
                     {
                         if(request.getAttribute("upvehicle").equals("success"))
                         {
                         %>
                         <font color="red"><p>Vehicle Details Successfully Updated</p></font>
                         <%
                         }
                         if(request.getAttribute("upvehicle").equals("fail"))
                         {
                         %>
                         <font color="red"><p>Update Fail Try again</p></font>
                         <%
                         }
                         if(request.getAttribute("upvehicle").equals("notfound"))
                         {
                         %>
                         <font color="red"><p>Vehicle not found please check the registartion number and try again</p></font>
                         <%
                         }
                     }
                     %>
</body>
</html>