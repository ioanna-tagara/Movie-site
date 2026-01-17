package classes;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public DBConnect() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Ergasia3!");
			if (con != null) {
				System.out.println("Connected to the database");
			}
		} catch (Exception e) {
			System.out.println("An error occurred. Maybe user/password is invalid");
		}
	}
}
