<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro</title>
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
		</style>
	</head>
	<body>
		<div>
			<div style="float:left">
			<h2>
				Faça parte dessa mudança!
			</h2>
			Conecte-se a uma comunidade comprometida com a sustentabilidade e preservação do meio ambiente
			</div>
			<div style="float:right">
				<h1>Nova Conta</h1>
				<form action="/inserir-coletor" method="post">
					<input type="text" id="nome" name="nome" autofocus placeholder="Nome" maxlength="15" required size="35">
					<br>
					<br>
					<input type="text" id="sobrenome" name="sobrenome" autofocus placeholder="Nome" maxlength="15" required size="35">
					<br>
					<br>
					<input type="date" id="data" name="data" required size="17">
					<br>
					<br>
					<input type="password" id="senha" name="senha" placeholder="Senha" maxlength="25" size="35" required>
					<br>
					<br>
					<input type="text" id="cpf" name="cpf" placeholder="Cpf" maxlength="14" required size="35">
					<br>
					<br>
					<input type="email" id="email" name="email" placeholder="E-mail" maxlength="45" size="35" required>
					<br>
					<br>
					<a href="./cadastroEndereco-coletor">
						<button type="button" class="ButtonEntrar" >Fazer Parte</button>
					</a>
				</form>
			</div>
		</div>
	</body>
</html>