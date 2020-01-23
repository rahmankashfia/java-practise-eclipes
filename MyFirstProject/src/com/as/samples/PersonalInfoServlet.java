package com.as.samples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class PersonalInfoServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String middlename = req.getParameter("middlename");
		String gender = req.getParameter("gender");
		
		req.getSession().setAttribute("ofname", firstname);
    	req.getSession().setAttribute("omname", middlename);
    	req.getSession().setAttribute("olname", lastname);
    	req.getSession().setAttribute("ogender", gender);
    	
        resp.setContentType("text/html");
		resp.sendRedirect("jsp/contactinfo.jsp");
	}

}
