<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<style>
          	body{
              	background-color: #FFFCF5;
          	}
          	h1{
              	font-size: 50px;
          	}
          	h2{
              	font-size: 30px;
          	}
			button {
				border-radius: 12px;
				padding: 5px 15px;
				text-align: center;
				font-size: 30px;
				margin: 4px 2px;
				cursor: pointer;
			}
			.ButtonEntrar {
				background-color: #0D0D0D;
				color: #FFFCF5;
				width: 400px;
				height: 60px;
			}
			.ButtonCriarConta {
				background-color: #FFFCF5;
				color: #0D0D0D;
				width: 280px;
				height: 60px;
			}
      	</style>
	</head>
	<body>
		<div>
			<div style="float:left">
			<h1>Login</h1>
				<form action="/">
					<input type="email" id="email" name="email" placeholder="E-mail" maxlength="25" required>
					<br>
					<br>
					<input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25"  required>
					<br>
					<a href="a/b/elenco.html" target="_blank">Esqueceu a senha?</a>
					<br>
					<br>
					<a href="./home-coletor">
						<button type="button" class="ButtonEntrar">Entrar</button>
					</a>
				</form>
			</div>
			<div style="float:right">
				<h1>Crie sua Conta</h1>
				<br>
				<h2>Seja parte da mudança que o mundo precisa!</h2>
				<br>
				<a href="./cadastro-coletor">
					<button type="button" class="ButtonCriarConta">Criar Conta</button>
				</a>
			</div>
		</div>
	</body>
</html>