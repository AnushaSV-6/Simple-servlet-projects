package cgpacal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculate extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name=req.getParameter("name");
		int sub1=Integer.parseInt(req.getParameter("sub1"));
		int sub2=Integer.parseInt(req.getParameter("sub2"));
		int sub3=Integer.parseInt(req.getParameter("sub3"));
		int sub4=Integer.parseInt(req.getParameter("sub4"));
		int sub5=Integer.parseInt(req.getParameter("sub5"));
		
		int total=sub1+sub2+sub3+sub4+sub5;
		float percent=total/5;
		float cgpa=percent/9.5f;
		
	PrintWriter out= res.getWriter();
	
	 out.println("<h1>Welcome, " + name + "!</h1>");
     out.println("<p><strong>Total Marks:</strong> " + total + "</p>");
     out.println("<p><strong>Percentage:</strong> " + percent + "%</p>");
	out.println("<p>The CGPA is:"+cgpa+ "</p>");
	out.println("<p>Have a nice day!!</p>");
	
	}

}
