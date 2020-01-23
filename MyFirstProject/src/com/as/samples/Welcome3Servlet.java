package com.as.samples;

import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Enumeration;

//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSessionContext;

import com.as.samples.vo.PersonalInfo;

/**
 * Servlet implementation class Welcome1Servlet
 */
@SuppressWarnings("serial")
@WebServlet("/WS3")
public class Welcome3Servlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			//read the data
			PersonalInfo personlInfo = new PersonalInfo();
			String firstName = request.getParameter("firstName");
			String middleName = request.getParameter("middleName");
			String lastName = request.getParameter("lastName");
			personlInfo.setFirstName(firstName);
			personlInfo.setMiddleName(middleName);
			personlInfo.setLastName(lastName);
			
			String errorString = "";
			HttpSession session = request.getSession();
			if (errorString ==  null || errorString.trim().length() == 0) {
				session.setAttribute("pinfo", personlInfo);
				response.sendRedirect("jsp/outputWelcome3.jsp");
			} else {
				response.sendRedirect("jsp/welcome3.jsp");
			}
			
			
			
			
			
						
	}

}
