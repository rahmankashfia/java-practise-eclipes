<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="obj" scope="session" class="com.apex.entity.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />

Record:
<br>
<jsp:getProperty property="name" name="obj" /><br>
<jsp:getProperty property="password" name="obj" /><br>
<jsp:getProperty property="email" name="obj" /><br>
<%
	System.out.println("Welcome Message : JSP 1");
	request.setAttribute("Request-Attribute", "Value of Attribute ");
	RequestDispatcher rd = request.getRequestDispatcher("/UserController");
	rd.forward(request, response);
%>
