package fr.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dao.UserDAO;

/**
 * Servlet implementation class Inscription
 */
@WebServlet(description = "Servlet pour la page d'inscription", urlPatterns = { "/register" })
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");

		System.out.println("login: " + login + " pwd: " + pwd);
		
		if(!login.equals("") && !pwd.equals("")){
			try {
				UserDAO udao = new UserDAO();
				udao.create(login, pwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		request.getRequestDispatcher("/register.jsp").forward(request, response);
	}

}
