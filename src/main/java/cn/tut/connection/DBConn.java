package cn.tut.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_cart", "root",
						"aime@2023");
				System.out.println("Connected to the database");
			} catch (ClassNotFoundException | SQLException e) {
				System.err.println("Error connecting to the database:");
				e.printStackTrace();
				throw e; // Re-throw the exception to indicate a failure to obtain a connection
			}
		}

		return connection;
	}
}
