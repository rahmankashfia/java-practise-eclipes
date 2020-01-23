package com.as.samples;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

@SuppressWarnings({ "serial" })
public class ShowProfile extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String middlename = req.getParameter("middlename");
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		String phone = req.getParameter("phone");
		
		req.getSession().setAttribute("ofname", firstname);
    	req.getSession().setAttribute("omname", middlename);
    	req.getSession().setAttribute("olname", lastname);
    	req.getSession().setAttribute("ogender", gender);
    	req.getSession().setAttribute("oaddress", address);
    	req.getSession().setAttribute("ocity", city);
    	req.getSession().setAttribute("ostate", state);
    	req.getSession().setAttribute("ocountry", country);
    	req.getSession().setAttribute("ophone", phone);
    	
        resp.setContentType("text/html");
		resp.sendRedirect("jsp/profile.jsp");
	}

}
