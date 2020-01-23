package com.as.samples;
import java.io.*;  
//import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  

@SuppressWarnings("serial")
public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
	  
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
      
		String n=request.getParameter("userName");  
		String p=request.getParameter("userPass");  
		String e=request.getParameter("userEmail");  
		String c=request.getParameter("userCountry");  
		String g=request.getParameter("gender");
		System.out.println("User Name is " + n);
		System.out.println("User Name is " + p);
		System.out.println("User Name is " + e);
		System.out.println("User Name is " + c);
		System.out.println("User Name is " + g);
		out.print("Success");
		out.close();
		
	}
}
