<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Ejemplo JSP</title>
</head>
<body>

<%
int edad = 8; // Declaramos y asignamos un valor a la variable edad

if (edad >= 18) {
%>
Eres mayor de edad.
<% } else { %>
Eres menor de edad.
<% } %>
</body>
</html>