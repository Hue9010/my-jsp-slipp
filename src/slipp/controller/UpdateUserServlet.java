package slipp.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.apache.commons.beanutils.BeanUtilsBean;

import slipp.domain.User;
import slipp.domain.UserDAO;
import slipp.support.MyValidatorFactory;
import slipp.util.SessionUtils;

@WebServlet("/users/update")
public class UpdateUserServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionUserId = SessionUtils.getStringValue(session, "loginedId");
		if (sessionUserId == null) {
			resp.sendRedirect("/");
			return;
		}

		User user = new User();
		try {
			BeanUtilsBean.getInstance().populate(user, request.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e1) {
			throw new ServletException();
		}

		if (!user.isSameUser(sessionUserId)) {
			resp.sendRedirect("/");
			return;
		}

		Validator validator = MyValidatorFactory.createValidator();
		Set<ConstraintViolation<User>> constrationViolations = validator.validate(user);
		if (constrationViolations.size() > 0) {
			request.setAttribute("isUpdate", true);
			request.setAttribute("user", user);
			String errorMessage = constrationViolations.iterator().next().getMessage();
			forwardJSP(request, resp, errorMessage);
			return;
		}

		UserDAO userDAO = new UserDAO();
		userDAO.userUpdateUser(user);

		resp.sendRedirect("/");
	}

	private void forwardJSP(HttpServletRequest request, HttpServletResponse response, String errorMessage)
			throws ServletException, IOException {
		request.setAttribute("errorMessage", errorMessage);
		RequestDispatcher rd = request.getRequestDispatcher("/user/form.jsp");
		rd.forward(request, response);
	}
}
