package assign.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import assign.dbaccess.UsrVOO;

/**
 * Servlet implementation class GetPersonalInfo
 */
@WebServlet("/GetPersonalInfo")
public class GetPersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPersonalInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsrVOO usrVOO = new UsrVOO();
		usrVOO.setFirstName(request.getParameter("inFirstName"));
		usrVOO.setLastName(request.getParameter("inLastName"));
		usrVOO.setMiddleName(request.getParameter("inMiddleName"));
		usrVOO.setGender(request.getParameter("inGender"));
		
		
		String errorString = "";
		HttpSession session = request.getSession();
		if (errorString ==  null || errorString.trim().length() == 0) {
			session.setAttribute("usrVOO", usrVOO);
			response.sendRedirect("jsp/formContactInfo.jsp");
		} else {
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
