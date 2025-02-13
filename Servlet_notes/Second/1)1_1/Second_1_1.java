package servlet_lecturess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



//@WebServlet("/Second_1_1")
public class Second_1_1 implements Servlet {
	
       
   ServletConfig config = null;
   

	
	public void init(ServletConfig config)  {
		this.config=config;
		System.out.println("Initializtion complete");
	}

public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter pwriter = response.getWriter();
	pwriter.print("<html>");
	pwriter.print("<body>");
	pwriter.print("<h1>Servlet Example Program</h1>");
	pwriter.print("<h1>Update Server</h1>");
	pwriter.print("</body>");
	pwriter.print("</html>");
	System.out.println("In service method");
	
	
	}


	public void destroy() {
		System.out.println("Servlet life cylce finished ");
		
	}

	
	public ServletConfig getServletConfig() {
		
		return config;
	}


	public String getServletInfo() {
		
		return "A Demo program "; 
	}





	
	

}
