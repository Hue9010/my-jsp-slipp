package slipp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import slipp.domain.User;
import slipp.domain.UserDAO;

@WebServlet("/api/users/find")
public class ApiFindUserSevlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		if(userId == null) {
			resp.sendRedirect("/");
			return;
		}
		
		UserDAO userDao = new UserDAO();
		try {
			User user = userDao.findByUserId(userId);
			if(user == null) {
				return;
			}
			Gson gson = new Gson();
			String jsonData =gson.toJson(user);
			resp.setContentType("application/json;charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.println(jsonData);
		} catch (SQLException e) {
		}
		
	}
}
