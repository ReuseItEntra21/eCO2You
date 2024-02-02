<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Perfil armazém</title>
</head>
<body>
	<form action="home-armazem">
		<button type="submit" name="voltar" id=voltar>voltar</button>
	</form>
	<form action="editarPerfil-armazem">
		<button type="submit" name="editar" id=editar>Editar Perfil</button>
	</form>
	<br>
	<img src="#" alt="Imagem Giassi" name="imagem" id=imagem1>
	<p>Horário de funcionamento</p>
	<input type="text" placeholder="Dias da Semana" id=diasSemana name=diasSemana>
	<input type="text" placeholder="Horário" id=horario1 name=horario>
	<br>
	<br>
	<input type="text" placeholder="Domingo" id=domingo name=domingo>
	<input type="text" placeholder="Horário" id=horario2 name=horario>
	<div>
		Sobre
	</div>
	<div>
		<a href="#">Endereço</a>
	</div>
	<p>(47) 3144-1800</p>
	<p>contato@giassi.com.br</p>
	<img src="#" alt="Imagem Giassi" name="imagem" id=imagem2>
	<br>
	<input type="text" placeholder="Descrição" id=descricao name=descricao>
	<br>
    <br>
    <form action="#">
		<input type="submit" value="voltar" name="voltar" id=voltar>
	</form>
	<img src="#" alt="Imagem Giassi" name="imagem" id=imagem3>
	<h2>Giassi</h2>
	<p>Horário de funcionamento</p>
	<input type="text" placeholder="Dias da Semana" id=diasSemana2 name=diasSemana>
	<input type="text" placeholder="Horário" id=horario3 name=horario>
	<br>
	<br>
	<input type="text" placeholder="Domingo" id=domingo2 name=domingo>
	<input type="text" placeholder="Horário" id=horario4 name=horario>
	<div>
		<a href="#">Sobre</a>
	</div>
	<div>
		Endereço
	</div>
	<p>(47) 3144-1800</p>
	<p>contato@giassi.com.br</p>
	<img src="#" alt="Imagem Giassi pelo google maps" name="imagem" id=imagem4>
	<p>Rua</p>
	<input type="text" placeholder="Rua" id=rua name=rua>
	<p>N°</p>
	<input type="text" placeholder="Número" id=numero name=numero>
	<p>CEP</p>
	<input type="text" placeholder="CEP" id=cep name=cep>
	<p>Bairro</p>
	<input type="text" placeholder="Bairro" id=bairro name=bairro>
	<p>Cidade</p>
	<input type="text" placeholder="Cidade" id=cidade name=cidade>
	<h2> Nome </h2>
				<h3>${armazem.nome}</h3>
				<br>
				<h2> CNPJ </h2>	
				<h3>${armazem.cnpj}</h3>
				<br>
				<h2> Capacidade de Armazenagem </h2>
				<h3>${armazem.capacidadeArmazenagem}</h3>
				<br>
				<h2> Horario de Abertura </h2>
				<h3>${armazem.horarioAbertura}</h3>
				<br>
				<h2> Horario de Fechamento</h2>
				<h3>${armazem.horarioFechamento}</h3>
</body>
</html>