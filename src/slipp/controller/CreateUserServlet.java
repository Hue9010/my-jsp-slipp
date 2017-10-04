package slipp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import slipp.domain.User;
import slipp.domain.UserDAO;
import slipp.support.MyValidatorFactory;

@WebServlet("/users/create")
public class CreateUserServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 4자 이상, 12자 이하, 영문자/숫자만 허용
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		User user = new User(userId, password, name, email);
		Validator validator = MyValidatorFactory.createValidator();
		Set<ConstraintViolation<User>> constrationViolations = validator.validate(user);
		if (constrationViolations.size() > 0) {
			request.setAttribute("user", user);
			String errorMessage = constrationViolations.iterator().next().getMessage();
			forwardJSP(request, response, errorMessage);
			return;
		}

		UserDAO userDAO = new UserDAO();
		try {
			userDAO.addUser(user);
		} catch (SQLException e) {
		}
		response.sendRedirect("/");
	}
	
	private void forwardJSP(HttpServletRequest request, HttpServletResponse response, String errorMessage) throws ServletException, IOException{
		request.setAttribute("errorMessage", errorMessage);
		RequestDispatcher rd = request.getRequestDispatcher("/user/form.jsp");
		rd.forward(request, response);
	}
}
