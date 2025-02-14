package servlet_lecturess;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Third_2_1")
public class Third_2_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Third_2_1() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		Map<String,String[]> m= request.getParameterMap();
		Set s = m.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,String[]> entry = (Map.Entry<String,String[]>)it.next();
			String key = entry.getKey();
			String[] value = entry.getValue();
			pw.println("Key is "+key+"<br>");
			
			if(value.length>1)
			{
				for(int i =0; i<value.length;i++)
				{
					pw.println("<li>"+value[i].toString()+"<li><br>");
					
				}
			}
			else {
				
				pw.println("value is "+value[0].toString()+"<br>");
				
				pw.println("-------------------------------------<br>");
				}
			
			pw.close();
			}
		}
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
