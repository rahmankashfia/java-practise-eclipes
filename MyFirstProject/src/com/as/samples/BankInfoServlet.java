package com.as.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankInfoServlet
 */
@SuppressWarnings("serial")
@WebServlet("/BIS")
public class BankInfoServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String accountNo = request.getParameter("accountNo");
			String bankName = request.getParameter("bankName");
			String ssn = request.getParameter("ssn");
			
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>");
			out.println("Bank Info page");
			out.println("</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h4>Bank Info</h4>");
			out.println("Bank Name: " + bankName);
			out.println("<br>Account No: " + accountNo);
			out.println("<br>SSN: " + ssn);
			out.println("</body>");
			out.println("</html>");

			
	}

}
