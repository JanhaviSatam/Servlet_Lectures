package servlet_lecturess;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;


//@WebServlet("/Fourth_1_1")

//@WebServlet(
//		
//		urlPatterns= {"/servlet_lecturess.Fourth_1_1"},
//		
//		initParams= {
//				@WebInitParam(name="Bank",value="SBI"),
//				@WebInitParam(name="password",value="2024")
//		}
//		)


public class Fourth_1_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       
		PrintWriter out = response.getWriter();
		
		//--------------------------------ServletConfig----------------------------------------
		out.println("<h1> Servlet Config Interface...</h1>");
		ServletConfig ob = getServletConfig();
		//out.println(ob);
		String name=ob.getServletName();
		out.println("<h2>Working in servlet "+name+"</h2>");
		String nbank=ob.getInitParameter("Bank");
		System.out.println(nbank);
		
		int pass=Integer.parseInt(ob.getInitParameter("password"));  
		if(pass == 2024)
		{
			out.println("<font color=red>Hello user your otp for "+nbank+" is "+"9978");
		}
		else
		{
			out.println("Please enter correct password");
		}
		
		//--------------------------------ServletContext-------------------------------------
		
		out.println("<h1> Servlet Context Interface...</h1>");
		ServletContext context = getServletContext();
		out.println("Hello "+context.getInitParameter("uname"));
		out.println("Please Check your mail . Mail address is "+context.getInitParameter("email"));
		out.println("<font color=red>Hello "+ getServletContext().getInitParameter("uname")+"Your otp for"+ob.getInitParameter("Bank"));
		String pass1=ob.getInitParameter("password");
		if(pass1.equals("2024"))
		{
			out.println("9978");
		}
		else
		{
			out.println("Please enter correct password");
		}
		
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
