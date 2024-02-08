<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style><%@include file="../../../resources/css/style.css"%></style>
</head>
<body>
	<%@ include file="../../../assets/paginas/cooperativa/menu.jsp"%>
	
		<div class="box">
			<div class="flex-container">
				<div class="flex-item">
			        <div>
			        	<img alt="Imagem do Usuário" src="">
			        </div>
			        <div>
			        	<h3>${cooperativa.nome} ${cooperativa.cnpj} </h3>
			        </div>
					<div class="informacoes-box">
						<h3> Posição </h3>
					</div>
					<div class="informacoes-box">
						<h3> Pontuação </h3>
					</div>
				</div>
				 <div class=flex-item>
		        	<c:forEach var="retirada" items="${retiradas}">
			        	<div class="deposito-box">
			        		Status: ${deposito.statusDeDeposito}
			        		Data: ${deposito.data}
						</div>
		    		</c:forEach>
		       	</div>
				<div class=flex-item>
		        	<c:forEach var="conquista" items="${conquistas}">
			        	<div class="conquista-box">
			        		<div class="image-conquista-box">
			        			&#127941;
			        		</div>
							${conquista.nome}
						</div>
		    		</c:forEach>
		       	</div>
	       	</div>
	       	<button style="float: right;">+</button>
		</div>
	
	
	
	<h2>Pedidos de Requerimento Recentes</h2>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem1>
	<br>
	<br>
	<input type=text id=material1 placeholder=material name=material>
	<br>
	<br> peso DE material
	<br>
	<br>
	<input type="text" placeholder="Armazém" name="armazem" id=armazem1>
	<br>
	<br>
	<input type="date" id="data3" name="dataDeposito">
	<br>
	<br>
	<button type="button" class="buttonDelete" name="deletar" id=deletar3>
		<b>EXCLUIR</b>
	</button>
	<br>
	<br>
	<input type="image" src="caminho/da/imagem.jpg" name="imagem"
		id=imagem2>
	<br>
	<br>
	<input type=text id=material2 placeholder=material name=material>
	<br>
	<br> peso DE material
	<br>
	<br>
	<input type="text" placeholder="Armazém" name="armazem" id=armazem2>
	<br>
	<br>
	<input type="date" id="data2" name="dataDeposito">
	<br>
	<br>
	<button type="button" class="buttonDelete" name="deletar" id=deletar2>
		<b>EXCLUIR</b>
	</button>
	<h2>Armazéns Recomendados</h2>
    <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem7>
    <p>Empresa</p>
    <p>Bairro</p>
    <input type=text id=status1 placeholder=Status name=status>
    <br>
    <br>
    <a href="perfil-armazem7" class="dropbtn" id=perfil>Ver Perfil</a>
    <br><br>
    <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem7>
    <p>Empresa</p>
    <p>Bairro</p>
    <input type=text id=status2 placeholder=Status name=status>
    <br>
    <br>
    <a href="perfil-armazem7" class="dropbtn" id=perfil>Ver Perfil</a>
    <p>Empresa</p>
    <p>Bairro</p>
    <input type=text id=status3 placeholder=Status name=status>
    <br>
    <br>
    <a href="perfil-armazem7" class="dropbtn" id=perfil>Ver Perfil</a>
	<br><br>
    <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem7>
    <p>Empresa</p>
    <p>Bairro</p>
    <input type=text id=status4 placeholder=Status name=status>
    <br>
    <br>
    <a href="perfil-armazem7" class="dropbtn" id=perfil>Ver Perfil</a>
	<br><br>
    <input type="image" src="caminho/da/imagem.jpg" name="imagem" id=imagem7>
    <p>Empresa</p>
    <p>Bairro</p>
    <input type=text id=status5 placeholder=Status name=status>
    <br>
    <br>
    <a href="perfil-armazem7" class="dropbtn" id=perfil>Ver Perfil</a>
    <br>
    <br>
		<a href="cadastro-retirada" class="dropbtn" id=voltar>Fazer Retirada</a>
</body>
</html>
