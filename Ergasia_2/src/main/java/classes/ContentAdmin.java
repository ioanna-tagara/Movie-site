package ergasia;

public class ContentAdmin extends Users {

	public ContentAdmin(String name, String username, String password, String email) 
	{
		super(name, username, password, email);
	}
	
	public void insertMovie(int movie_id, String movie_title, String movie_categoary, String movie_descriptiom) 
	{
		System.out.println("Insert a movie");
	}
	
	public void deletetMovie(int movie_id) 
	{
		System.out.println("Delete a movie");
	}
	
	public void assignMovieToCinema(int movie_id) 
	{
		System.out.println("Assign a movie to a cinema room");
	}
	
	
}
