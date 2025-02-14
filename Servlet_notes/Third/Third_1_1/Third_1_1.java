package servlet_lecturess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Third_1_1")
public class Third_1_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Third_1_1() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String Fnam = request.getParameter("Fname");
		String Lnam = request.getParameter("Lname");
		int Age= Integer.parseInt(request.getParameter("Age"));
		
		String res="";
		if(Age >= 18)
		{
			res= Fnam+""+Lnam+"You are eligble for voting";
		}
		else
		{
			res=Fnam+""+Lnam+"You are eligible not for voting.You can vote after"+(18-Age)+" ";
		}
		out.print("<b>"+res);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
