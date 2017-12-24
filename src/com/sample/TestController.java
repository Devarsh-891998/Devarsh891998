package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends HttpServlet{
	
	TestController(int x,int y)
	{
	System.out.println("This is parameterised constructor.");
	}
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<form method='GET'>");
	out.println("<h1>This is the form</h1>");
	out.println("</form>");
	
	out.println("</body>");
	out.println("</html>");
	
	
	}

}
