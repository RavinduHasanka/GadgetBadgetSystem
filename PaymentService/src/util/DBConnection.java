package util;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DBConnection {

	private static Connection connection;

	private DBConnection() {
	}

	public static Connection connect() throws SQLException, ClassNotFoundException {

		if (connection == null || connection.isClosed()) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Provide the correct details: DBServer/DBName, username, password
			connection = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/PAF", "root", "");
		
		}
		return connection;

	}

}