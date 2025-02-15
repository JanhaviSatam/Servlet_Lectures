package servlet_lecturess;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Fourth_2_1")
public class Fourth_2_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
      PrintWriter out = response.getWriter();
		
	
		out.println("<h1> Servlet Context Interface...</h1>");
		
		
		//--------------------------------ServletContext-------------------------------------
		
		
		ServletContext context = getServletContext();
		out.println("Hello "+context.getInitParameter("uname"));
		out.println("Please Check your mail . Mail address is "+context.getInitParameter("email"));
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
