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
			<h2>${usuario.nome}</h2>
		</div>
	</body>
</html>