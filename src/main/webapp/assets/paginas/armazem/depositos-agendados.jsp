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
    	<ul>
    		<li>
			<a href="home-armazem" class="dropbtn" id=home>Home</a>
			</li>
        </ul>
        <ul>
        	<li>
			<a href="depositosAgendados-armazem" class="dropbtn" id=agendados>Agendados</a>
			</li>
        </ul>
        <ul>
        	<li>
            <a href="historicoDepositos-armazem" class="dropbtn" id=historico>Histórico</a>
            </li>
        </ul>
        <ul>
        	<li>
        	<input type="search" id="consulta-nome" placeholder="Buscar Usuário">
        	</li>
        </ul>
        <ul>
        	<li>
            <a href="perfil-armazem" class="dropbtn" id=perfil>Perfil</a>
            </li>
        </ul>    
        <br>
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