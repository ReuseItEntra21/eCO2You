<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Depositos Aceitar</title>
<style><%@include file="../../css/style.css"%></style>
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
			<a href="depositosAgendados-armazem" class="dropbtn" id=agendados1>Depósitos Agendados</a>
			</li>
        </ul>
        <ul>
        	<li>
			<a href="retiradasAgendadas-armazem" class="dropbtn" id=agendadas2>Retiradas Agendadas</a>
			</li>
        </ul>
        <ul>
        	<li>
            <a href="historicoDepositos-armazem" class="dropbtn" id=historico1>Histórico Depósitos</a>
            </li>
        </ul>
        <ul>
        	<li>
            <a href="historicoRetiradas-armazem" class="dropbtn" id=historico2>Histórico Retiradas</a>
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