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
import javax.websocket.Session;
//import javax.servlet.http.HttpSessionContext;

import com.as.samples.vo.PersonalInfo;

/**
 * Servlet implementation class Welcome1Servlet
 */
@SuppressWarnings("serial")
@WebServlet("/CS3")
public class ContactInfo3Servlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			//read the data
			HttpSession session = request.getSession();
			PersonalInfo personalInfo = (PersonalInfo) session.getAttribute("pinfo");
			String address = request.getParameter("address");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String country = request.getParameter("country");
			String phone = request.getParameter("phone");
			//System.out.println(firstName);
			personalInfo.setAddress(address);
			personalInfo.setCity(city);
			personalInfo.setState(state);
			personalInfo.setCountry(country);
			personalInfo.setPhone(phone);
			//System.out.println(pf1);
			
			String errorString = "";
			//HttpSession session = request.getSession();
			if (errorString ==  null || errorString.trim().length() == 0) {
				session.setAttribute("pinfo", personalInfo);
				response.sendRedirect("jsp/outputContact3.jsp");
			} else {
				response.sendRedirect("jsp/formContactInfo3.jsp");
			}
			
			
			
			
			
						
	}

}
