<header>
	<nav>
		<div class="container-logo">
			<a class="item-logo" href="perfil-cooperativa">
				<svg class="imagem-eco2you">
		        	<%@include file="../../images/eCO2You.jsp"%>
		        </svg>
			</a>
		</div>
		<div class="container-menu">
			<div class="item-menu">
				<a  href="depositos-agendados-cooperativa" id=agendados>
					<svg><%@include file="../../images/pendente.jsp"%></svg>Depósito Agendados
				</a>
			</div>
			<div class="item-menu">
				<a  href="retiradas-agendadas-armazem" id=agendadas>
					<svg><%@include file="../../images/pendente.jsp"%></svg>Retiradas Agendadas
				</a>
			</div>
			<div class="item-menu">
				<a href="historico-deposito-armazem" id=historicoDeposito>
					<svg><%@include file="../../images/historico.jsp"%></svg>Histórico Deposito
				</a>
			</div>
			<div class="item-menu">
				<a href="historico-retirada-armazem" id=historicoRetirada>
					<svg><%@include file="../../images/historico.jsp"%></svg>Histórico Retirada
				</a>
			</div>
			<div class="item-menu">
				<a class="perfil" href="editar-perfil-armazem" id=perfil>
					<svg><%@include file="../../images/perfil.jsp"%></svg> Olá ${armazem.nome}
				</a>
			</div>
			<div class="item-menu">
				<a class="item-menu" href="deslogar" id=deslogar>
					<svg><%@include file="../../images/logout.jsp"%></svg>
				</a>
			</div>
		</div>
    </nav>
    <hr/>
</header>
