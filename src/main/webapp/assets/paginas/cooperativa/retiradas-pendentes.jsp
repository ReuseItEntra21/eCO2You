<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Pendentes</title>
		<style><%@include file="../../../assets/css/style.css"%></style>
	</head>
	<body>
	<br>
	<a href="home-cooperativa" class="dropbtn" id=voltar>Voltar</a>
		<nav>
    	<ul>
    		<li>
			<a href="home-cooperativa" class="dropbtn" id=home>Home</a>
			</li>
        </ul>
        <ul>
        	<li>
			<a href="retiradasPendentes-cooperativa" class="dropbtn" id=pendentes>Pendentes</a>
			</li>
        </ul>
        <ul>
        	<li>
            <a href="historicoRetirada-cooperativa" class="dropbtn" id=historico>Histórico</a>
        	</li>
        </ul>
        <ul>
        	<li>
        	<input type="search" id="consulta-nome" name= lupa placeholder="Buscar Armazem por nome">
        	</li>
        </ul>
        <ul>
        	<li>
            <a href="perfil-cooperativa" class="dropbtn" id=perfil>Perfil</a>
            </li>
        </ul>    
    </nav>
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