<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Perfil armazém</title>
	</head>
	<body>
		<form action="home-armazem">
			<button type="submit">Voltar</button>
		</form>
		<form action="editarPerfil-armazem">
        	<button type="submit">Editar Perfil</button>
		</form>
		<div>
		    	<h2> Nome </h2>
				<h3>${armazem.nome}</h3>
				<br>
				<h2> CNPJ </h2>	
				<h3>${armazem.cnpj}</h3>
				<br>
				<h2> Capacidade de Armazenagem </h2>
				<h3>${armazem.capacidadeArmazenagem}</h3>
				<br>
				<h2> Horario de Abertura </h2>
				<h3>${armazem.horarioAbertura}</h3>
				<br>
				<h2> Horario de Fechamento</h2>
				<h3>${armazem.horarioFechamento}</h3>
			</div>
	</body>
</html>