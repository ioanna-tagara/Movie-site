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

//servlet url
@WebServlet("/Login")

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getting the info from the html inputs
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String category=request.getParameter("category");
		// initialize variables
		boolean flag=false;
		String n=null;
		String u=null;
		String pass=null;
		String em=null;
		String page= null;        
        PreparedStatement p = null;
        ResultSet rs = null;
        String sql = null;
        
        
			
			 try { 
				//database connection
				Class.forName("com.mysql.jdbc.Driver");
	           	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Ergasia3!");

	           	//checking if the user is customer, content admin or admin
	           	if (category.equals("1")){sql = "select * from customers"; page="LogIn.html";}
	           	else if(category.equals("2")){sql = "select * from content_admins"; page="ContentAdmin.html";} 
	           	else if(category.equals("3")){sql = "select * from admins"; page="LogIn.html";}

	           	
	            p = con.prepareStatement(sql);
	            rs = p.executeQuery();
	 
	            //getting data from database
	            while (rs.next()) {
	 
	                n = rs.getString("Name");
	                u = rs.getString("Username");
	                pass = rs.getString("Password");
	                em = rs.getString("Email");
	                //checking if log in info is correct
	                if (n.equals(name)&& u.equals(username)&& pass.equals(password)&& em.equals(email)) 
	                {flag=true;}
	            }
	            con.close();
	        }
			 catch(Exception e)
	        	{
	        		System.out.print(e);
	        		e.printStackTrace();

	        	}
		// if the info is correct user log in in their respective site
		if (flag==true ) {
			response.sendRedirect(page);
		}
		
		//if the info is incorrect a message pops up
		//history.back() its an existing function that visits the previous site in your history 
		//using it to go back
		else {


	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
			out.println("<p style='color:red; font-size:25px;'> No user found! Please try agian</p><br><br><br><br><button onclick=\"history.back()\">Go Back</button>");
			out.close();
			
			
			}
	}

}
