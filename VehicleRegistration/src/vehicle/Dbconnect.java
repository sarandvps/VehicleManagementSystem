package vehicle;
import java.sql.*;

public class Dbconnect {
    private static Connection con;
    public static Connection getConnection() throws SQLException,ClassNotFoundException {
    
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicleregistrationdb","root","");
           
            return con;
    }

}


