package Input;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Loging")
public class Log extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NullPointerException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.invalidate();
		out.println("<html><body>" + "<center><p style=" + "color:#4CAF50" + ";>Successfully loged out!!!"
				+ "</p></center></body></html>");
		response.sendRedirect("Login.html");
		out.close();

	}
}
