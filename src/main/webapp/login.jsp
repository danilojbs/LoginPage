<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.login.*" session="true"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logar</title>
<link rel="stylesheet" href="css/login.css">

<script type="text/javascript">

	function Register() {
		formLogin.action="./register.jsp";
		formLogin.submit();
	}

</script>

</head>

<body>
	<form name="formLogin" method="POST" action="./Login">
		<div id="divs">
			<div>
				<label for="user"> Usuário:</label>
				<input type="text" id="user" name="user" value="${user}">
			</div>
			
			<div>
				<label for="pass"> Senha:</label>
				<input type="password" id="pass" name="pass" value="${pass}" required="required">
			</div>
			
			<div>
				<input type="submit" id="login" name="login" value="Entrar" onclick="formLogin.submit()">
				<input type="button" id="register" name="register" value="Registrar" onclick="Register()">
			</div>
			
			<br>
			<label>${msg}</label>
			
		</div>
	</form>
	
</body>
</html>