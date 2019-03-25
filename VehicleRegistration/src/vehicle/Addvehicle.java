package vehicle;
import java.io.IOException;


import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addvehicle extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException{
		PrintWriter out=response.getWriter();
	try {
	
	Connection con=Dbconnect.getConnection();
//	Statement st=con.createStatement();
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
	        ("insert into vehicles(RegnNo,RegdOwner,FName,Address,Maker,YOM,FuelType,CNo,ENo,SeatingCapacity,DOReg) values(?,?,?,?,?,?,?,?,?,?,?)");
	pst.setString(1,RegnNo);
	pst.setString(2,RegdOwner);
	pst.setString(3,FName);
	pst.setString(4,Address);
	pst.setString(5,Maker);
	pst.setString(6,YOM);
	pst.setString(7,FuelType);
	pst.setString(8,CNo);
	pst.setString(9,ENo);
	pst.setInt(10,SeatingCapacity);
	pst.setString(11,DOReg);
	i=pst.executeUpdate();
	con.close();
	if(i>0) {
	request.setAttribute("newvehicle","success");
	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	rd.forward(request, response);
	}
	else if(i==0) {
	    request.setAttribute("newvehicle","fail");
	RequestDispatcher rd=request.getRequestDispatcher("add1.jsp");
	rd.forward(request, response);
	}
	}
	catch(Exception e){
		request.setAttribute("newvehicle","existed");
		RequestDispatcher rd=request.getRequestDispatcher("add1.jsp");
		rd.forward(request, response);
		//out.println(e);
	}
	}
}

