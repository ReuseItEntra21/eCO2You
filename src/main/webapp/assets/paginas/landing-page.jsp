<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>eCO2You</title>
		<style><%@include file="../../resources/css/apresentacao.css"%></style>
	</head>
	<body>
		<nav>
		<a href="#">Coletas</a>
		<a href="#">Ranking</a>
		<a href="#">Cadastra-se</a>
		<a href="#">Entrar</a>
	</nav>
	<h1>CONECTANDO DOADORES COM PONTOS DE COLETA.</h1>
	<p>Transfommando sua contribuição em impacto sustentável.</p>
	<input type="submit" value="Seja um coletor" id="serColetor">
	<input type="submit" value="Pontos de coleta" id="pontosColeta">
	<h2>Descubra uma nova maneira de fazer a diferença no mundo. Na Eco2You, estamos unindo comunidades em prol da sustentabilidade. Conectamos pessoas que desejam contribuir com materiais recicláveis a armazéns comprometidos com o meio ambiente. Nosso objetivo é criar um impacto positivo e duradouro em nosso planeta.</h2>
	<h3>Sobre os coletores</h3>
	<div class="flex-container">
        	<div class="flex-item">
	        	<h3> Coletor </h3>
		        Os coletores são os usuários comuns,
		        pessoas que recolhem e
		        guardam os recicláveis,
		        depois enviam para os armazéns.
		        <div class="usuarios-button">
		        	<a href="<%=request.getContextPath()%>/cadastro-coletor">Ser um Coletor</a>
		        </div>
	        </div>
	        <div class="flex-item">
		        <h3> Armazém </h3>
			    Os armazéns são as empresas,
			    que se dispõem a armazenar
			    os recicláveis coletados.
			    <div class="usuarios-button">
			    <a href="<%=request.getContextPath()%>/cadastro-armazem">Ser um Armazém</a>
			    </div>
	        </div>
	        <div class="flex-item">
		        <h3>Cooperativa</h3>
				    As cooperativas são as empresas,
				    que retiram o material armazenado,
				    e então realiza a reciclágem.
				<div class="usuarios-button">
				<a href="<%=request.getContextPath()%>/cadastro-cooperativa">Ser uma Cooperativa</a>
			</div>
		</div>
    </div>
	<h2>PERGUNTAS FREQUENTES</h2>
	<p>Qual seria o sistema de classificação?</p>
	<p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Adipisci autem a esse consectetur laboriosam illum iure eum temporibus quis sed? Itaque odit magni aliquam perferendis, accusamus soluta non sint dolorum.</p>
	<br>
	<p>Qual seria o sistema de classificação?</p>
	<p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Adipisci autem a esse consectetur laboriosam illum iure eum temporibus quis sed? Itaque odit magni aliquam perferendis, accusamus soluta non sint dolorum.</p>
	<br>
	<p>Qual seria o sistema de classificação?</p>
	<p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Adipisci autem a esse consectetur laboriosam illum iure eum temporibus quis sed? Itaque odit magni aliquam perferendis, accusamus soluta non sint dolorum.</p>
	<br>
	<p>Qual seria o sistema de classificação?</p>
	<p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Adipisci autem a esse consectetur laboriosam illum iure eum temporibus quis sed? Itaque odit magni aliquam perferendis, accusamus soluta non sint dolorum.</p>
	<br>
	<p>Qual seria o sistema de classificação?</p>
	<p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Adipisci autem a esse consectetur laboriosam illum iure eum temporibus quis sed? Itaque odit magni aliquam perferendis, accusamus soluta non sint dolorum.</p>
	<br>
	<footer>
		
	</footer>
	</body>
</html>