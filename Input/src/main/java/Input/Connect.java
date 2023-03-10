package Input;

import java.sql.*;

public class Connect {
	protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException {

		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://chandu1/sql/student.db");

		return con;
	}

}
