package assign.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import assign.dbaccess.EMailAddressVOO;
import assign.dbaccess.EMailDBAccess;
import assign.dbaccess.EMailBO;
import assign.dbaccess.EMailValidationException;

/*
 * Update Email Address Servlet 
 */
@WebServlet("/UpdateEmail")
public class UpdateEMailAddressServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
	String errors = "";
	//String inEmailID = request.getParameter("emailid");
	//EMailAddressVOO eMailAddressVOO = (EMailAddressVOO) request.getAttribute("emailVO");
	//System.out.println(eMailAddressVOO.geteMailID());
	//String inEmailID = eMailAddressVOO.geteMailID();
	String inEmailID = request.getParameter("email");
	String inMphone = request.getParameter("mphone");
	String inWphone = request.getParameter("wphone");
	System.out.println(inEmailID + " " + inMphone + " " + inWphone);
        response.setContentType("text/html");

	EMailBO eMailBO = new EMailBO();
	EMailAddressVOO eMailAddress = new EMailAddressVOO();
	eMailAddress.seteMailID(inEmailID);
	eMailAddress.setwPhone(inWphone);
	eMailAddress.setmPhone(inMphone);

	try{
	    eMailBO.updateEMailAddress(eMailAddress);
	}catch (EMailValidationException emve){
		errors = emve.getErrorMessage();
	} 
	catch (Exception e){
		e.printStackTrace();
	}
	if (errors.equals("")){
		response.sendRedirect("/mysite/home.jsp");	
	}
	else {
		System.out.println(request.getRequestURI());
		request.getSession().setAttribute("Errors", errors);
		response.sendRedirect("/mysite/deletecontact.jsp");
	}
    }

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        doGet(request, response);
    }

}

