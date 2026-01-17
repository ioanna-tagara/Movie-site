package ergasia;
public class Customers extends Users
{

	public Customers(String name, String username, String password, String email) 
	{
		super(name, username, password, email);
	}
	
	public void showAvailableFilms() {System.out.println("Showing all available films");}
	
	public void makeReservation (String name, String movie_title, String hour, int seatNumber)
	{
		System.out.println("Make reservation");
	}
	
	public void viewReservation (String name, String movie_title) 
	{
		System.out.println("Show reservation");
	}
}
