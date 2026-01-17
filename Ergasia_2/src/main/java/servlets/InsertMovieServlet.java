package servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;  

//servlet url
@WebServlet("/newmovie")


public final class InsertMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public InsertMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String movie_id=request.getParameter("id");
		String movie_title=request.getParameter("title");
		String movie_category=request.getParameter("category");
		String movie_description=request.getParameter("description");
		try
		{
			//database connection
		         Class.forName("com.mysql.jdbc.Driver");
		         	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Ergasia3!");
		            Statement st=con.createStatement();
		            // putting data to database
		            int i=st.executeUpdate("insert into movie (Movie_id,Movie_title,Movie_category,Movie_description)values('"+movie_id+"','"+movie_title+"','"+movie_category+"','"+movie_description+"')");
		            
		}
		catch(Exception e)
	    {
			System.out.print(e);
		    e.printStackTrace();
		}
		//going back to the html page
		response.sendRedirect("InsertMovie.html");
	}

}