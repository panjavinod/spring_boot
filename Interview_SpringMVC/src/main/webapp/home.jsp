<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center;">
<h1>welcome to home page</h1>
<form action="addEmploye" method="POST">
 <input type="text" name="firstName" placeholder="First name"/> <br /> <br />
 <input type="text" name="lastName" placeholder="Last name"/> <br /> <br />
 <input type="text" name="email" placeholder="Email"/><br /> <br />
 <input type="submit" value="submit"/> <br />
</form>
 <a href="/products/new">Add New Employe</a>
</body>
</html>