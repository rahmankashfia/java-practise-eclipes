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
@WebServlet("/P3")
public class PersonalInfo3Servlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			//read the data
			PersonalInfo personalInfo = new PersonalInfo();
			String firstName = request.getParameter("firstName");
			String middleName = request.getParameter("middleName");
			String lastName = request.getParameter("lastName");
			String gender = request.getParameter("gender");
			//System.out.println(firstName);
			personalInfo.setFirstName(firstName);
			personalInfo.setMiddleName(middleName);
			personalInfo.setLastName(lastName);
			personalInfo.setGender(gender);
			//System.out.println(pf1);
			
			String errorString = "";
			HttpSession session = request.getSession();
			if (errorString ==  null || errorString.trim().length() == 0) {
				session.setAttribute("pinfo", personalInfo);
				response.sendRedirect("jsp/outputPersonalInfo3.jsp");
			} else {
				response.sendRedirect("jsp/formPersonalInfo3.jsp");
			}
			
			
			
			
			
						
	}

}
