<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Pendentes</title>
		<style><%@include file="../../css/cooperativa/retiradas-pendentes.css"%></style>
		
	</head>
	<body>
	<a href="perfil-cooperativa" id="voltar">
			<svg>
				<%@include file="../../images/voltar.jsp"%>
			</svg>
		</a>
				
		<form action="principal-cooperativa">
			<h2> Retiradas agendadas </h2>
			
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
			
			<h2> Retiradas à serem aceitas </h2>
			
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
		</form>
		<br>
		<a href="cadastro-retirada" class="dropbtn" id=voltar>Criar Retirada</a>
	</body>
</html>