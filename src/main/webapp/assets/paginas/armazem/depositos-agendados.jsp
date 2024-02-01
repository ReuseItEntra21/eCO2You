<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Depositos Agendados</title>
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
	<h2>Depósitos Agendados</h2>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem1> 2x latinhas de 220ml
	<br>
	<br>
	<input type="date" id="data1" name="dataDeposito">
	<br>
	<br>
	<input type="text" placeholder="Coletor" name="coletor" id=coletor1>
	<br>
	<br>
	<button type="button" class="buttonDelete" name="deletar" id=deletar1>
		<b>EXCLUIR</b>
	</button>
	<br>
	<br>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem2> 2x latinhas de 220ml
	<br>
	<br>
	<input type="date" id="data2" name="dataDeposito">
	<br>
	<br>
	<input type="text" placeholder="Coletor" name="coletor" id=coletor2>
	<br>
	<br>
	<button type="button" class="buttonDelete" name="deletar" id=deletar2>
		<b>EXCLUIR</b>
	</button>
	<br>
</body>
</html>