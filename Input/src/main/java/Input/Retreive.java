package Input;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Input.Connect;

@WebServlet("/Goooo")
public class Retreive extends HttpServlet {
	// private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String s = request.getParameter("Name");
		String s1 = request.getParameter("Password");
		HttpSession sessionObj = request.getSession();

		sessionObj.setAttribute("name", s);
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C://chandu1/sql/student.db");
			PrintWriter out = response.getWriter();
			int h = 1;
			PreparedStatement st = conn.prepareStatement("select * from students where Name=? and Password=? ");
			st.setString(1, s);
			st.setString(2, s1);
			ResultSet r = st.executeQuery();
			while (r.next()) {
				if ((s.equals(r.getString(1))) && (s1.equals(r.getString(2))))
					;
				{

					Employee employee = new Employee();

					h = 0;

					employee.setUserName(r.getString("Name"));
					employee.setEmail(r.getString("Email"));
					employee.setCity(r.getString("City"));
					employee.setPhNo(r.getLong("PhNo"));
                    employee.setGender(r.getString("Gender"));
					employee.setPincode( r.getInt("Pincode"));
					employee.setEmpType( r.getString("EmpType"));
					out.println("<center>Here" + "<h2>" + employee.getUserName() + "</h2>" + "details</center>");
					out.println("<table border=1 align=\"center\" width=50% height=50%>");
					out.println("<tr><th>Email</th><td>" + employee.getEmail() + "</td></tr>");
					out.println("<tr><th>City</th><td>" + employee.getCity() + "</td></tr>");
					out.println("<tr><th>Gender</th><td>" + employee.getPincode() + "</td></tr>");
					out.println("<tr><th>Phone Number</th><td>" + employee.getGender() + "</td></tr>");
					out.println("<tr><th>Pincode</th><td>" + employee.getGender() + "</td></tr>");
					out.println("<tr><th>Position</th><td>" + employee.getEmpType() + "</td></tr>");
					out.println("</table>");
					out.println("<button><a href=Edit>edit</a></button>");
					// out.println("<form align="+"right"+" "+" method="+"post"+" " +"action="+"Edit"+"><label> <input name="+"submit2"+" "+"type="+"submit"+" " + "id="+"submit2"+" "+" value="+"Edit"+"></label></form>");
					RequestDispatcher requestdispatcher1 = request.getRequestDispatcher("/logout.html");
					requestdispatcher1.include(request, response);

				}
			}
			if (h == 1) {
				out.println("<html><body>" + "<center><p style=" + "color:red" + ";><script>\r\n" + 
						"window.alert(\"Username or Password incorrect!!!\");\r\n" + 
						"</script>\r\n" +  "</p></center></body></html>");
				RequestDispatcher rs = request.getRequestDispatcher("/Login.html");
				rs.include(request, response);
			}

			r.close();
			st.close();
			conn.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
