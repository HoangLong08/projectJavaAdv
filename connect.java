package do_an;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
	Connection conn = null;
	public static Connection dbConnect() throws SQLException {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectURL = "jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=DOAN_JAVA;integratedSecurity=true;";
			Connection conn = DriverManager.getConnection(connectURL, "sa", "12345");
			System.out.println("Connection success");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection fail");
			System.out.println(e.getMessage() + "\n" + e.getClass() + "\n" + e.getCause());
			return null;
		}
	}

}