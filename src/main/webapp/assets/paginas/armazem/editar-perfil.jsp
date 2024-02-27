<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Perfil</title>
		<style><%@include file="../../css/armazem/editar-perfil.css"%></style>
	</head>
    <body>
        <div class="container-form">
        	<div class="item-form">
	        	<div  class="container-head">
	        		<div class="item-head">
	        			<span>Editar Perfil</span>
	        		</div>
	        		<div class="item-head">
	        			<div id="back">
	        				<a href="perfil-armazem" id="voltar"><svg><%@include file="../../images/xmark.jsp"%></svg></a>
	        			</div>
	        		</div>
	        	</div>
	        	<form action="atualizar-armazem">
					<div class="container-inputs">
						<div>
					<input type="text" value="<c:out value='${armazem.nome}' />" id="nome" name="nome" autofocus placeholder="Informe o seu Nome">
					<input type="text" value="<c:out value='${armazem.endereco.cep}' />" id="cep" name="cep" placeholder="Informe o seu CEP">
					</div>
					<div>
					<input type="email" value="<c:out value='${armazem.email}' />" id="email" name="email" placeholder="Informe o seu Email">
					<input type="text" value="<c:out value='${armazem.cnpj}' />" id="cnpj" name="cnpj" placeholder="Informe o seu CNPJ">
					</div>
					<div>
					<input type="tel" value="<c:out value='${armazem.endereco.telefone}' />" id="telefone" name="telefone" placeholder="Informe o seu Telefone">
					<input type="number" value="<c:out value='${armazem.endereco.numeroEndereco}' />" id="numeroEndereco" name="numeroEndereco" placeholder="Informe o Número">
					</div>
					<div>
					<input type="text" value="<c:out value='${armazem.senha}' />" id="senha" name="senha" placeholder="Informe a Senha">
					<input type="text" value="<c:out value='${armazem.endereco.cidade}' />" id="cidade" name="cidade" placeholder="Informe a sua Cidade">
					</div>
					<div>			
					<input type="time" value="<c:out value='${armazem.horarioAbertura}' />" id="horarioAbertura" name="horarioAbertura" placeholder="Informe o seu Horario de Abertura">
					<input type="text" value="<c:out value='${armazem.endereco.bairro}' />" id="bairro" name="bairro" placeholder="Informe o seu Bairro">
					</div>
					<div>			
					<input type="time" value="<c:out value='${armazem.horarioFechamento}' />" id="horarioFechamento" name="horarioFechamento" placeholder="Informe o seu Horario de Fechamento">
					<input type="text" value="<c:out value='${armazem.endereco.logradouro}' />" id="logradouro" name="logradouro" placeholder="Informe o Logradouro">
					</div>
					<div>
					<input type="number" value="<c:out value='${armazem.capacidadeArmazenagem}' />" id="capacidadeArmazenagem" name="capacidadeArmazenagem" placeholder="Informe o Número">
					<input type="text" value="<c:out value='${armazem.endereco.complemento}' />" id="complemento" name="complemento" placeholder="Informe o complemento">
				</div>
			        </div>
				</form>
	        </div>      	
	        </div>
		<div class="conteiner-buttons">
			<a href="deslogar" id="deslogar">Deslogar</a>
			<a href="deletar-coletor" id="excuir">Excluir Conta</a>
			<a href="recuperar-senha" id="recuperar">Atualizar Senha</a>
			<input type="submit" value="Salvar" id="salvar" class="conteiner-buttons">
		</div> 
    </body>
</html>