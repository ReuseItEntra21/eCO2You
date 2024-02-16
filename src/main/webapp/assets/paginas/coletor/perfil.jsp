<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Perfil Coletor</title>
</head>
<body>
	<%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
	<div>
	<img src="#" alt="Imagem Perfil" name="imagem" id=imagem1>
	<span>${coletor.nome}</span>
	<span>${coletor.sobrenome}</span>
	<span>${coletor.id}</span>
	<span>${coletor.cidade}</span>
	<span>${coletor.estado}</span>
	</div>
	<div>
	<a href="/editar-perfil-coletor" id=editarPerfil>Editar Perfil
		</a>
    <img src="#" name=imagem id=imagem2>
    <a href="/ranking-coletor" id=ranking>${coletor.posição}
		</a>
    <span>${coletor.pontos}</span>    
	</div>
    <div>
    <span> Próximo Depósito </span>
    <span> Histórico </span>
    <span> Pendentes </span>
    <span> Conquistas </span>
    </div>
    <div class="container-armazens">
		<c:forEach var="armazem" items="${armazens}">
	    	<div class="item-armazens">
            	<span>Ganhará</span>
            	<span>${pontos.conquistados}</span>
                <span>pontos!</span>
	    		<img alt="Imagem Armazem" src="" id=imagem2.5>
	    		<span>${armazem.nome}</span>
                <span>${armazem.cep}</span>
                <span>${armazem.cidade}</span>
                <span>${armazem.tipoVia}</span>
	    		<span>${armazem.logradouro}</span>
                <span>Número:</span>
                <span>${armazem.numero}</span>
                <span>${armazem.bairro}</span>
                <c:forEach var="itemDeposito" items="${armazens}">
                	<span>${itemDeposito.quantidadeReciclavel}</span>
                	<span>${itemDeposito.reciclavel.nome}</span>
                	<span>${itemDeposito.reciclavel.volume}</span>
            	</c:forEach> 
	    	</div>
    	</c:forEach>
    </div>
    <div>
	<img src="#" alt="Imagem Perfil" name="imagem" id=imagem3>
	<span>${coletor.nome}</span>
	<span>${coletor.sobrenome}</span>
	<span>${coletor.id}</span>
	<span>${coletor.cidade}</span>
	<span>${coletor.estado}</span>
	</div>
	<div>
	<a href="/editar-perfil-coletor" id=editarPerfil>Editar Perfil
		</a>
    <img src="#" name=imagem id=imagem4>
    <a href="/ranking-coletor" id=ranking>${coletor.posição}
		</a>
    <span>${coletor.pontos}</span>    
	</div>
    <div>
    <span> Próximo Depósito </span>
    <span> Histórico </span>
    <span> Pendentes </span>
    <span> Conquistas </span>
    </div>
    <div class="container-depositos">
		<table border="1" style="width: 99vw;">
			<thead>
				<tr>
					<th>Data</th>
					<th>Armazém</th>
                    <th>Pontuação</th>
                    <th>Resumo</th>
				</tr>
			</thead>
			<c:forEach var="deposito" items="${depositos}">
				<tr>
					<td>${deposito.data}</td>
					<td>${deposito.armazem.nome}</td>
                	<td>${deposito.pontos}</td>
                	<td>${itemDeposito.quantidadeReciclaveis} ${itemDeposito.reciclavel.nome} ${itemDeposito.reciclavel.volume}</td>
				</tr>
			</c:forEach>
		</table>
    </div>
    <div>
	<img src="#" alt="Imagem Perfil" name="imagem" id=imagem5>
	<span>${coletor.nome}</span>
	<span>${coletor.sobrenome}</span>
	<span>${coletor.id}</span>
	<span>${coletor.cidade}</span>
	<span>${coletor.estado}</span>
	</div>
	<div>
	<a href="/editar-perfil-coletor" id=editarPerfil>Editar Perfil
		</a>
    <img src="#" name=imagem id=imagem6>
    <a href="/ranking-coletor" id=ranking>${coletor.posição}
		</a>
    <span>${coletor.pontos}</span>    
	</div>
    <div>
    <span> Próximo Depósito </span>
    <span> Histórico </span>
    <span> Pendentes </span>
    <span> Conquistas </span>
    </div>
    <div class="container-depositos">
    	<span> Depósitos á serem aceitos </span>
		<c:forEach var="deposito" items="${depositos}">
	    	<img src="#" alt="Imagem ItemDeposito" name="imagem" id=imagem7>
            <c:forEach var="itemDeposito" items="${itemDepositos}">
            	<span>${itemDeposito.quantidadeReciclaveis}</span>
            	<span>${itemDeposito.reciclavel.nome}</span>
            	<span>${itemDeposito.reciclavel.volume}</span>
            </c:forEach>
            <span>${deposito.data}</span>
            <span>${deposito.nome}</span>
            <button type=button>Excluir</button>
    	</c:forEach>
        <span> Depósitos Agendados </span>
        <c:forEach var="deposito" items="${depositos}">
	    	<img src="#" alt="Imagem ItemDeposito" name="imagem" id=imagem8>
            <c:forEach var="itemDeposito" items="${itemDepositos}">
            	<span>${itemDeposito.quantidadeReciclaveis}</span>
            	<span>${itemDeposito.reciclavel.nome}</span>
            	<span>${itemDeposito.reciclavel.volume}</span>
            </c:forEach>
            <span>${deposito.data}</span>
            <span>${deposito.nome}</span>
            <button type=button>Excluir</button>
    	</c:forEach>
    </div>
    
    <div>
	<img src="#" alt="Imagem Perfil" name="imagem" id=imagem9>
	<span>${coletor.nome}</span>
	<span>${coletor.sobrenome}</span>
	<span>${coletor.id}</span>
	<span>${coletor.cidade}</span>
	<span>${coletor.estado}</span>
	</div>
	<div>
	<a href="/editar-perfil-coletor" id=editarPerfil>Editar Perfil
		</a>
    <img src="#" name=imagem id=imagem10>
    <a href="/ranking-coletor" id=ranking>${coletor.posição}
		</a>
    <span>${coletor.pontos}</span>    
	</div>
    <div>
    <span> Próximo Depósito </span>
    <span> Histórico </span>
    <span> Pendentes </span>
    <span> Conquistas </span>
    </div>
    <div class="container-conquistas">
		<c:forEach var="conquista" items="${conquistas}">
        	<img src="#" name=imagem id=imagem11>
            <span>${conquista.nome}</span>
            <span>${conquista.requisitos}</span>
    	</c:forEach>
    </div>
</body>
</html>
