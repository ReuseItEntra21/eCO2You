<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Depositos Aceitar</title>
<style><%@include file="../../../resources/css/style.css"%></style>
</head>
<body>
	<nav>
		<form action="home-armazem">
			<button type="submit" name="home" id=home>Home</button>
		</form>
		<form action="depositosAgendados-armazem">
			<button type="submit" name="pendentes" id=agendados>Agendados</button>
		</form>
		<form action="historicoDepositos-armazem">
			<button type="button" name="historico" id=historico>Histórico</button>
		</form>
		<form action="buscar-coletor">
			<button type="submit" name="lupa" id=lupa>Lupa</button>
		</form>
		<input type="search" id="consulta-nome" name= lupa2 placeholder="Buscar Usuário">
		<br>
		<br>
		<form action="perfil-armazem">
			<button type="submit" name="perfil" id=perfil>Perfil</button>
		</form>
	</nav>
    <h2>Depósitos a Serem Aceitos</h2>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem1>
	<br>
	<br>
    2x latinhas de 220ml
    <br>
    <br>
	<input type="date" id="data1" name="dataDeposito">
	<br>
	<br>
	<input type="text" placeholder="Coletor" name="coletor" id=coletor1>
	<br>
	<br>
	<button type="button" class="buttonDelete" name="aceitar" id=aceitar1>
		<b>ACEITAR</b>
	</button>
    <button type="button" class="buttonDelete" name="rejeitar" id=rejeitar1>
		<b>REJEITAR</b>
	</button>
	<br>
	<br>
    <input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem1>
	<br>
	<br>
    2x latinhas de 220ml
    <br>
    <br>
	<input type="date" id="data1" name="dataDeposito">
	<br>
	<br>
	<input type="text" placeholder="Coletor" name="coletor" id=coletor1>
	<br>
	<br>
	<button type="button" class="buttonDelete" name="aceitar" id=aceitar1>
		<b>ACEITAR</b>
	</button>
    <button type="button" class="buttonDelete" name="rejeitar" id=rejeitar1>
		<b>REJEITAR</b>
	</button>
</body>
</html>