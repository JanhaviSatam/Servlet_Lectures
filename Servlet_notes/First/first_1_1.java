package servlet_lecturess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet({"/welcome" , "/first_1_1"})   // This also works
@WebServlet("/welcome")   // if this is there then dont keep steps in web.xml else remove this and keep  steps in web.xml
public class first_1_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public first_1_1() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<h1>My first page in Servlet</h1>");
		out.println("<b>Have a nice day</b>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
