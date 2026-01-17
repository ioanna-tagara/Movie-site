package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin extends Users{
	
	public Admin(String name, String username, String password, String email) 
	{
		super(name, username, password, email);
	}
	
	public void createUser(String name, String username, String password , String email)
	{
		System.out.println("Create a user");
	}
	public void updateUser(String name, String username, String password , String email) 
	{
		System.out.println("Update a user");
	}
	public void deleteUser(String username, String email) 
	{
		System.out.println("Delete a user");
	}
	public void searchUser(String username, String email)
	{
		System.out.println("Search a user");
	}
	public void viewAllUsers()
	{
		System.out.println("View all users");
	}
}
