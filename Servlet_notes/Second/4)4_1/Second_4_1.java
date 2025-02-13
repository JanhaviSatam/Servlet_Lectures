package servlet_lecturess;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Second_4_1")
public class Second_4_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Second_4_1() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Scanner sc = new Scanner(System.in);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println("<h1>Web Page using HTTP Servlet</h1>");
		System.out.println("Localname="+request.getLocalName());
		System.out.println("Localport="+request.getLocalPort());
		System.out.println("localaddress="+request.getLocalAddr());
		System.out.println(""+request.getServletPath());
		
		Enumeration ob = request.getHeaderNames();
		
		while(ob.hasMoreElements())
		{
			out.println(ob.nextElement()+":"+request.getHeader((String) ob.nextElement())+"<br>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
