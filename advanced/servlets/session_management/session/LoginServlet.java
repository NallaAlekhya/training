package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid=request.getParameter("login");
		String pswd=request.getParameter("pswd");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if(pswd.equals("admin123")) {
			pw.println("your successfully loged in");
			pw.println("welcome "+ userid);
			Cookie c1=new Cookie("uid",userid);
			response.addCookie(c1);
			pw.println("<br><a href=LogoutServlet>logout</a>");
		}
		else {
			pw.println("<b>Sorry invalid user...</b>");
			this.getServletContext().getRequestDispatcher("/login.html").include(request, response);
			//response.sendRedirect("login.html");

		}
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
