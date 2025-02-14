package servlet_lecturess;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assignment_Third_4_1")
public class Assignment_Third_4_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Assignment_Third_4_1() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Your Order</h1>"); 
		
	        String fname=request.getParameter("Name");
	        String dc=request.getParameter("layer");
	        String top[]= request.getParameterValues("topping");   
	        String or=request.getParameter("order");
	        String appe=request.getParameter("appetizer");
	        String pway=request.getParameter("payway") ;
	        String addr=request.getParameter("addres");
	        
		pw.println("<table border=\"1\">\r\n"
				+ "  <tr>\r\n"
				+ "    <th>Parameter Name</th>\r\n"
				+ "    <th>Parameter Value</th>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>name</td>\r\n"
				+ "    <td>"+fname+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>crust</td>\r\n"
				+ "    <td>"+dc+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>toppings</td>\r\n"
				+ "    <td>");
		      for(String ob : top)
				{
					pw.println(ob+"<br>");
				}
		      
		      pw.println("</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>appetizer</td>\r\n"
				+ "    <td>"+appe +"</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>address</td>\r\n"
				+ "    <td>"+addr+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>cardType</td>\r\n"
				+ "    <td>"+pway+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>submit</td>\r\n"
				+ "    <td>"+or+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "</table>\r\n"
				+ "");
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
