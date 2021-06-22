<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta Departamento</title>
</head>
<body>
	<h1>Alta de mi Departamento</h1>
	<h2>Bienvenido <%=session.getAttribute("nomempleado") %></h2>
	
	<form action="Controlador" method="post">
		
				<label for="coddepto">Código del Departamento: </label>
				<input type="text" class="input" name="coddepto">*<br>
				<label for="nombredpto">Nombre del Departamento: </label>
				<input type="text" class="input" name="nombredpto">*<br>
				<label for="ciudad">Ciudad: </label>
				<input type="text" class="input" name="ciudad"><br>
				<label for="coddirector">Código del Director: </label>
				<input type="text" class="input" name="coddirector"><br>
				<input type="hidden" value="a" name="opcion">
				<input type="submit" value="Alta">
	</form>
</body>
</html>