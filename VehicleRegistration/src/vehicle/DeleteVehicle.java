package vehicle;

import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteVehicle extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException{
		try {
		Connection con=Dbconnect.getConnection();
		PrintWriter out=response.getWriter();
		int i=-1;
		String RegnNo=request.getParameter("RegnNo");
		PreparedStatement pst=con.prepareStatement("delete from vehicles where RegnNo=?");
		pst.setString(1,RegnNo);
		i=pst.executeUpdate();
		con.close();
		if(i>0)
			request.setAttribute("delvehicle","success");
			else if(i==0)
			    request.setAttribute("delvehicle","fail");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

}
