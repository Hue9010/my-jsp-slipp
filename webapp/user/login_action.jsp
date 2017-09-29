<%@page import="slipp.exception.passwordMissMatchException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="slipp.domain.Db"%>
<%@page import="slipp.domain.User"%>
<%@page import="slipp.exception.UserNotFoundException"%>

<%
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	
	try{
		User.login(userId, password);
		session.setAttribute("loginedId", userId);
		
		response.sendRedirect("/");
	} catch(UserNotFoundException e){
		request.setAttribute("errorMessage", "존재하지 않는 사용자 입니다. 다시 로그인하세요.");
		RequestDispatcher rd = request.getRequestDispatcher("/user/login_form.jsp");
		rd.forward(request, response);
	} catch(passwordMissMatchException e){
		request.setAttribute("errorMessage", "비밀번호가 틀리셨습니다. 다시 로그인하세요.");
		RequestDispatcher rd = request.getRequestDispatcher("/user/login_form.jsp");
		rd.forward(request, response);
		}
%>