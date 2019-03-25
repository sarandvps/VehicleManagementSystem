<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" errorPage="\error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body align="center" bgcolor="Cyan">
<h1>Delete</h1>
<form action="deletevehicle" >
Enter the registration number of the vehicle:<input type="text" name="RegnNo" required>
<input type="submit" value="Delete">
</form>
</body>
</html>