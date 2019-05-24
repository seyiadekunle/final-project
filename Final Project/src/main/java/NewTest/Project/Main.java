package NewTest.Project;

import java.sql.*;

public class Main {


	public static void main(String[] args) throws SQLException {
		// create connection for a server installed in localhost, with a user "root"
		// with no password
		String address = "jdbc:mariadb://localhost/";
		String user = "root";
		String pass = "adekunle";
		try (Connection conn = DriverManager.getConnection(address, user, pass)) {
			// create a Statement
			try (Statement stmt = conn.createStatement()) {
				// execute query
				try (ResultSet rs = stmt.executeQuery("SELECT 'Hello World!'")) {
					// position result to first
					rs.first();
					System.out.println(rs.getString(1)); // result is "Hello World!"
				}
			}
		}
	}
}
