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
			<a href="home-coletor" target="_blank">
			<button type="button" name="home" id=home>Home</button>
			</a>
			<a href="depositosPendentes-coletor" target="_blank">
			<button type="button" name="pendentes" id=pendentes>Pendentes</button>
			</a>
			<a href="ranking-coletor" target="_blank">
			<button type="button" name="ranking" id=ranking>Ranking</button>
			</a>
			<a href="historicoDepositos-coletor">
			<button type="button" name="historico" id=historico>Histórico</button>
			</a>
			<a href="buscar-coletor" target="_blank">
			<button type="button" name="lupa" id=lupa>Lupa</button>
			</a>
			<a href="perfil-coletor">
			<button type="button" name="perfil" id=perfil>Perfil</button>
			</a>
		</nav>
        <h2> Ranking </h2>
        <h3> &#129351;  1° &#128100; Nome Pontuação Pontos </h3>
        <h3> &#129352;  2° &#128100; Nome Pontuação Pontos </h3>
        <h3> &#129353;  3° &#128100; Nome Pontuação Pontos </h3>
        <h2> Sua Elo </h2>
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
        <h2> Depósitos Recentes </h2>
        <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem3 >
				2x latinhas de 220ml
				<button type="button" class="buttonDelete" name="deletar" id=deletar2 >
					<b>EXCLUIR</b>
					</button>
				<br>
				<input type="date" id="data2" name="dataDeposito">
				<input type="text" placeholder="Empresa" name="empresa" id=empresa2>
        <h2> Conquistas Recentes </h2>
        <h3> Conquista 1 </h3>
        <h3> Conquista 2 </h3>
        <h2> + </h2>
	</body>
</html>