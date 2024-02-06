<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Perfil Cooperativa</title>
</head>
<body>
        <a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
		<nav>
    	<ul>
    		<li>
			<a href="home-coletor" class="dropbtn" id=home>Home</a>
			</li>
        </ul>
        <ul>
        	<li>
			<a href="depositosPendentes-coletor" class="dropbtn" id=pendentes>Pendentes</a>
			</li>
        </ul>
        <ul>
        	<li>
			<a href="editar-perfil-cooperativa" class="dropbtn" id=pendentes>Editar Perfil</a>
			</li>
        </ul>
        <ul>
        	<li>
            <a href="ranking-coletor" class="dropbtn" id=ranking>Ranking</a>
            </li>
        </ul>
        <ul>
        	<li>
            <a href="historicoDepositos-coletor" class="dropbtn" id=historico>Histórico</a>
        	</li>
        </ul>
        <ul>
        	<li>
        	<input type="search" id="consulta-nome" name= lupa placeholder="Buscar Usuário por nome">
        	</li>
        </ul>
        <ul>
        	<li>
            <a href="perfil-coletor" class="dropbtn" id=perfil>Perfil</a>
            </li>
        </ul>    
        <br>
    </nav>
	<img src="#" alt="Imagem" name="imagem" id=imagem1>
		<div>
		    	<h2> Nome </h2>
				<h3>${cooperativa.nome}</h3>
				<br>
				<h2> CNPJ </h2>	
				<h3>${cooperativa.cnpj}</h3>
				<br>
				<h2> Horario de Abertura </h2>
				<h3>${cooperativa.horarioAbertura}</h3>
				<br>
				<h2> Horario de Fechamento</h2>
				<h3>${cooperativa.horarioFechamento}</h3>
		</div>
	<div>
		Sobre
	</div>
	<div>
		<a href="#">Endereço</a>
	</div>
	<p>Número</p>
	<p>Endereço</p>
	<img src="#" alt="Imagem" name="imagem" id=imagem2>
    <br>
	<input type=text placeholder=Descrição name=descricao id=descricao>
    <br>
    <br>
	<form action="#">
    	<a href="#">Editar Informações</a>
        <br>
		<a href="#">Editar Horário</a>
        <br>
		<input type="submit" value="voltar" name="voltar" id=voltar>
		<button type="button" name="configuracoes" id=configuracoes>configuracoes</button>
	</form>
	<img src="#" alt="Imagem" name="imagem" id=imagem1>
	<h2>Nome</h2>
	<p>Horário de funcionamento</p>
	<p>Dias</p>
	<p>Horários</p>
	<p>Domingo</p>
	<p>Horários</p>
	<div>
		<a href="#">Sobre</a>
	</div>
	<div>
		Endereço
	</div>
	<p>Número</p>
	<p>Endereço</p>
	<img src="#" alt="Imagem pelo google maps" name="imagem" id=imagem2>
	<p>Rua</p>
	<p>rua</p>
	<p>N°</p>
	<p>número</p>
	<p>CEP</p>
	<p>#####-###</p>
	<p>Bairro</p>
	<p>bairro</p>
	<p>Cidade</p>
	<p>cidade</p>
</body>
</html>