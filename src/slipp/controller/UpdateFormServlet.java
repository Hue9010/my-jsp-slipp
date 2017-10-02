package slipp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import slipp.domain.User;
import slipp.domain.UserDAO;

@WebServlet("/users/updateForm")
public class UpdateFormServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		HttpSession session = req.getSession();
		Object object = session.getAttribute("loginedId");
		if(object == null) {
			res.sendRedirect("/");
			return;
		}
		String userId = (String)object;
		UserDAO userDao = new UserDAO();
		try {
			User user = userDao.findByUserId(userId);
			req.setAttribute("user", user);
			RequestDispatcher rd = req.getRequestDispatcher("/user/form.jsp");
			rd.forward(req, res);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		User user = new User(userId, password, name, email);
		UserDAO userDAO = new UserDAO();
		try {
			userDAO.addUser(user);
		} catch (SQLException e) {
		}

		response.sendRedirect("/");
	}
}
