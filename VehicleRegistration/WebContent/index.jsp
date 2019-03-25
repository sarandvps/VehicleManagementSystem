<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="Home.jsp"%></br>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">

  <%
                     if(request.getAttribute("newvehicle")!=null)
                     {
                         if(request.getAttribute("newvehicle").equals("success"))
                         {
                         %>
                         <font color="red"><p>New Vehicle Successfully Added</p></font>
                         <%
                         }
                         if(request.getAttribute("newvehicle").equals("fail"))
                         {
                         %>
                         <font color="red"><p>New vehicle Adding Fail Try again</p></font>
                         <%
                         }
                         if(request.getAttribute("newvehicle").equals("existed"))
                         {
                         %>
                         <font color="red"><p>Sorry,vehicle already exists</p></font>
                         <%
                         }
                     }
                     %>               
 <%
                     if(request.getAttribute("delvehicle")!=null)
                     {
                         if(request.getAttribute("delvehicle").equals("success"))
                         {
                         %>
                         <font color="red"><p>Vehicle Successfully Deleted</p></font>
                         <%
                         }
                         if(request.getAttribute("delvehicle").equals("fail"))
                         {
                         %>
                         <font color="red"><p>Vehicle not Found! please check the Registration Number </p></font>
                         <%
                         }
                     }
                     %>
                     
 
                     
                   
</body>
</html>