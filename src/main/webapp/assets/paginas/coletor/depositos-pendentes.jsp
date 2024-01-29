<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Pendentes</title>
		<style><%@include file="../../../resources/css/style.css"%></style>
	</head>
	<body>
		<nav>
			<a href="./home-coletor" target="_blank">
			<button type="button" name="home" id=home>Home</button>
			</a>
			<a href="./depositosPendentes-coletor" target="_blank">
			<button type="button" name="pendentes" id=pendentes>Pendentes</button>
			</a>
			<a href="./ranking-coletor" target="_blank">
			<button type="button"name="ranking" id=ranking>Ranking</button>
			</a>
			<a href="./historicoDepositos-coletor">
			<button type="button"name="historico" id=historico>Histórico</button>
			</a>
			<a href="./buscar-coletor" target="_blank">
			<button type="button"name="lupa" id=lupa>Lupa</button>
			</a>
			<a href="./perfil-coletor">
			<button type="button" name="perfil" id=perfil>Perfil</button>
			</a>
		</nav>
		<form action="./principal-coletor">
			<h2> Depósitos agendados </h2>
			
			<div>
				<input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem1>
				2x latinhas de 220ml
				<button type="button" class="buttonDelete" name="deletar" id=deletar1>
					<b>EXCLUIR</b>
				</button>
				<br>
				<input type="date" id="data" name="dataDeposito">
				<input type="text" placeholder="Empresa" name="empresa" id=empresa>
			</div>
			
			<div>
				<input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem2>
				2x garrafas de 220ml
				<button type="button" class="buttonDelete" name="deletar" id=deletar2 >
					<b>EXCLUIR</b>
				</button>
				<br>
				<input type="date" id="data" name="dataDeposito">
				<input type="text" placeholder="Empresa" name="empresa" id=empresa2 >
			</div>
			
			<h2> Depósitos à serem aceitos </h2>
			
			<div>
				<input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem3>
				2x latinhas de 220ml
				<button type="button" class="buttonDelete" name="deletar" id=deletar3 >
					<b>EXCLUIR</b>
					</button>
				<br>
				<input type="date" id="data" name="dataDeposito">
				<input type="text" placeholder="Empresa" name="empresa" id=empresa3>
			</div>
			
			<div>
				<input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem4>
				2x garrafas de 220ml
				<button type="button" class="buttonDelete" name="deletar" id=deletar4>
					<b>EXCLUIR</b>
				</button>
				<br>
				<input type="date" id="data" name="dataDeposito">
				<input type="text" placeholder="Empresa" name="empresa" id=empresa4>
			</div>
			<a href="a/b/elenco.html" target="_blank">
			<button type="button" name="criar" id=criar>Criar Depósito</button>
			</a>
		</form>
	</body>
</html>