package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome1Servlet
 */
@SuppressWarnings("serial")
@WebServlet("/WS1")
public class Welcome1Servlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String firstName = request.getParameter("firstName");
			String middleName = request.getParameter("middleName");
			String lastName = request.getParameter("lastName");
			String gender = request.getParameter("gender");
			
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>");
			out.println("Welcome 1 page");
			out.println("</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h4>Personal Info</h4>");
			out.println("First Name: " + firstName);
			out.println("<br>Middle Name: " + middleName);
			out.println("<br>Last Name: " + lastName);
			out.println("<br>Gender: " + gender);
			out.println("</body>");
			out.println("</html>");
			
	}

}
