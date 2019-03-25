<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
ArrayList row = new ArrayList();
Object result = session.getAttribute("vehicleList"); 
row = (ArrayList) result;
out.println("<html>");
out.println("<body>");
out.println("<table border = '10'>");
out.println("<tr>");
out.println("<th>Registration Number</th>");
out.println("<th>Registerted Owner</th>");
out.println("<th>Father Name</th>");
out.println("<th>Address</th>");
out.println("<th>Maker's Name</th>");
out.println("<th>Manufacturing year</th>");
out.println("<th>Fuel Used</th>");
out.println("<th>Chassis Number</th>");
out.println("<th>Engine Number</th>");
out.println("<th>Seating Capacity</th>");
out.println("<th>Registration Date</th>");
out.println("</tr>");
out.println("<form>");
out.println(row.get(0));
out.println("</form>");
out.println("</table>");
	out.println("</body>");
	out.println("</html>");
%>


</body>
</html>