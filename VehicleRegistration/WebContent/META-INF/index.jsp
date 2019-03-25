<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
                     }
                     %>
</body>
</html>