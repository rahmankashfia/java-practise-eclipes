<HTML>
<BODY>
<%
    // This is a scriptlet.  Notice that the "date"
    // variable we declare here is available in the
    // embedded expression later on.
    System.out.println( "Evaluating date now" );
    java.util.Date date = new java.util.Date();
    
    
%>
<font color="green"> Todays Date:<%= date %></font>

<h1> <font color="red"> Output Page </font> </h1>
<font color="blue">================ You entered following Values ==================</font>
<br>
<br>
<br>
<%
String varFirstName = (String) request.getSession().getAttribute("firstName");
String varLastName = (String) request.getSession().getAttribute("lastName");
String varMiddleName = (String) request.getSession().getAttribute("middleName");
%>
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
<br>
<font color="blue">================ End of the display=============================</font>
</BODY>
</HTML>