<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn Page</title>
</head>
<body>
<form action="login.lti">
<h3>${errorMsg}</h3>
<h1>Login Page</h1>
	Enter User name : <input type="text" name="username" /><br>
	Enter Password : <input type="password" name="password" />
	<button type="submit">LogIn</button>
</form>

</body>
</html>