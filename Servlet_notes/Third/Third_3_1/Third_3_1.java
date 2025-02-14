package servlet_lecturess;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Third_3_1")
public class Third_3_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Third_3_1() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ------------------- using getParameterNames-------------------------------
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		Enumeration<String> paraname = request.getParameterNames();
		while(paraname.hasMoreElements())
		{
			String pname= paraname.nextElement();
			String value= request.getParameter(pname);
			out.println(pname+":"+value+"<br>");
		}
		
		
	// --------------- using getParameterNames-------------------
		//------------------------- using getParameterMap----------------
		out.println("<b> Using get parameter map method</b><br>");
		Map<String,String[]> map = request.getParameterMap();
		Set<String> paramap = map.keySet();
		
		for(String p : paramap) {
			
			out.println(p+":");
			String[] value= map.get(p);
			System.out.println(value.length);
			for(String v : value)
			{
				out.println(v+"<br>");
			}
		}
		
		//-------------------------- using getParameterMap-----------------------
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
