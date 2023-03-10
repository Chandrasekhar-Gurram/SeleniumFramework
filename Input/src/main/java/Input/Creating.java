package Input;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Input.Connect;

@WebServlet("/GoThere")
public class Creating extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			Connection con = Connect.initializeDatabase();

			PreparedStatement st = con.prepareStatement("insert into student values(?, ?)");

			st.setInt(1, Integer.valueOf(request.getParameter("id")));

			st.setString(2, request.getParameter("name"));

			st.executeUpdate();

			st.close();
			con.close();

			PrintWriter out = response.getWriter();
			out.println("<html><body><b>Successfully Inserted By You" + "</b></body></html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
