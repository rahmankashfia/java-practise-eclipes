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
String address = (String) request.getSession().getAttribute("address");
String state = (String) request.getSession().getAttribute("state");
String city = (String) request.getSession().getAttribute("city");
String country = (String) request.getSession().getAttribute("country");
String phone = (String) request.getSession().getAttribute("phone");
%>
<%if (address != null){%>
	Address = <%=address%>
	<br>
<%}%>
<%if (city != null){%>
	City = <%=city%>
	<br>
<%}%>
<%if (state != null){%>
	State = <%=state%>
	<br>
<%}%>
<%if (country != null){%>
	Country = <%=country%>
	<br>
<%}%>
<%if (phone != null){%>
	Phone = <%=phone%>
	<br>
<%}%>

<br>
<font color="blue">================ End of the display=============================</font>
 
</BODY>
</HTML>