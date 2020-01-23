<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 2</title>
</head>
<body>
<%
String fn = (String) request.getSession().getAttribute("ofname");
String ln = (String) request.getSession().getAttribute("olname");
String mn = (String) request.getSession().getAttribute("omname");
String gn = (String) request.getSession().getAttribute("ogender");
%>

<%if (fn != null){%>
	FitstName = <%=fn%>
	<br>
<%}%>
<%if (ln != null){%>
	LastName = <%=ln%>
	<br>
<%}%>
<%if (mn != null){%>
	MiddleName = <%=mn%>
	<br>
<%}%>
<%if (gn != null){%>
	HomePhone = <%=gn%>
	<br>
<%}%>

<form method="get" action="/MyFirstProject/profile">
  <input type="hidden" name="firstname" value="<%=fn%>">
  <input type="hidden" name="lastname" value="<%=ln%>">
  <input type="hidden" name="middlename" value="<%=mn%>">
  <input type="hidden" name="gender" value="<%=gn%>">
  <label>Address:</label><br>
  <input type="text" name="address" value="">
  <br>
  <br>
  <label>City:</label><br>
  <input type="text" name="city" value="">
  <br>
  <br>
  <label>State</label><br>
  <input type="text" name="state" value="">
  <br>
  <br>
  <label>Country</label><br>
  <input type="text" name="country" value="">
  <br>
  <br>  
  <label>Phone</label><br>
  <input type="text" name="phone" value="">
  <br>
  <br>
  <input type="submit" value="Submit">
</form>


</body>
</html>