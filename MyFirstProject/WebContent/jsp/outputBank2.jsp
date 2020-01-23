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
String varBankName = (String) request.getSession().getAttribute("bankName");
String varAccountNo = (String) request.getSession().getAttribute("accountNo");
String varSSN = (String) request.getSession().getAttribute("ssn");

%>
<%if (varBankName != null){%>
	FitstName = <%=varBankName%>
	<br>
<%}%>
<%if (varAccountNo != null){%>
	LastName = <%=varAccountNo%>
	<br>
<%}%>
<%if (varSSN != null){%>
	MiddleName = <%=varSSN%>
	<br>
<%}%>

<br>
<font color="blue">================ End of the display=============================</font>
 
</BODY>
</HTML>