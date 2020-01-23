package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

/**
 * Servlet implementation class Welcome1Servlet
 */
@SuppressWarnings("serial")
@WebServlet("/WS2")
public class Welcome2Servlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String firstName = request.getParameter("firstName");
			String middleName = request.getParameter("middleName");
			String lastName = request.getParameter("lastName");
			//String gender = request.getParameter("gender");
			
			HttpSession session = request.getSession();
			session.setAttribute("firstName", firstName);
			session.setAttribute("middleName", middleName);
			session.setAttribute("lastName", lastName);
			response.setContentType("text/html");
			response.sendRedirect("jsp/outputWelcome2.jsp");
			
						
	}

}
