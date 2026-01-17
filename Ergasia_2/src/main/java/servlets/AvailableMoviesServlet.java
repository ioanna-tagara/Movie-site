package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//url for the sevlet

@WebServlet("/AvailableMovie")

public class AvailableMoviesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AvailableMoviesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//html page
		PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><head><title>Available Movies</title></head>");
        out.println("<style>body {\r\n"
        		+ "background-image: url('babyblue.jpg');\r\n"
        		+ "  background-repeat: no-repeat;\r\n"
        		+ "  background-attachment: fixed;\r\n"
        		+ "  background-size: 100% 100%;	\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "ul {\r\n"
        		+ "  list-style-type: none;\r\n"
        		+ "  margin: 0;\r\n"
        		+ "  padding: 0;\r\n"
        		+ "  overflow: hidden;\r\n"
        		+ "  background-color: #333;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "li {\r\n"
        		+ "  float: left;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "li a {\r\n"
        		+ "  font-size:20px;\r\n"
        		+ "  display: block;\r\n"
        		+ "  color: white;\r\n"
        		+ "  text-align: center;\r\n"
        		+ "  padding: 14px 110px;\r\n"
        		+ "  text-decoration: none;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "li a:hover:not(.active) {\r\n"
        		+ "  background-color: #111;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".active {\r\n"
        		+ "  background-color: white;\r\n"
        		+ "  color: black;\r\n"
        		+ "}</style><body>");
        out.println("<ul>\r\n"
        		+ "  <li><a href=\"http://localhost:8080/Ergasia_2/AvailableMovie\" >Available Movies</a></li>\r\n"
        		+ "  <li><a href=\"InsertMovie.html\">Insert Movie</a></li>\r\n"
        		+ "  <li><a href=\"ScreeningInfo.html\">Screening Information</a></li>\r\n"
        		+ "  <li style=\"float:right\"><a class=\"active\" href=\"Menu.html\">Log out</a></li>\r\n"
        		+ "</ul><br><br>");
        
        
		String movie_id=null;
		String movie_title=null;
		String movie_category=null;
		String movie_description=null;
		
        PreparedStatement p = null;
        ResultSet rs = null;
        String sql = null;
        
          
			 try { 
				//database connection
				Class.forName("com.mysql.jdbc.Driver");
	           	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Ergasia3!");
	            // SQL command data stored in String datatype
	           
	           	sql = "select * from movie";
	           	
	           	//making a table
	           	out.println("<table border=1 width=80% height=50% align=center>");  
	            out.println("<tr><th>Movie Id</th><th>Movie Title</th><th>Movie Category</th><th>Movie Description</th></tr>");
	           	
	           
	            p = con.prepareStatement(sql);
	            rs = p.executeQuery();
	 
	            //taking data form database
	           
	            while (rs.next()) {
	 
	            	movie_id = rs.getString("Movie_id");
	            	movie_title = rs.getString("Movie_title");
	            	movie_category = rs.getString("Movie_category");
	            	movie_description = rs.getString("Movie_description");
	            	
	            	//putting data in table
	            	out.println("<tr><td>" + movie_id + "</td><td>" + movie_title + "</td><td>" + movie_category + "</td><td>" + movie_description + "</td></tr>");
	        
	            }
	            out.println("</table><br><br>");
	            
	            out.println("</body></html>"); 
	            out.close();
	            con.close();  
	        }
			 catch(Exception e)
	        	{
	        		System.out.print(e);
	        		e.printStackTrace();

	        	}
	}

}
