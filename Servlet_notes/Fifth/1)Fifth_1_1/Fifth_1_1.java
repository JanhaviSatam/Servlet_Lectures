package servlet_lecturess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Fifth_1_1")
public class Fifth_1_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Fifth_1_1() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String fname=request.getParameter("fname");
		int age= 34;
		out.println("<b>Hello"+fname);
		out.println("<br>Please click below button to know your ID");
		out.println("<br>Only Shubham ID is generated");
		out.println("<br><a href='http://localhost:8080/servlet_lecturess/Fifth_1_1')>Click</a>");
		
		if(fname.equals("shubham"))
		{
			RequestDispatcher req = request.getRequestDispatcher("Fifth_1_2"); // forward is for calling other html page ,servlet page  , jsp page , etc.
			req.forward(request, response);  // forward is for passing the html fetched data  ,jsp fectched data(html) , servlet fetched data(html) from the existing servlet to other servlet
		}                                    // for calling servlet file dont put .java extension
		else
		{
			RequestDispatcher req =request.getRequestDispatcher("Fifthh_1_1.html");
			req.include(request, response); //include is for just calling the html page , servlet page , jsp page, etc
		}                                   // for calling html file we have to give .html extension
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

