<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>
	contact 3 using javabeans JSTL !!!
	</title>
</head>
<body>
	<jsp:useBean id="pinfo" class="com.as.samples.vo.PersonalInfo" scope="session"></jsp:useBean>
	Address:<c:out value="${pinfo.address}"/>
	<br>
	City: <c:out value="${pinfo.city}"/>
	<br>
	State: <c:out value="${pinfo.state}"/>
	<br>
	Country: <c:out value="${pinfo.country}"/>
	<br>
	Phone: <c:out value="${pinfo.phone}"/>
	
</body>
</html>