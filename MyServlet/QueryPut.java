package MyServlet;

import java.sql.*;

public class QueryPut {
QueryPut(Connection con,String name,int age,int salary) throws Exception {
	Statement stmt = con.createStatement();
	stmt.executeUpdate("insert into Emp values ('"+name+"', "+age+","+salary+")");
}
}
