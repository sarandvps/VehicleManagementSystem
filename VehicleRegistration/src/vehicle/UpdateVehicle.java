package vehicle;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateVehicle extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException{
		try {
		Connection con=Dbconnect.getConnection();
//		Statement st=con.createStatement();
		PrintWriter out=response.getWriter();
		int i=-1;
		String RegnNo=request.getParameter("RegnNo");
		String RegdOwner=request.getParameter("RegdOwner");
		String FName=request.getParameter("FName");
		String Address=request.getParameter("Address");
		String Maker=request.getParameter("Maker");
		String YOM=request.getParameter("YOM");
		String FuelType=request.getParameter("Fueltype");
		String CNo=request.getParameter("CNo");
		String ENo=request.getParameter("ENo");
		Integer SeatingCapacity=Integer.parseInt(request.getParameter("SeatingCapacity"));
		String DOReg=request.getParameter("DOReg");
		PreparedStatement pst=con.prepareStatement
		        ("UPDATE vehicles SET RegdOwner= ?,FName=?,Address=?,Maker=?,YOM=?,FuelType=?,CNo=?,ENo=?,SeatingCapacity=?,DOReg=? where RegnNo=?");
		pst.setString(1,RegdOwner);
		pst.setString(2,FName);
		pst.setString(3,Address);
		pst.setString(4,Maker);
		pst.setString(5,YOM);
		pst.setString(6,FuelType);
		pst.setString(7,CNo);
		pst.setString(8,ENo);
		pst.setInt(9,SeatingCapacity);
		pst.setString(10,DOReg);
		pst.setString(11,RegnNo);
		i=pst.executeUpdate();
		con.close();
		if(i>0)
		request.setAttribute("upvehicle","success");
		else if(i==0)
	    request.setAttribute("upvehicle","fail");
			
		RequestDispatcher rd=request.getRequestDispatcher("modify1.jsp");
		rd.forward(request, response);
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
}
