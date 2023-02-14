<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página Inicial</title>
<link rel="stylesheet" href="css/home.css">
</head>
<body>
	<%
		String userName = (String) session.getAttribute("username");
		if (userName == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<h1>Bem-vindo a sua página inicial, <%= userName %>!</h1>
	<p>Esta é sua página inicial personalizada.</p>
	<a href="login.jsp">Sair</a>
</body>
</html>
