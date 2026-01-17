package ergasia;

public class Cinema {
	private String cinemaId;
	private boolean cinema3D;
	private int seat_number;
	
public Cinema(String cinemaId, boolean cinema3D, int seat_number) 
{
	this.cinemaId = cinemaId;
	this.cinema3D = cinema3D;
	this.seat_number = seat_number;
}
public String get_cinemaId() 
{
    return cinemaId;
}

 
public void set_cinemaId(String newCinemaId) 
{
    this.cinemaId = newCinemaId;
}

public boolean get_cinema3D() 
{
    return cinema3D;
}

 
public void set_Cinema3D(boolean newCinema3D) 
{
    this.cinema3D = newCinema3D;
}

public int get_seatNumber() 
{
    return seat_number;
}

 
public void set_seatNumber(int newSeatNumber) 
{
    this.seat_number = newSeatNumber;
}

}

