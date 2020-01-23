package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BankInfoServlet2
 */
@WebServlet("/BS2")
public class BankInfoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bankName = request.getParameter("bankName");
		String accountNo = request.getParameter("accountNo");
		String ssn = request.getParameter("ssn");
		
		HttpSession session = request.getSession();
		session.setAttribute("bankName", bankName);
		session.setAttribute("accountNo", accountNo);
		session.setAttribute("ssn", ssn);
		
		response.sendRedirect("jsp/outputBank2.jsp");
		
		
		
		
		
		
	}

}
