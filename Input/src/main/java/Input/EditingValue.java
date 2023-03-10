package Input;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Edit")
public class EditingValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditingValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		  response.setContentType("text/html");  
		  PrintWriter pw = response.getWriter();
		  try {	
		  Connection conn = Connect.initializeDatabase();
		  String name = request.getParameter("Name");
			String Phone = request.getParameter("PhNo");
			String email= request.getParameter("Email");
			String city = request.getParameter("City");
			String gender = request.getParameter("Gender");
			String Pincode = request.getParameter("Pincode");
			String EmployeeType = request.getParameter("EmpType");
	PreparedStatement preparedstatement=conn.prepareStatement("update StudentRegisteration set Name=\" + name + \" , PhoneNumber=\" + Phone\r\n" + 
			"					+ \",Email =\" + email + \",EmpType =\" + EmployeeType + \",Pincode=\" +Pincode+\",City=\" + city + \", Gender=\" + gender\r\n" + 
			"					+ \" where Name=\" + name;");
	
    preparedstatement.setString(1,name);
	ResultSet  resultSet=preparedstatement.executeQuery();
	Employee employee=new Employee();
	while(resultSet.next()) {
		employee.setUserName(resultSet.getString("Name"));
		employee.setEmail(resultSet.getString("Email"));
		employee.setCity(resultSet.getString("City"));
		employee.setPhNo(resultSet.getLong("PhNo"));
        employee.setGender(resultSet.getString("Gender"));
		employee.setPincode(resultSet.getInt("Pincode"));
		employee.setEmpType(resultSet.getString("EmpType"));
		
	}
	pw.println("<body bgcolor='#FFFFFF'>");
	  
	  pw.println("<table align='center' width=40% width='100%' cellspacing='2' cellpadding='2' border='5'>");
	  pw.println("<tr>");
	  pw.println("<td colspan='2' align='center'><b>Employee Registration Form.</b></td>");

	  pw.println("</tr>");
//	  pw.println("<tr><td></td></tr>");
	  pw.println("<tr><td> <label for=\"Name\"><b>Name</b></label> &ensp;<input type=\"text\"\r\n" + 
	  		"				name=\"Name\" title=\"Name\"  value='"+employee.getUserName()+"'> placeholder=\"enter your name\" required /></td></tr>");
	  pw.println("<tr>");
	  pw.println("<td align='left' valign='top' width='41%'>Employee Name<span style='color:red'>*</span></td>");

	  pw.println("<td width='57%'><label\r\n" + 
	  		"				for=\"Email\"><b>Email</b></label> &ensp;&ensp;<input type=\"email\"\r\n" + 
	  		"				name=\"Email\" value='"+employee.getEmail()+"'  size='24'> placeholder=\"Enter your mail\"\r\n" + 
	  		"				title=\"Must contain @ in email\" required /> </td>");
	  pw.println("</tr>");
	  pw.println("<tr>");
	  pw.println("<td align='left' valign='top' value='"+employee.getGender()+"' width='41%'>Employee Number<span style='color:red'>*</span></td>");
	  pw.println("<option value=\"Male\">Male</option>");
	  pw.println("<option value=\"FeMale\">FeMale</option>");
	  pw.println("<td width='57%'>");
	  pw.println("<label\r\n" + 
	  		"				for=\"PhNo\"><b>Phone Number</b></label> <input\r\n" + "type=\"tel\" value='"+employee.getPhNo()+"'   size=24> name=\"PhNo\" placeholder=\"enter your number\"\r\n" + 
	  		"				title=\"1.Eneter 10 digits only 2.No Zero at first\" minlength=\"10\"\r\n" + 
	  		"				pattern=\"[7-9]{1}[0-9]{9}\" required /> </td>");
	  pw.println("</tr>");
	  pw.println("<tr>");
	  pw.println("<td align='left' valign='top' width='41%'>Address</td>");

	  

	  pw.println(" <td align='left' valign='top' width='41%'>Contact Number</td>");
	  pw.println("<td width='57%''>");
	  pw.println("<label\r\n" + 
	  		"				for=\"City\"><b>City</b></label> &ensp;&ensp; <input type=\"text\"\r\n" + 
	  		"				name=\"City\" placeholder=\"enter city\"> value='"+employee.getCity()+"'  name='txtFName1' size='24'></td>");
	  pw.println("</tr>");
	  pw.println("<tr>");
	  pw.println("<td align='left'  valign='top' width='41%'>Job Location</td>");
	  pw.println("<option value='Default'>'"+employee.getEmpType()+"'</option>");
	  pw.println("<option value='Employee'>Employee</option>");
	  pw.println("<option value='Admin'>Admin</option>");


	  pw.println("</select></td>");


	  pw.println("</tr>");

	  pw.println(" <tr>");
	  pw.println(" <td align='left'  valign='top' width='41%'>Designation</td>");
	  pw.println("<td width='57%'>");
	  pw.println("<select name='mydropdow'>");
			  pw.println("<option value='Default'>'"+employee.getEmpType()+"'</option>");
			  pw.println("<option value='Systems Engineer'>Systems Engineer</option>");
			  pw.println("<option value='Senior Engineer'>Senior Engineer</option>");
			  


			  pw.println("</select></td>");


			 

			  pw.println(" <tr>");
			  pw.println("<td colspan='2'>");
			  pw.println("<p align='center'>");
			  pw.println("<input type='submit' value='submit' name='B4'>'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp'");
			  pw.println("<input type='reset' value=  'Reset All   ' name='B5'></td>");
			  pw.println("</tr>");
          
			  pw.println("</tr>");
				  pw.println("<tr>"); 
		

	}
catch (Exception e) {
	e.printStackTrace();
}
}
}
