<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<style><%@include file="../../resources/css/style.css"%></style>
	</head>
	<body>
		<nav>
			<a href="./home-coletor" target="_blank">
			<button type="button">Home</button>
			</a>
			<a href="./depositosPendentes-coletor" target="_blank">
			<button type="button">Pendentes</button>
			</a>
			<a href="./ranking-coletor" target="_blank">
			<button type="button">Ranking</button>
			</a>
			<a href="./historicoDepositos-coletor">
			<button type="button">Histórico</button>
			</a>
			<a href="./buscar-coletor" target="_blank">
			<button type="button">Lupa</button>
			</a>
			<a href="./perfil-coletor">
			<button type="button">Perfil</button>
			</a>
		</nav>
		<form action="./principal-coletor">
			<h2> Depósitos agendados </h2>
			
			<div>
				<input type="image" src="caminho/da/imagem.jpg">
				2x latinhas de 220ml
				<button type="button" class="buttonDelete" >
					<b>EXCLUIR</b>
				</button>
				<br>
				<input type="date">
				<input type="text" placeholder="Empresa">
			</div>
			
			<div>
				<input type="image" src="caminho/da/imagem.jpg">
				2x garrafas de 220ml
				<button type="button" class="buttonDelete" >
					<b>EXCLUIR</b>
				</button>
				<br>
				<input type="date">
				<input type="text" placeholder="Empresa">
			</div>
			
			<h2> Depósitos à serem aceitos </h2>
			
			<div>
				<input type="image" src="caminho/da/imagem.jpg">
				2x latinhas de 220ml
				<button type="button" class="buttonDelete" >
					<b>EXCLUIR</b>
					</button>
				<br>
				<input type="date">
				<input type="text" placeholder="Empresa">
			</div>
			
			<div>
				<input type="image" src="caminho/da/imagem.jpg">
				2x garrafas de 220ml
				<button type="button" class="buttonDelete" >
					<b>EXCLUIR</b>
				</button>
				<br>
				<input type="date">
				<input type="text" placeholder="Empresa">
			</div>
			<a href="a/b/elenco.html" target="_blank">
			<button type="button">Criar Depósito</button>
			</a>
		</form>
	</body>
</html>