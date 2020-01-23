<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%

String varErrorMsg = "";
String varFirstName = "";
String varLastName = "";
String varMiddleName = "";
String varGender = "";

	varErrorMsg = (String) request.getSession().getAttribute("errorMsg");
	varFirstName = (String) request.getSession().getAttribute("ofname");
	varLastName = (String) request.getSession().getAttribute("olname");
	varMiddleName = (String) request.getSession().getAttribute("omname");
	varGender = (String) request.getSession().getAttribute("ogender");


if (varErrorMsg == null) {
	varErrorMsg = "";
}
if (varFirstName == null) {
	varFirstName = "";
}
if (varLastName == null) {
	varLastName = "";
}
if (varMiddleName == null) {
	varMiddleName = "";
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info 2 With Validation</title>
</head>
<body>
<h4><%=varErrorMsg %></h4>
<form method="post" action="/MyFirstProject/P2">
  <label for="firstname">First Name:</label><br>
  <input type="text" name="firstname" value=<%=varFirstName%>>
  <br>
  <br>
  <label for="middlename">Middle Name:</label><br>
  <input type="text" name="middlename" value=<%=varMiddleName %>>
  <br>
  <br>
  <label for="lastname">Last Name:</label><br>
  <input type="text" name="lastname" value=<%=varLastName %>>
  <br>
  <br>
  <label for="gender">Gender</label><br>
  <input type="radio" name="gender" value="male" <%if (varGender == "male") {%> checked <%}%>><label>Male</label><br>
  <input type="radio" name="gender" value="female" <%if (varGender == "female") {%> checked <%}%>><label>Female</label><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>