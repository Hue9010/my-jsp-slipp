<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="slipp.domain.Db"%>
<%@page import="slipp.domain.User"%>

<%
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");

	User user = Db.findByUserId(userId);
	if (user == null) {
		response.sendRedirect("/");
	}
	
	if(password.equals(user.getPassword())){
		
	}
%>