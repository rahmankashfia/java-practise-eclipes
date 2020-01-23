<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact Info</title>
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
<body>
<form method="post" action="/projectMVC/GetContactInfo">
  <label>Address:</label><br>
  <input type="text" name="inAddress" value="">
  <br>
  <br>
  <label>City:</label><br>
  <input type="text" name="inCity" value="">
  <br>
  <br>
  <label>State</label><br>
  <input type="text" name="inState" value="">
  <br>
  <br>
  <label>Country</label><br>
  <input type="text" name="inCountry" value="">
  <br>
  <br>  
  <label>Phone</label><br>
  <input type="text" name="inPhone" value="">
  <br>
  <br>
  <input type="submit" value="Submit">
</form> 
</body>
</html>