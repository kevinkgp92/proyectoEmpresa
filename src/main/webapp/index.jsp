<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceso principal a Empresa</title>
</head>
<body>
	<h1>Pagina Principal de Empresa</h1>
	<form action="Login" method="post">
		<label for="email">Email:</label> <input type="email" name="email"
			required>* <label for="pass">Contraseña:</label> 
			<input type="password" name="pass" required>*
			<input type="submit" value="Login">
			<span style="color: red"><%=(request.getAttribute("msgerr") == null) ? "" : request.getAttribute("msgerr") %></span>			
	</form>
</body>
</html>