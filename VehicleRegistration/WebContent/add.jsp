<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" errorPage="\error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center" bgcolor="Cyan">
<h1>Enter Details</h1>
<form action="addvehicle">
<table align="center">
<tr>
<td>Registration Number<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="text" name="RegnNo" maxlength="10"required></td>
</tr>
<tr>
<td>Registerted Owner<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="text" name="RegdOwner" maxlength="15" required></td>
</tr>
<tr>
<td>Father Name<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="text" name="FName" maxlength="15" required></td>
</tr>
<tr><td>Address<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="text" name="Address" maxlength="20" required></td>
</tr>
<tr>
<td>Maker's Name<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="text" name="Maker" maxlength="10" required></td>
</tr>
<tr>
<td>Manufacturing year <span class="required-mark" style="color:red">*</span>:</td>
<td><input type="date" name="YOM" maxlength="4" required></td></tr>
<tr>
<td>Fuel Used<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="radio" name="Fueltype" value="petrol" checked> petrol
  <input type="radio" name="Fueltype" value="diesel"> diesel<br><!--  <select name="Fueltype" >
  <option value="Petrol">Petrol</option>
  <option value="Diesel">Diesel</option>
</select>--></td>
</tr>
<tr>
<td>Chassis Number<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="text" name="CNo" maxlength="10" required></td></tr>
<tr><td>Engine Number<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="text" name="ENo" maxlength="10" required></td></tr>
<tr>
<td>Seating Capacity<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="number" name="SeatingCapacity" maxlength="1" required></td></tr>
<tr>
<td>Registration Date<span class="required-mark" style="color:red">*</span>:</td>
<td><input type="date" name="DOReg" required></td>
</tr>
<tr></tr>
<tr>
<td></td>
<td ><input type="submit" value="Add details"></td>
</tr>
</table>
</form>
</body>
</html>