<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<style>
          	a{
              	text-decoration: none;
          	}
          	body{
              	background-color: #FFFCF5;
          	}
          	h1{
              	font-size: 70px;
              	text-align: left;
          	}
          	form > input{
              	font-size: 40px;
              	padding: 20px 20px;
              	border-radius: 10px;
              	background-color: #FFFCF5;
          	}
          	#Entrar{
              	background-color: #0D0D0D;
              	color: #FFFCF5;
          	}
      	</style>
	</head>
	<body>
		<div>
			<h1>Login</h1>
			<div>
				<form action="/">
					<input type="email" id="email" name="email" placeholder="E-mail" maxlength="25" required>
					<br>
					<br>
					<input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25"  required>
					<br>
					<a href="a/b/elenco.html" target="_blank">Esqueceu a senha?</a>
					<br>
					<br>
					<input type="submit" value="Entrar" id="Entrar">
				</form>
			</div>
			<div>
			<h1>Crie sua Conta</h1>
			<br>
			<h2>Seja parte da mudança que o mundo precisa!</h2>
			</div>
		</div>
	</body>
</html>