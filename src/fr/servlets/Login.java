package fr.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.dao.UserDAO;
import fr.entities.User;

/**
 * Servlet implementation class Login
 */
@WebServlet(description = "Servlet pour la page de Login", urlPatterns = { "/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("loginCnx");
		String pwd = request.getParameter("mdpCnx");
		
		User user = null;

		if(!login.equals("") && !pwd.equals("")){
			try {
				UserDAO udao = new UserDAO();
				user = udao.get(login, pwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(user == null) {
			response.sendRedirect(request.getContextPath() + "/login");
		} else {
//			Cookie monCookie = new Cookie("irc", "POURQUOIIIIIIIIIIIIIII");
//			monCookie.setMaxAge(300000);
//			response.addCookie(monCookie);
			
			HttpSession session = request.getSession(true);
			
			session.setAttribute("user", user);
			//session.setMaxInactiveInterval(300000);

			request.getRequestDispatcher("/irc.jsp").forward(request, response);
		}
	}

}
