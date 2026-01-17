package ergasia;

public class Provoles {
	private int provoliId;
	private String provoliMovie;
	private int provoliCinema;
	private String provoliStartDate;
	private String provoliEndDate;
	private String provoliTime;
	private int provoliNumberOfReservations;
	private boolean provoliIsAvaliable;
	
	public Provoles (int provoliId, String provoliMovie, int provoliCinema,String provoliTime, String provoliStartDate, String provoliEndDate, int provoliNumberOfReservations, boolean provoliIsAvaliable) 
	{
		this.provoliId= provoliId;
		this.provoliMovie= provoliMovie;
		this.provoliTime= provoliTime;
		this.provoliCinema= provoliCinema;
		this.provoliStartDate= provoliStartDate;
		this.provoliEndDate= provoliEndDate;
		this.provoliNumberOfReservations= provoliNumberOfReservations;
		this.provoliIsAvaliable= provoliIsAvaliable;
	}
	
	 public int get_provoliId() {
		    return provoliId;
	}

		 
	 public void set_provoliId(int newProvoliId) 
	 {
		    this.provoliId = newProvoliId;
	 }
	 
	 public String get_provoliMovie() 
	 {
		    return provoliMovie;
	 }

		 
	 public void set_provoliMovie(String newProvoliMovie) 
	 {
		    this.provoliMovie = newProvoliMovie;
	 }
	 
	 public int get_provoliCinema() 
	 {
		    return provoliCinema;
	 }

		 
	 public void set_provoliCinema(int newProvoliCinema) 
	 {
		    this.provoliCinema = newProvoliCinema;
	 }
	 
	 public void set_provoliStartDate(String newProvoliStartDate) 
	 {
		    this.provoliStartDate = newProvoliStartDate;
	 }
	 
	 public boolean get_provoliIsAvaliable() 
	 {
		    return provoliIsAvaliable;
	 }

	 
	 public String get_provoliEndDate() 
	 {
		    return provoliEndDate;
	 }

		 
	 public void set_provoliEndDate(String newProvoliEndDate) 
	 {
		    this.provoliEndDate = newProvoliEndDate;
	 }
	 
	 public String get_provoliStartDate() 
	 {
		    return provoliStartDate;
	 }

	 public int get_provoliNumberOfReservations() 
	 {
		    return provoliNumberOfReservations;
	 }

		 
	 public void set_provoliNumberOfReservations(int newProvoliNumberOfReservations) 
	 {
		    this.provoliNumberOfReservations = newProvoliNumberOfReservations;
	 }
	 
	 
	 public void set_provoliIsAvaliable(boolean newProvoliIsAvaliable) 
	 {
		    this.provoliIsAvaliable = newProvoliIsAvaliable;
	 }

}
