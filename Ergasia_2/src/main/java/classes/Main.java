package ergasia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

   
public class Main {
	
	public static void main(String[] args) {
	
	Connection con = null;{
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Ergasia3!");
			if (con != null) {
				System.out.println("Connected to the database");
			}
		} catch (Exception e) {
	           System.out.println("An error occurred. Maybe user/password is invalid");
	       }
	}

}}
