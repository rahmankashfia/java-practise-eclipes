package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome2Servlet
 */
@SuppressWarnings("serial")
@WebServlet("/SCIS")
public class ContactInfoServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String phone = request.getParameter("phone");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Welcome 2 page");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h4>Contact Info</h4>");
		out.println("Address: " + address);
		out.println("<br>City: " + city);
		out.println("<br>State: " + state);
		out.println("<br>Country: " + country);
		out.println("<br>Phone: " + phone);
		out.println("</body>");
		out.println("</html>");

	}

}
