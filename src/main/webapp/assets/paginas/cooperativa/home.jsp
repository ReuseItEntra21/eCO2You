<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style><%@include file="../../../resources/css/style.css"%></style>
</head>
<body>
	<nav>
		<form action="home-cooperativa">
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
		<input type="search" id="consulta-nome" name= lupa placeholder="Buscar Usuário">
		<br>
		<br>
		<form action="perfil-cooperativa">
			<button type="submit" name="perfil" id=perfil>Perfil</button>
		</form>
	</nav>
	<h2>Pedidos de Requerimento Recentes</h2>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem1>
	<br>
	<br>
	<input type=text id=material1 placeholder=material name=material>
	<br>
	<br> peso DE material
	<br>
	<br>
	<input type="text" placeholder="Armazém" name="armazem" id=armazem1>
	<br>
	<br>
	<input type="date" id="data3" name="dataDeposito">
	<br>
	<br>
	<button type="button" class="buttonDelete" name="deletar" id=deletar3>
		<b>EXCLUIR</b>
	</button>
	<br>
	<br>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem2>
	<br>
	<br>
	<input type=text id=material2 placeholder=material name=material>
	<br>
	<br> peso DE material
	<br>
	<br>
	<input type="text" placeholder="Armazém" name="armazem" id=armazem2>
	<br>
	<br>
	<input type="date" id="data2" name="dataDeposito">
	<br>
	<br>
	<button type="button" class="buttonDelete" name="deletar" id=deletar2>
		<b>EXCLUIR</b>
	</button>
	<h2>Armazéns Recomendados</h2>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem3>
	<p>Empresa</p>
	<p>Bairro</p>
	<form action="#">
		<div>
			<input type="button" value="Ver perfil" name="perfil" id=perfil3>
		</div>
	</form>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem4>
	<p>Empresa</p>
	<p>Bairro</p>
	<form action="#">
		<div>
			<input type="button" value="Ver perfil" name="perfil" id=perfil4>
		</div>
	</form>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem5>
	<p>Empresa</p>
	<p>Bairro</p>
	<form action="#">
		<div>
			<input type="button" value="Ver perfil" name="perfil" id=perfil5>
		</div>
	</form>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem6>
	<p>Empresa</p>
	<p>Bairro</p>
	<form action="#"></form>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem7>
	<p>Empresa</p>
	<p>Bairro</p>
	<form action="#">
		<div>
			<input type="button" value="Ver perfil" name="perfil" id=perfil7>
		</div>
	</form>
</body>
</html>
