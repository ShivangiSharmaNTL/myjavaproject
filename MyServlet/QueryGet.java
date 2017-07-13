package MyServlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryGet {
ResultSet rs;
	QueryGet(Connection con) throws Exception{
	Statement stmt = con.createStatement();
	rs = stmt.executeQuery("select * from Emp");
}
	ResultSet ret() {
		return rs;
	}
}