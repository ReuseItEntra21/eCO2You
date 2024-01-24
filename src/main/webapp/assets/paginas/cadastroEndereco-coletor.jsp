<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Endereço</title>
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
			<h1>Endereço</h1>
			<form action="/inserir-coletor" method="post">
				<input type="text" id="estado" name="estado" autofocus placeholder="Estado" required size="30">
				<input type="text" id="cidade" name="cidade" autofocus placeholder="Cidade" required size="30">
				<br>
				<br>
				<input type="text" id="bairro" name="bairro" autofocus placeholder="Bairro" required size="30">
				<input type="text" id="rua" name="rua" autofocus placeholder="Rua"  required size="30">
				<br>
				<br>
				<input type="text" id="numero" name="numero" autofocus placeholder="Número" required size="30">
				<input type="text" id="cep" name="cep" autofocus placeholder="CEP" required size="30">
				<br>
				<br>
				<input type="text" id="complemento" name="complemento" autofocus placeholder="Complemento" required size="64">
				<br>
				<br>
				<a href="./home-coletor">
					<button type="button" class="ButtonEntrar" >Criar Conta</button>
				</a>
			</form>
		</div>
	</body>
</html>