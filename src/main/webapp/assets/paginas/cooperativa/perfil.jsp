<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Perfil Cooperativa</title>
		<style><%@ include file="../../css/cooperativa/menu.css"%></style>
	</head>
	<body>
    <div>
        <%@ include file="menu.jsp"%>
        <div>
            <img src="#" alt="Imagem Perfil" name="imagem" id="imagem1"> <span>${cooperativa.nome}</span>
            <span>"FECHADO - abre" ${cooperativa.horarioAbertura}</span> <span>${cooperativa.endereco.tipovia}
                ${cooperativa.endereco.logradouro}</span> <span>${cooperativa.endereco.bairro}</span>
            <span>${cooperativa.endereco.numeros}</span> <span>${cooperativa.endereco.cidade},
                SC</span>
        </div>
        <div>
            <a href="editar-perfil-cooperativa" id="editarPerfil">Editar Perfil</a>
            <img src="#" name="imagem" id="imagem2">
        </div>
        <div class="container-select">
            <div class="item-select">Requerimentos</div>
            <div class="item-select">Histórico de retiradas</div>
        </div>
        <div class="container-retiradas">
            <span> Pedidos de requerimento recentes </span>
            <c:forEach var="retirada" items="${retiradas}">
                <img src="#" alt="Imagem ItemRetirada" name="imagem" id="imagem7">
                <c:forEach var="itemRetirada" items="${retirada.itensRetirada}">
                    <span>${itemRetirada.material.peso}</span>
                    <span>${itemRetirada.material.nome}</span>
                </c:forEach>
                <span>${retirada.armazem.nome}</span>
                <span>${retirada.data}</span>
                <button type="button">Excluir</button>
            </c:forEach>
        </div>
        <span>Armazéns Recomendados</span>
        <c:forEach var="armazem" items="${armazens}">
            <span>${armazem.foto}</span>
            <span>${armazem.nome}</span>
        </c:forEach>
        <div>
            <div class="container-retiradas">
                    <c:forEach var="retirada" items="${retiradas}">
                        <tr>
                            <td>${retirada.armazem.nome}</td>
                            <td>${retirada.data}</td>
                            <td>
                                <c:forEach var="itemRetirada" items="${retirada.itensRetirada}">
                                    ${itemRetirada.material.nome} ${itemRetirada.material.peso}
                                </c:forEach>
                            </td>
                        </tr>
                    </c:forEach>
            </div>
        </div>
    </div>
</body>
</html>
