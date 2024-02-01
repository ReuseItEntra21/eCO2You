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
		    <form action="home-coletor" style="position: fixed;">
		   		<button type="submit" name="voltar" id=voltar>Voltar</button>
		    </form>
		    <form action="editarPerfil-coletor">
		   		<button type="submit" name="editar" id=editar>Editar Perfil</button>
		    </form>
	        <h2>${usuario.nome}</h2><h2>${usuario.sobrenome}</h2>
	        <div class="informacoes-box">
				<h3># ID</h3>
			</div>
			<div class="informacoes-box">
				<h3> Posição </h3>
			</div>
			<div class="informacoes-box">
				<h3> Pontuação </h3>
			</div>
        </div>
        <div style="position: fixed; left: 38vw; top: 0.75vw;" class=conquistas-container>
	        <div style="float:left">
				<div class="conquista-box">
					<div>
						<div class="image-conquista-box">
							&#127941;
						</div>
					</div>
				</div>
				<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
				<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
				<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
				<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
				<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
	        </div>
		   <div style="float:right">
	        	<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
				<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
				<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
				<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
				<div class="conquista-box">
					<div class="image-conquista-box">
						&#127941;
					</div>
				</div>
			</div>
       	</div>
	</body>
</html>