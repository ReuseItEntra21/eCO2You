<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
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
			<input type="search" id="consulta-nome" name= lupa2 placeholder="Buscar Usuário por nome">
			<br>
			<br>
			<form action="perfil-coletor">
				<button type="submit" name="perfil" id=perfil>Perfil</button>
			</form>
		</nav>
        <h2> Ranking </h2>
        <h3> &#129351;  1° &#128100; Nome Pontuação Pontos </h3>
        <h3> &#129352;  2° &#128100; Nome Pontuação Pontos </h3>
        <h3> &#129353;  3° &#128100; Nome Pontuação Pontos </h3>
        <h2> Seu Nível de Elo </h2>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem1>
        <h2> Depósitos Recentes </h2>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem2 >
				2x latinhas de 220ml
				<button type="button" class="buttonDelete" name="deletar" id=deletar1 >
					<b>EXCLUIR</b>
					</button>
				<br>
				<input type="date" id="data1" name="dataDeposito">
				<input type="text" placeholder="Empresa" name="empresa" id=empresa1>
        <br>
        <br>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem3 >
				2x latinhas de 220ml
				<button type="button" class="buttonDelete" name="deletar" id=deletar2 >
					<b>EXCLUIR</b>
					</button>
				<br>
				<input type="date" id="data2" name="dataDeposito">
				<input type="text" placeholder="Empresa" name="empresa" id=empresa2>
        <h2> Depósitos à Serem Aceitos </h2>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem3 >
				2x latinhas de 220ml
                <br>
				<br>
				<input type="date" id="data3" name="dataDeposito">
                <br>
                <br>
				<input type="text" placeholder="Empresa" name="empresa" id=empresa3>
                <br>
                <br>
                <button type="button" class="buttonDelete" name="deletar" id=deletar3 >
					<b>EXCLUIR</b>
					</button>
        <br>
        <br>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem4 >
				2x latinhas de 220ml
                <br>
				<br>
				<input type="date" id="data4" name="dataDeposito">
                <br>
                <br>
				<input type="text" placeholder="Empresa" name="empresa" id=empresa4>
                <br>
                <br>
                <button type="button" class="buttonDelete" name="deletar" id=deletar4>
					<b>EXCLUIR</b>
					</button>
        <h2>Conquistas Recentes </h2>
        <h3> emoji Conquista 1 </h3>
        <h3> emoji Conquista 2 </h3>
        <h2> + </h2>
	</body>
</html>