package vehicle;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetValues extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException{
		try {
			Connection con=Dbconnect.getConnection();
			PrintWriter out=response.getWriter();
			Statement st=con.createStatement();
			String RegnNo=request.getParameter("RegnNo");
			PreparedStatement pst=con.prepareStatement("select * from vehicles where RegnNo= ?");
			pst.setString(1, RegnNo);
			ResultSet rs=pst.executeQuery();
			HttpSession session=request.getSession();
			int i=10;
			while(rs.next()) {
				session.setAttribute("rn",rs.getString(1));
				session.setAttribute("ro",rs.getString(2));
				session.setAttribute("fn",rs.getString(3));
				session.setAttribute("add",rs.getString(4));
				session.setAttribute("mn",rs.getString(5));
				session.setAttribute("my",rs.getString(6));
				session.setAttribute("ft",rs.getString(7));
				session.setAttribute("cn",rs.getString(8));
				session.setAttribute("en",rs.getString(9));
				session.setAttribute("sc",rs.getInt(10));
				session.setAttribute("rd",rs.getString(11));
				getServletContext().getRequestDispatcher("/UpdateVehicle.jsp").forward(request, response);
				i=0;
				con.close();
			}
			if(i!=0)
			{
				request.setAttribute("upvehicle","notfound");
				RequestDispatcher rd=request.getRequestDispatcher("modify1.jsp");
				rd.forward(request, response);
			}
			
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

}
