package vehicle;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayVehicle extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException{
		try {
			Connection con=Dbconnect.getConnection();
			PrintWriter out=response.getWriter();
			Statement st=con.createStatement();
			String RegnNo=request.getParameter("RegnNo");
			PreparedStatement pst=con.prepareStatement("select * from vehicles where RegnNo= ?");
			pst.setString(1, RegnNo);
			ResultSet rs=pst.executeQuery();
			int rowCount = 0;
			response.setContentType("text/html");
			out.println("<body bgcolor='cyan'>");
			out.println("<h1 align='center'>Vehicle Details</h1>");
			out.println("<p align='center'><table border=1>");
			 ResultSetMetaData rsmd = rs.getMetaData();
			 int columnCount = rsmd.getColumnCount();
			 // table header
			 out.println("<tr>");
			 for (int i = 0; i < columnCount; i++) {
			   out.println("<th>" + rsmd.getColumnLabel(i + 1) + "</th>");
			   }
			 out.println("</tr>");
			 // the data
			 while (rs.next()) {
			  rowCount++;
			  out.println("<tr>");
			  for (int i = 0; i < columnCount; i++) {
			    out.println("<td>" + rs.getString(i + 1) + "</td>");
			    }
			  out.println("</tr>");
			  }
			 out.println("</table></p>");
			 out.println("<form align='center' action='Home.jsp'> <input type='submit' value='Home'>");
			 out.println("</body>");
				if( rowCount==0) {
					  request.setAttribute("dpvehicle","fail");
						RequestDispatcher rd=request.getRequestDispatcher("display1.jsp");
						rd.forward(request, response);
				}
			
			con.close();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}


}