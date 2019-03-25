package vehicle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayAll extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException{
		try {
			Connection con=Dbconnect.getConnection();
			PrintWriter out=response.getWriter();
			Statement st=con.createStatement();
			//String RegnNo=request.getParameter("RegnNo");
			PreparedStatement pst=con.prepareStatement("select * from vehicles");
			//pst.setString(1, RegnNo);
			ResultSet rs=pst.executeQuery();
			response.setContentType("text/html");
			out.print("<h1>");out.print("Registered Vehicles Details:");out.print("</h1>");
			while(rs.next()) {
				out.print("<body align='center' bgcolor='cyan'>");
				out.print("<table align='center'>");
				out.print("<tr>");out.print("<td>");out.println("Registration Number:");out.print("</td>");out.print("<td>");out.print(rs.getString(1));out.print("</td>");out.print("<td>");out.print("<form action='Home.jsp'><input type='submit' value='Home'>");out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Registerted Owner:");out.print("</td>");out.print("<td>");out.print(rs.getString(2));out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Father Name:");out.print("</td>");out.print("<td>");out.print(rs.getString(3));out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Address:");out.print("</td>");out.print("<td>");out.print(rs.getString(4));out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Maker's Name:");out.print("</td>");out.print("<td>");out.print(rs.getString(5));out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Manufacturing year :");out.print("</td>");out.print("<td>");out.print(rs.getInt(6));out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Fuel Used:");out.print("</td>");out.print("<td>");out.print(rs.getString(7));out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Chassis Number:");out.print("</td>");out.print("<td>");out.print(rs.getString(8));out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Engine Number:");out.print("</td>");out.print("<td>");out.print(rs.getString(9));out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Seating Capacity:");out.print("</td>");out.print("<td>");out.print(rs.getInt(10));out.print("</td>");out.print("</tr>");
				out.print("<tr>");out.print("<td>");out.println("Registration Date:");out.print("</td>");out.print("<td>");out.print(rs.getString(11));out.print("</td>");out.print("</tr>");
				out.println("----------------------------------------------------------------------------");
				out.print("</body>");
			}
			con.close();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}



}
