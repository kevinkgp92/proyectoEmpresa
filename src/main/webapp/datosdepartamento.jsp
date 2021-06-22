<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.eoi.servicios.Conexion"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Datos de Departamentos</title>
<style>
table, th, td {
	border: 1px solid black;
}
</style>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<%
	Connection conn = Conexion.getInstance().getConnection();
	Statement st = conn.createStatement();
	String sql = "SELECT * FROM departamento";
	ResultSet rs = st.executeQuery(sql);
	%>

	<h2>
		Bienvenido
		<%=session.getAttribute("nomempleado")%>
		-
		<%=session.getAttribute("rol")%>
	</h2>

	<nav>
		<ul>
			<li><a href="#">Home</a> <%
 if (session.getAttribute("rol").equals("admin")) {
 %>
			<li><a href="altadepartamento.jsp">Nuevo Departamento</a> <%
 }
 %>
			<li><a href="Logout">Logout</a>
		</ul>
	</nav>
	
	<table>
		<caption><b>Lista de Departamentos</b></caption>
		<tr>
			<th>codDepto</th>
			<th>nombreDpto</th>
			<th>ciudad</th>
			<th>codDirector</th>
			<% if (session.getAttribute("rol").equals("admin")) {
 %>
			<th>Acciones</th>
			<% } %>
		</tr>
		
		<%
			while(rs.next()) { %>
		<tr>
			<td><%= rs.getString("codDepto") %></td>
			<td><%= rs.getString("nombreDpto") %></td>
			<td><%= rs.getString("ciudad") %></td>
			<td><%= rs.getString("codDirector") %></td>
			<td><%= rs.getString("codDepto") %></td>
			<% if (session.getAttribute("rol").equals("admin")) { %>
<td><a href="Controlador?opcion=e&coddepto=<%=rs.getString("codDepto") %>"><i class="fa fa-edit" aria-hidden="true"></i></a>  <a href="Controlador?opcion=b&coddepto=<%=rs.getString("codDepto") %>"><i class="fa fa-trash" aria-hidden="true"></i></a></td>	
		<% } %>
		</tr>		
				
				
		<%} %>
		
	</table>
	
	<%
	rs.close();
	st.close();
	conn.close();
	
	%>
	

</body>
</html>