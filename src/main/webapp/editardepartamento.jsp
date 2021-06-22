<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.eoi.model.Departamento"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Departamento</title>
</head>
<body>
	<h1>Modificación de mi Departamento</h1>
	<h2>Bienvenido <%=session.getAttribute("nomempleado") %></h2>
		
	<%
		Departamento d = (Departamento) request.getAttribute("dpto");
	%>	
	
	
	
	<form action="Controlador" method="post">
		
				<label for="coddepto">Código del Departamento: </label>
				<input type="text" class="input" name="coddepto" readonly value="<%=d.getCoddeto()%>">*<br>
				<label for="nombredpto">Nombre del Departamento: </label>
				<input type="text" class="input" name="nombredpto" readonly value="<%=d.getNombredpto() %>">*<br>
				<label for="ciudad">Ciudad: </label>
				<input type="text" class="input" name="ciudad" value="<%=d.getCiudad() %>"><br>
				<label for="coddirector">Código del Director: </label>
				<input type="text" class="input" name="coddirector"  value="<%=d.getCoddirector() %>"><br>
				<input type="hidden" value="e" name="opcion">
				<input type="submit" value="Modificar">
	</form>
	
	
	
</body>
</html>