package com.reg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentReg extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String phnno=req.getParameter("phone");
		String email=req.getParameter("email");
		String course=req.getParameter("course");
		
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		req.setAttribute("phnno", phnno);
		req.setAttribute("course", course);
		
		RequestDispatcher rd=req.getRequestDispatcher("dashboard.jsp");
		rd.forward(req, res);
		
	}

}
