<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center;background-color:Teal;">
<h2>Enter User Credentials </h2>
<form action="addEmploye" method="POST">
UserName : <input type="text" name="name"/> <br><br>   
Password : <input type="text" name="password"/> <br><br> 


<input type="submit" name="submit"> <br><br> 
</form>
<h2>Get The Details</h2>
<form action="getEmploye" method="GET"> 
<input type="submit" name="submit"><br><br>
</form>
</body>
</html>