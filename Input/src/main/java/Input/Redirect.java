package Input;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Input.Connect;
@WebServlet("/Gooo")
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
	boolean s=false;
		try {
			PrintWriter pw=response.getWriter();

			Connection con = Connect.initializeDatabase();

			PreparedStatement st = con.prepareStatement("select * employee where Name=?,Password=?;");

			st.setString(1, request.getParameter("Name"));

			st.setString(2, request.getParameter("Password"));

			
	        ResultSet r= st.executeQuery();
           s=r.next();
           if(s)
           {
        	  pw.println("login successful"); 
           }
           else
           {
        	   pw.println("login failure");
           }
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
