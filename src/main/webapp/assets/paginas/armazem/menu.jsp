<header>
	<nav>
		<div class="container-logo">
			<a class="item-logo" href="perfil-armazem">
				<svg class="imagem-eco2you">
		        	<%@include file="../../images/eCO2You.jsp"%>
		        </svg>
			</a>
		</div>
		<div class="container-menu">
			<div class="item-menu">
				<a  href="depositos-pendentes-armazem">
					<svg><%@include file="../../images/pendente.jsp"%></svg>Pendentes
				</a>
			</div>
			<div class="item-menu">
				<a href="historico-armazem">
					<svg><%@include file="../../images/historico.jsp"%></svg>Histórico
				</a>
			</div>
			<div class="item-menu">
				<a class="perfil" href="editar-perfil-coletor">
					<svg><%@include file="../../images/perfil.jsp"%></svg> Olá ${coletor.nome}
				</a>
			</div>
			<div class="item-menu">
				<a class="item-menu" href="deslogar">
					<svg><%@include file="../../images/logout.jsp"%></svg>
				</a>
			</div>
		</div>
    </nav>
    <hr/>
</header>