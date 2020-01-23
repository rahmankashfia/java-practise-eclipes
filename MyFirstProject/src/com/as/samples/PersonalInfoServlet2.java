package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg;

/**
 * Servlet implementation class Personal2
 */
@SuppressWarnings("unused")
@WebServlet("/P2")
public class PersonalInfoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletrequestuest requestuest, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String middlename = request.getParameter("middlename");
		String gender = request.getParameter("gender");
		String firstLoad = request.getParameter("firstTimeLoad") ;
		String errorMsg = "";
		HttpSession session = request.getSession();
		if ( firstname == null || firstname.length() == 0) {
			errorMsg += "First Name is Mandatory.";
			session.setAttribute("errorMsg", errorMsg);
			request.getSession().setAttribute("ofname", "");
		} else {
			request.getSession().setAttribute("ofname", firstname);
		}
		if ( middlename == null || middlename.length() == 0) {
			errorMsg += "<br>Middle Name is Mandatory.";
			session.setAttribute("errorMsg", errorMsg);
			request.getSession().setAttribute("omname", "");
		} else {
			request.getSession().setAttribute("omname", middlename);
		}
		if ( lastname == null || lastname.length() == 0) {
			errorMsg += "<br>Last Name is Mandatory.";
			session.setAttribute("errorMsg", errorMsg);
			request.getSession().setAttribute("olname", "");
		} else {
			request.getSession().setAttribute("olname", lastname);
		}
		if ( gender == null || gender.length() == 0) {
			errorMsg += "<br>Gender is Mandatory.";
			session.setAttribute("errorMsg", errorMsg);
			request.getSession().setAttribute("ogender", "");
		} else {
			request.getSession().setAttribute("ogender", gender);
		}
		request.getSession().setAttribute("firstTimeLoad", firstLoad);
		if (errorMsg.length() > 0) {
			session.setAttribute("errorMsg", errorMsg);
			response.sendRedirect("jsp/formPersonalInfo2WithValidation.jsp");
		} else {
			response.setContentType("text/html");
			response.sendRedirect("jsp/outputPersonal2.jsp");
		}
		
		
		
		
		/*request.getSession().setAttribute("ofname", firstname);
    	request.getSession().setAttribute("omname", middlename);
    	request.getSession().setAttribute("olname", lastname);
    	request.getSession().setAttribute("ogender", gender);
    	
        //
*/
	}

}
