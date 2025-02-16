package servlet_lecturess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Fifth_1_2")
public class Fifth_1_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Fifth_1_2() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		
		out.println("<br>In link 2");
		
		out.println("<b>"+request.getParameter("fname")+" your ID is sttudent677788"+"</b>");
		
		out.println("<b> Age is "+request.getParameter("age"));
		//out.println("<b>"+age);    //it is giving error
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

