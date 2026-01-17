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
import java.sql.Statement;

//servlets url
@WebServlet("/ScreenigInformation")
public class ScreenigInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String room=request.getParameter("room");
		String time=request.getParameter("time");
		boolean flag=false;
		PreparedStatement p = null;
        ResultSet rs = null;

			
			 try { 
				
				Class.forName("com.mysql.jdbc.Driver");
	           	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Ergasia3!");

	            String sql = "select * from provoles";
	           	
	            p = con.prepareStatement(sql);
	            rs = p.executeQuery();
	            
	            while (rs.next()) {
	           	 
	                String movie_id = rs.getString("Provoli_id");
	                

	                if (movie_id.equals(id)) {
	                	//updating the database for the time
	                	 String query = "update provoles set ProvoliTime = ? where Provoli_id = ?";
	                     PreparedStatement preparedStmt = con.prepareStatement(query);
	                     preparedStmt.setString(1, time);
	                     preparedStmt.setString(2, movie_id);
	                     preparedStmt.executeUpdate();
	                     
	                   //updating the database for the room
	                     String query1 = "update provoles set Provoli_cinema  = ? where Provoli_id = ?";
	                     PreparedStatement preparedStmt1 = con.prepareStatement(query1);
	                     preparedStmt1.setString(1, room);
	                     preparedStmt1.setString(2, movie_id);
	                     preparedStmt1.executeUpdate();


	                     
	                	flag=true;
	                }
	                
	            }
	            
	            //if movie id was not found it prints out a message
	            if (flag==false) {
	            	 response.setContentType("text/html");  
	     	        PrintWriter out = response.getWriter();  
	     			out.println("<p style='color:red; font-size:25px;'> No movie found! Please try agian</p><br><br><br><br><button onclick=\"history.back()\">Go Back</button>");
	     			out.close();
	            }else {response.sendRedirect("ScreeningInfo.html");}
		            
		            
		}
		catch(Exception e)
	    {
			System.out.print(e);
		    e.printStackTrace();
		}

	}

}
