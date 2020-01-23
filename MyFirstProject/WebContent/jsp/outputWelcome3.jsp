<html>
<head>
	<title>
	Welcome 3 using javabeans !!!
	</title>
</head>
<body>
	<jsp:useBean id="pinfo" class="com.as.samples.vo.PersonalInfo" scope="session"></jsp:useBean>
	First Name: <jsp:getProperty property="firstName" name="pinfo"/>
	<br>
	Middle Name: <jsp:getProperty property="middleName" name="pinfo"/>
	<br>
	Last Name: <jsp:getProperty property="lastName" name="pinfo"/>
</body>
</html>