package assign.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import assign.dbaccess.UsrBO;
import assign.dbaccess.UsrVOO;

/**
 * Servlet implementation class AddUsrAfterGettingBankInfoServlet
 */
@WebServlet("/Register")
public class AddUsrAfterGettingBankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUsrAfterGettingBankInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		UsrVOO usrVOO = (UsrVOO) session.getAttribute("usrVOO");
		usrVOO.setSsnString(request.getParameter("ssn"));
		usrVOO.setAccno(request.getParameter("accountNo"));
		UsrBO usrBO = new UsrBO();
		
		try {
			usrBO.addUsr(usrVOO);
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		//step3: Response Back
		String errors = "";
		if (errors.equals("")) {
			response.sendRedirect("html/success.html");
		} else {
			//request.getSession().setAttribute("Errors", errors);
			response.sendRedirect("html/formPersonalInfo.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
