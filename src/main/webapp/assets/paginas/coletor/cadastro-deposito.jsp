<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
    <head>
	    <meta charset="UTF-8">
		<title>Cadastro</title>
		<style><%@include file="../../css/coletor/cadastro-deposito.css"%></style>
		<style><%@include file="../../css/menu.css"%></style>
		<style><%@include file="../../css/footer.css"%></style>
    </head>
    <body>
	    <%@ include file="../../../assets/paginas/coletor/menu.jsp"%>
	    <div class="title">Oferta de Depósito</div>
	    <div class="container-form">
	    	<form action="">
		    	<div class="item-form">
		    		<label></label>
		    		<input type="date">
		    	</div>
		    	<div class="item-form">
		    		<label></label>
		    		<input type="text">
		    	</div>
		    	<div class="item-form">
		    		<label></label>
		    		<input type="text">
		    	</div>
		    	<div class="item-form">
		    		<label></label>
		    		<input type="text">
		    	</div>
	    		<button type="submit">Agendar</button>
	    	</form>
	    </div>
		<%@ include file="../footer.jsp"%>
    </body>
</html>