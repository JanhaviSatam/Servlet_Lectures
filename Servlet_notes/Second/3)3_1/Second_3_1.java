package servlet_lecturess;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Second_3_1")
public class Second_3_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Second_3_1() {
        super();
       
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		out.println("<p>HTTP headers sent by your client:</p>");
		
		Enumeration<String> Enum = request.getHeaderNames();
		
		while(Enum.hasMoreElements())
		{
			String headerName =(String)Enum.nextElement();
			String headerValue = request.getHeader(headerName);
			out.print("<b>"+headerName+"</b>:");
			out.println(headerValue+"<br>");
		}
		System.out.println("Name:"+request.getLocalName());
		System.out.println("Addr:"+request.getLocalAddr());
		System.out.println("Port:"+request.getLocalPort());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
