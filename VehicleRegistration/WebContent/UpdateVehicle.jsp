<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" errorPage="\error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update </title>	
</head>
<body align="center" bgcolor="Cyan">
<h1>Update Details</h1>
<form action="updatevehicle">
<table align="center">
<tr>
<td>Registration Number:</td>
<td>${rn}</td>
<td><input type="hidden" name="RegnNo" maxlength="10" value='${rn}' ></td>
</tr>
<tr>
<td>Registerted Owner:</td>
<td><input type="text" name="RegdOwner" maxlength="15" value='${ro}' ></td>
</tr>
<tr>
<td>Father Name:</td>
<td><input type="text" name="FName"  maxlength="15" value='${fn}'></td>
</tr>
<tr><td>Address:</td>
<td><input type="text" name="Address" maxlength="20" value='${add}'></td>
</tr>
<tr>
<td>Maker's Name:</td>
<td><input type="text" name="Maker" maxlength="10" value='${mn}'></td>
</tr>
<tr>
<td>Manufacturing year :</td>
<td><input type="date" name="YOM" maxlength="4" value='${my}'></td></tr>
<tr>
<td>Fuel Used:</td>
<td><input type="radio" name="Fueltype" value="petrol" checked> petrol
  <input type="radio" name="Fueltype" value="diesel"> diesel<br><!--  <select name="Fueltype" >
<!--  <select name="Fueltype" value='${ft}' >
  <option value="Petrol">Petrol</option>
  <option value="Diesel">Diesel</option>
</select>--></td>
</tr>
<tr>
<td>Chassis Number:</td>
<td><input type="text" name="CNo" value='${cn}'></td></tr>
<tr><td>Engine Number:</td>
<td><input type="text" name="ENo" value='${en}'></td></tr>
<tr>
<td>Seating Capacity:</td>
<td><input type="text" name="SeatingCapacity" value='${sc}' ></td></tr>
<tr>
<td>Registration Date:</td>
<td><input type="date" name="DOReg" value='${rd}'></td>
</tr>
<tr></tr>
<tr>
<td></td>
<td ><input type="submit" value="Update details"></td>
</tr>
</table>
</form>

</body>
</html>