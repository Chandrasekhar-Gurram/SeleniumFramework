package Input;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Input.Connect;

@WebServlet("/Gooooo")
public class EmployeeDetails extends HttpServlet {
	// private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Class.forName("org.sqlite.JDBC");
			PrintWriter out = response.getWriter();
			RequestDispatcher rs = request.getRequestDispatcher("Insert.html");
			Connection con = DriverManager.getConnection("jdbc:sqlite:C://chandu1/sql/student.db");

			String p = request.getParameter("Password");
			String cp = request.getParameter("ConfirmPassword");
			boolean print = cp.equals(p);
			if (!print) {
				out.println("<html><body>"+"<center><p style="+"color:red"+";>Paswords mismatch "+"</p></center></body></html>");
				rs.include(request, response);
				con.close();

			}else {
			String  name=request.getParameter("Name");
			PreparedStatement p1=con.prepareStatement("select count(1) from students where Name=?");
			p1.setString(1, name);
		
			ResultSet rr=p1.executeQuery();
			int co=0;
			while(rr.next())
			{
				co=rr.getInt(1);
			}
			rr.close();
			p1.close();
			
			if(co==0) {
				PreparedStatement st = con.prepareStatement("insert into students values(?,?,?,?,?,?,?,?);");

				st.setString(1, request.getParameter("Name"));
				st.setString(2, request.getParameter("Password"));
				
				st.setString(3, request.getParameter("Email"));
				st.setLong(4, Long.valueOf(request.getParameter("PhNo")));
				st.setString(5, request.getParameter("Gender"));
				st.setInt(6, Integer.valueOf(request.getParameter("Pincode")));
				st.setString(7, request.getParameter("City"));
				st.setString(8, request.getParameter("EmpType"));

				st.executeUpdate();

				st.close();
				con.close();

				out.println("<html><body><b>Successfully Registerd and Login here " + "</b></body></html>");
				RequestDispatcher rp = request.getRequestDispatcher("Login.html");
				rp.include(request, response);
			}
			else
			{
				out.println("<html><body>"+"<center><p style="+"color:red"+";>Username is already exist"+"</p></center></body></html>");
		           RequestDispatcher r = request.getRequestDispatcher("Insert.html");
		           r.include(request, response);
			}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
