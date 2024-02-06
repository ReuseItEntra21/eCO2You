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
        <ul>
    		<li>
                <a href="home-coletor" class="dropbtn" id=voltar>Voltar</a>
            </li>
        </ul>
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
		</form>
		<br>
		<form action ="cadastro-deposito">
        <button type="submit" name="adicionar" id=adicionar> Criar Depósito</button>
        </form>
	</body>
</html>