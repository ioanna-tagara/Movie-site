package ergasia;
public class Movie {
	private String movie_id;
	public String movie_title;
	public String movie_category;
	public String movie_description;
	
	public Movie(String movie_id, String movie_title, String movie_category, String movie_description) 
	{
		this.movie_id = movie_id;
		this.movie_title = movie_title;
		this.movie_category = movie_category;
		this.movie_description= movie_description;
		
	}
	
	 public String get_movieId() {
		    return movie_id;
	}

		 
	 public void set_movieId(String newMovieId) 
	 {
		    this.movie_id = newMovieId;
	 }
	 
}
