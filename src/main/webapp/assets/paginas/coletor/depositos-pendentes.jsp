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
			<form action="home-coletor">
				<button type="submit" name="home" id=home>Home</button>
			</form>
			<form action="depositosPendentes-coletor">
				<button type="submit" name="pendentes" id=pendentes>Pendentes</button>
			</form>
			<form action="ranking-coletor">
				<button type="submit" name="ranking" id=ranking>Ranking</button>
			</form>
			<form action="historicoDepositos-coletor">
				<button type="button" name="historico" id=historico>Histórico</button>
			</form>
			<form action="buscar-coletor">
				<button type="submit" name="lupa" id=lupa>Lupa</button>
			</form>
			<form action="perfil-coletor">
				<button type="submit" name="perfil" id=perfil>Perfil</button>
			</form>
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