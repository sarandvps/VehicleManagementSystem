<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" errorPage="\error.jsp" %>
<!DOCTYPE html>
<html>
<head>
</style>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body align="center" bgcolor="Cyan">
<h1>Vehicle Registration Management System</h1>
<form action="add.jsp" method="post" style="display:inline-block;">
<input type="submit" value="Add New Vehicle Details" name="button1" /> </form>
<form action="display.jsp" method="post" style="display:inline-block;">
<input type="submit" value="Display existing vehicles details" name="button2"/> </form>
<form action="modify.jsp" method="post" style="display:inline-block;"> 
<input type="submit" value="Modify details of existing vehicle" name="button3"/> </form>
<form action="delete.jsp" method="post" style="display:inline-block;"> 
<input type="submit" value="Delete vehicle details" name="button4"/></form>
<!--  <form action="displayall" method="get" style="display:inline-block;"> 
<input type="submit" value="Display Registered Vehicles" name="button4"/></form>-->
</body>
</html>