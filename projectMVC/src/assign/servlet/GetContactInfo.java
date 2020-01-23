package assign.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



//import com.as.samples.vo.PersonalInfo;

import assign.dbaccess.UsrVOO;

/**
 * Servlet implementation class GetContactInfo
 */
@WebServlet("/GetContactInfo")
public class GetContactInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetContactInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		UsrVOO usrVOO = (UsrVOO) session.getAttribute("usrVOO");
		//System.out.println(usrVOO.getFirstName());
		usrVOO.setAddress(request.getParameter("inAddress"));
		usrVOO.setCity(request.getParameter("inCity"));
		usrVOO.setState(request.getParameter("inState"));
		usrVOO.setCountry(request.getParameter("inCountry"));
		usrVOO.setPhone(request.getParameter("inPhone"));
		
		String errorString = "";
		//HttpSession session = request.getSession();
		if (errorString ==  null || errorString.trim().length() == 0) {
			session.setAttribute("usrVOO", usrVOO);
			response.sendRedirect("jsp/formBankInfo.jsp");
		} else {
			response.sendRedirect("jsp/formContactInfo.jsp");
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
