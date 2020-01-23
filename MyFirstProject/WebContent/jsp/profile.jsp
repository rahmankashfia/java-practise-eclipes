<%
String varFirstName = (String) request.getSession().getAttribute("ofname");
String varLastName = (String) request.getSession().getAttribute("olname");
String varMiddleName = (String) request.getSession().getAttribute("omname");
String varGender = (String) request.getSession().getAttribute("ogender");
String varAddress = (String) request.getSession().getAttribute("oaddress");
String varCity = (String) request.getSession().getAttribute("ocity");
String varState = (String) request.getSession().getAttribute("ostate");
String varCountry = (String) request.getSession().getAttribute("ocountry");
String varPhone = (String) request.getSession().getAttribute("ophone");
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile - <%= varFirstName %></title>
</head>
<body>
<h4 style="color:red;">Successful registration.</h4>
<%if (varFirstName != null){%>
	FitstName = <%=varFirstName%>
	<br>
<%}%>
<%if (varLastName != null){%>
	LastName = <%=varLastName%>
	<br>
<%}%>
<%if (varMiddleName != null){%>
	MiddleName = <%=varMiddleName%>
	<br>
<%}%>
<%if (varPhone != null){%>
	HomePhone = <%=varPhone%>
	<br>
<%}%>
<%if (varAddress != null){%>
	address = <%=varAddress%>
	<br>
<%}%>
<%if (varCity != null){%>
	city = <%=varCity%>
	<br>
<%}%>
<%if (varState != null){%>
	state = <%=varState%>
	<br>
<%}%>
<%if (varCountry != null){%>
	country = <%=varCountry%>
	<br>
<%}%>
<br>
<h4> Profile updated</h4>
</body>
</html>