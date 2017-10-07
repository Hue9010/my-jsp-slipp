package slipp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import slipp.domain.User;
import slipp.domain.UserDAO;

@WebServlet("/users/list")
public class ListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDao = new UserDAO();
		List<User> users = userDao.findUsers();
		req.setAttribute("users", users);
		
		RequestDispatcher rd = req.getRequestDispatcher("/user/list.jsp");
		rd.forward(req, resp);
	}
}
