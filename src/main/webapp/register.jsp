<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.login.*" session="true"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar</title>
<link rel="stylesheet" href="css/login.css">

<script type="text/javascript">

	function Login() {
		formRegister.action="./login.jsp";
		formRegister.submit();
	}

</script>

</head>

<body>

	<form name="formRegister" method="POST" action="./Register">
		<div id="divs">
			<div>
				<label for="user"> Nome de usuário:</label>
				<input type="text" id="user" name="user" value="${user}">
			</div>
			
			<div>
				<label for="pass"> Senha:</label>
				<input type="password" id="pass" name="pass1" value="${pass1}" required="required">
			</div>
			
			<div>
				<label for="pass"> Confirmar a senha:</label>
				<input type="password" id="pass" name="pass2" value="${pass2}" required="required">
			</div>
			
			<div>
				<input type="submit" id="register" name="register" value="Registrar" onclick="formRegister.submit()">
				<input type="button" id="login" name="login" value="Voltar" onclick="Login()">
			</div>
			
			<br>
			<label>${msg}</label>
			
		</div>
	</form>

</body>
</html>