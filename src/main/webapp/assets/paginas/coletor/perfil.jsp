<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Perfil Coletor</title>
		<style><%@include file="../../../resources/css/coletor/perfil.css"%></style>
	</head>
	<body>
		<div>
		    <form action="home-coletor" style="float:left">
		   		<button type="submit" name="voltar" id=voltar>Voltar</button>
		    </form>
		    <form action="editarPerfil-coletor">
		   		<button type="submit" name="editar" id=editar>Editar Perfil</button>
		    </form>
	        <h2>${usuario.nome}</h2><h2>${usuario.sobrenome}</h2>
	        <h3># ID</h3>
	        <h3> Posição no Ranking </h3>
	        <h3> Pontuação </h3>
        </div>
        <div style="float:right" id=conquistas-container>
	        <div style="float:left">
				<div class="conquista-box">
					&#127941;
					Nivel 1
				</div>
				<div>
					&#127941;
					Nivel 3
				</div>
				<div>
					&#127941;
					Nivel 2
				</div>
				<div>
					&#127941;
					Nivel 7
				</div>
				<div>
					&#127941;
					Nivel 4
				</div>
				<div>
					&#127941;
					Nivel 6
				</div>
	        </div>
		   <div style="float:right">
	        	<div>
					&#127941;
				</div>
				<div>
					&#127941;
				</div>
				<div>
					&#127941;
				</div>
				<div>
					&#127941;
				</div>
				<div>
					&#127941;
				</div>
				<div>
					&#127941;
				</div>
			</div>
       	</div>
	</body>
</html>