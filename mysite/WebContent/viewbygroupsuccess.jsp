<%@page import="assign.dbaccess.EMailAddressVOO"%>
<%@page import="assign.dbaccess.EMailBO"%>
<%@include file="header.html"%>
<html>
<head>
<title>View All Contacts</title>
<style type="text/css">
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;    
}
</style>
</head>
<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">
<center>
<h2>View Group Contacts</h2>
</center>
<%@ page import="java.util.*" %>
<jsp:useBean id="emailVO" class="assign.dbaccess.EMailAddressVOO" scope="request" />

<table border="1" cellpadding="1" cellspacing="0">
	<tr>
		<th>Email</th>
		<th>First Name</th>
		<th>Middle Name</th>
		<th>Last Name</th>
		<th>Home Phone</th>
		<th>Work Phone</th>
		<th>Mobile Phone</th>
		<th>Group</th>
	</tr>
	<tr>
	<%
        EMailBO allEntries = new EMailBO();
		List<EMailAddressVOO> list = new ArrayList<EMailAddressVOO>();
        //list = allEntries.getAllEMailAddressList();
        list = allEntries.getAllEMailAddressListbyGroup("7");
        Iterator<EMailAddressVOO> itr = list.iterator();
        while (itr.hasNext()) {
        	EMailAddressVOO temp = itr.next();
        
     %>
    	<td><%
            out.print(temp.geteMailID());
         
        %></td>
        <td><%
            out.print(temp.getfName());
         
        %></td>
         <td><%
            out.print(temp.getmName());
         
        %></td>
        <td><%
            out.print(temp.getlName());
         
        %></td>
        <td><%
            out.print(temp.gethPhone());
         
        %></td>
        <td><%
            out.print(temp.getwPhone());
         
        %></td>
        
        <td><%
            out.print(temp.getmPhone());
         
        %></td>
        <td><%
            out.print(temp.getgroupID());
         
        %></td>
        
        
             
	</tr>
	<% } %>
	
</table>

</center>
</body>

	

</html>
<%@include file="footer.html"%>

</body>
