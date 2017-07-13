package MyServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Logged")
public class Logged extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Logged() {
        
    }

	
    Connection con;
    ResultSet rs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String name=request.getParameter("name");
		int age =Integer.parseInt(request.getParameter("age"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		try{
		con = new Connect().ret();
		new QueryPut(con, name,age,salary);
		} catch(Exception e) {
			System.out.println(e);
		}

		
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	
	

}
