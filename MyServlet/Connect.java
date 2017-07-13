package MyServlet;
import java.sql.*;

public class Connect {
	
	
	
	Connection con;
	
	
	 Connect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletDb","root","niit@123");
	}
		Connection ret() {
			return con;
		}
	}



