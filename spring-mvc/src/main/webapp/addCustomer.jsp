<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form action="addCustomer.lti" method="post" enctype="multipart/form-data">
		<div>
			<label>Name: </label> <input type="text" name="name" />
		</div>
		<div>
			<label>Email: </label> <input type="text" name="email" />
		</div>
		<div>
			<label>Password: </label> <input type="password" name="password" />
		</div>
		<div>
			<label>Date of birth: </label> <input type="date" name="dateOfBirth" />
		</div>
		<div>
			<label>Select Profile Pic: </label> <input type="file" name="profilePic" />
		</div>
		<div>
			<button type="submit">Register</button>
		</div>
	</form>
</body>
</html>