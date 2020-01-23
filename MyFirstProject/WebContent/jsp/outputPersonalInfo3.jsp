<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
	<title>
	contact 3 using javabeans JSTL !!!
	</title>
</head>
<body>
	<jsp:useBean id="pinfo" class="com.as.samples.vo.PersonalInfo" scope="session"></jsp:useBean>
	First Name: <jsp:getProperty property="middleName" name="pinfo"/>
	<br>
	Middle Name: <jsp:getProperty property="middleName" name="pinfo"/>
	<br>
	Last Name: <jsp:getProperty property="lastName" name="pinfo"/>
	<br>
	Gender: <jsp:getProperty property="gender" name="pinfo"/>
</body>
</html>