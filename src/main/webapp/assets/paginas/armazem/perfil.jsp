<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Perfil Armazem</title>
</head>
<body>
	<div>
		  <%@ include file="../../../assets/paginas/armazem/menu.jsp"%>
          <div>
              <img src="#" alt="Imagem Perfil" name="imagem" id=imagem1>
              <span>${armazem.nome}</span>
              <span>"FECHADO - abre" ${armazem.horarioAbertura}</span>
              <span>${armazem.endereco.tipovia} ${armazem.endereco.logradouro}</span>
              <span>${armazem.endereco.bairro}</span>
              <span>${armazem.endereco.numeros}</span>
              <span>${armazem.endereco.cidade}, SC</span>
          </div>
          <div>
              <span>${armazem.statusArmazem}</span>
              <a href="/editar-perfil-armazem" id=editarPerfil>Editar Perfil</a>
              <img src="#" name=imagem id=imagem2>
          </div>
      <div class="container-select">
          <div class="item-select"> Depósitos pendentes</div>
          <div class="item-select"> Retiradas pendentes </div>
          <div class="item-select"> Histórico de depósitos</div>
          <div class="item-select"> Histórico de retiradas </div>
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
              <button type=submit>Aceitar</button>
              <button type=button>Rejeitar</button>
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
              <span>${deposito.coletor}</span>
              <button type=button>Excluir</button>
          </c:forEach>
      </div>
   </div>  
   <div>
		  <%@ include file="../../../assets/paginas/armazem/menu.jsp"%>
          <div>
              <img src="#" alt="Imagem Perfil" name="imagem" id=imagem1>
              <span>${armazem.nome}</span>
              <span>"FECHADO - abre" ${armazem.horarioAbertura}</span>
              <span>${armazem.endereco.tipovia} ${armazem.endereco.logradouro}</span>
              <span>${armazem.endereco.bairro}</span>
              <span>${armazem.endereco.numeros}</span>
              <span>${armazem.endereco.cidade}, SC</span>
          </div>
          <div>
              <span>${armazem.statusArmazem}</span>
              <a href="/editar-perfil-armazem" id=editarPerfil>Editar Perfil</a>
              <img src="#" name=imagem id=imagem2>
          </div>
      <div class="container-select">
          <div class="item-select"> Depósitos pendentes</div>
          <div class="item-select"> Retiradas pendentes </div>
          <div class="item-select"> Histórico de depósitos</div>
          <div class="item-select"> Histórico de retiradas </div>
      </div>
          <div class="container-retiradas">
          <span> Retiradas á serem aceitas </span>
          <c:forEach var="retirada" items="${retiradas}">
              <img src="#" alt="Imagem ItemRetirada" name="imagem" id=imagem7>
              <c:forEach var="itemRetirada" items="${itemRetiradas}">
                  <span>${itemRetirada.material.nome}</span>
                  <span>${itemRetirada.material.peso}</span>
              </c:forEach>
              <span>${retirada.data}</span>
              <button type=submit>Aceitar</button>
              <button type=button>Rejeitar</button>
          </c:forEach>
          <span> Retiradas Agendadas </span>
          <c:forEach var="retirada" items="${retiradas}">
              <img src="#" alt="Imagem ItemRetirada" name="imagem" id=imagem8>
              <c:forEach var="itemRetirada" items="${itemRetiradas}">
                  <span>${itemRetirada.material.nome}</span>
                  <span>${itemRetirada.material.peso}</span>
              </c:forEach>
              <span>${retirada.data}</span>
              <span>${retirada.cooperativa}</span>
              <button type=button>Excluir</button>
          </c:forEach>
      </div>
   </div>
   <div>
		  <%@ include file="../../../assets/paginas/armazem/menu.jsp"%>
          <div>
              <img src="#" alt="Imagem Perfil" name="imagem" id=imagem1>
              <span>${armazem.nome}</span>
              <span>"FECHADO - abre" ${armazem.horarioAbertura}</span>
              <span>${armazem.endereco.tipovia} ${armazem.endereco.logradouro}</span>
              <span>${armazem.endereco.bairro}</span>
              <span>${armazem.endereco.numeros}</span>
              <span>${armazem.endereco.cidade}, SC</span>
          </div>
          <div>
              <span>${armazem.statusArmazem}</span>
              <a href="/editar-perfil-armazem" id=editarPerfil>Editar Perfil</a>
              <img src="#" name=imagem id=imagem2>
          </div>
      <div class="container-select">
          <div class="item-select"> Depósitos pendentes</div>
          <div class="item-select"> Retiradas pendentes </div>
          <div class="item-select"> Histórico de depósitos</div>
          <div class="item-select"> Histórico de retiradas </div>
      </div>
      <div>
      <div class="container-depositos">
			<table border="1" style="width: 99vw;">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Data</th>
	                    <th>Resumo</th>
					</tr>
				</thead>
				<c:forEach var="deposito" items="${depositos}">
					<tr>
                    	<td>${deposito.coletor.nome}</td>
						<td>${deposito.data}</td>
	                	<td>${itemDeposito.quantidadeReciclaveis} ${itemDeposito.reciclavel.nome} ${itemDeposito.reciclavel.volume}</td>
					</tr>
				</c:forEach>
			</table>
	    </div>
      </div>
   </div>
   <div>
		  <%@ include file="../../../assets/paginas/armazem/menu.jsp"%>
          <div>
              <img src="#" alt="Imagem Perfil" name="imagem" id=imagem1>
              <span>${armazem.nome}</span>
              <span>"FECHADO - abre" ${armazem.horarioAbertura}</span>
              <span>${armazem.endereco.tipovia} ${armazem.endereco.logradouro}</span>
              <span>${armazem.endereco.bairro}</span>
              <span>${armazem.endereco.numeros}</span>
              <span>${armazem.endereco.cidade}, SC</span>
          </div>
          <div>
              <span>${armazem.statusArmazem}</span>
              <a href="/editar-perfil-armazem" id=editarPerfil>Editar Perfil</a>
              <img src="#" name=imagem id=imagem2>
          </div>
      <div class="container-select">
          <div class="item-select"> Depósitos pendentes</div>
          <div class="item-select"> Retiradas pendentes </div>
          <div class="item-select"> Histórico de depósitos</div>
          <div class="item-select"> Histórico de retiradas </div>
      </div>
      <div>
      <div class="container-retiradas">
			<table border="1" style="width: 99vw;">
				<thead>
					<tr>
						<th>Comprador</th>
						<th>Data</th>
	                    <th>Resumo</th>
					</tr>
				</thead>
				<c:forEach var="retirada" items="${retiradas}">
					<tr>
                    	<td>${retirada.cooperativa.nome}</td>
						<td>${retirada.data}</td>
	                	<td>${itemRetirada.material.nome} ${itemRetirada.material.peso}</td>
					</tr>
				</c:forEach>
			</table>
	    </div>
      </div>
   </div>
</body>
</html>
