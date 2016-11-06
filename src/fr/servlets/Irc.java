package fr.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dao.MessDAO;
import fr.entities.User;


/**
 * Servlet implementation class Irc
 */
@WebServlet(description = "Servlet pour la page de chat", urlPatterns = { "/irc" })
public class Irc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Irc() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getSession(true).getAttribute("user");
		System.out.println(user);
		
		if(user == null) {
			System.out.println("déviation");
			response.sendRedirect(request.getContextPath() + "/login");
		} else {
			request.getRequestDispatcher("/irc.jsp").forward(request, response);
		}


//		Cookie[] cookies = request.getCookies();
//		String valeur = "";
//		
//		if(cookies == null) {
//			response.sendRedirect("/jee_test/login");
//		} else {
//			for(int i = 0; i < cookies.length; i++) {
//				if(cookies[i].getName().equals("irc")) {
//					valeur = cookies[i].getValue();
//				}
//			}
//			
//			if(valeur == "test") {
//				disp.forward(request, response);
//			} else {
//				response.sendRedirect("/jee_test/login");
//			}
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getSession(true).getAttribute("user");
		
		if(user == null) {
			System.out.println("déviation");
			response.sendRedirect(request.getContextPath() + "/login");
		} else {
			String message = request.getParameter("message");
			int id = user.getId();
			
			if(!message.equals("")){
				try {
					MessDAO mdao = new MessDAO();
					mdao.create(message, id);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			request.getRequestDispatcher("/irc.jsp").forward(request, response);
		}
	}
}
