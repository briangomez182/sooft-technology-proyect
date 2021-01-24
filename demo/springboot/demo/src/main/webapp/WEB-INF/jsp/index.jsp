<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Api Document Soft-Proyect</title>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>

<style type="text/css">
.badge {
	display: inline-block;
	font-weight: 400;
	color: #fff;
	text-align: center;
	vertical-align: middle;
	user-select: none;
	border: 1px solid transparent;
	padding: .375rem .75rem;
	font-size: 1rem;
	line-height: 1.5;
	border-radius: .25rem;
}

.row {
	margin-bottom: 50px;
}

.etiquetaApi {
	font-size: 30px;
	color: #da0505;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="includes/top.jsp" />


	<div class="container p-5">
		<div class="row align-items-center">


			<div class="padre col-lg-12">
				<div class="texto col-lg-12">
					<div class="row">
						<a href="comentarios/buscar/1"
							class="badge badge-success col-lg-2">GET</a>
						<div class="etiquetaApi col-lg-8">/comentarios/buscar/{id}</div>
						<div id="descripcion1" class="col-lg-10 offset-lg-1">
							<p>Parámetros (Long id) - Return List ComentarioModel</p>
							<p>Este Endpoint nos permite buscar todos los comentarios de
								un ticket</p>
						</div>
					</div>
				</div>
			</div>

			<br />

			<div class="padre col-lg-12">
				<div class="texto col-lg-12">
					<div class="row">
						<a href="nuevoComentario"
							class="badge badge-success col-lg-2">GET</a>
						<div class="etiquetaApi col-lg-8">/comentarios/crear/{id}/{comentario}</div>

						<div id="descripcion2" class="col-lg-10 offset-lg-1">
							<p>Parámetros (Long id) - Return String</p>
							<p>Parámetros (String comentario) - Return ComentarioModel</p>
							<p>Este Endpoint nos permite crear un comentario en un ticket</p>
						</div>
					</div>
				</div>
			</div>
			<br />

			<div class="padre col-lg-12">
				<div class="texto col-lg-12">
					<div class="row">
						<a href="carreras" class="badge badge-success col-lg-2">GET</a>
						<div class="etiquetaApi col-lg-8">/carreras</div>

						<div id="descripcion3" class="col-lg-10 offset-lg-1">
							<p>Parámetros (Sin Parámetros) - Return ArrayList
								CarreraModel</p>
							<p>Este Endpoint nos permite acceder a las carreras</p>
						</div>
					</div>
				</div>
			</div>
			<br />

			<div class="padre col-lg-12">
				<div class="texto col-lg-12">
					<div class="row">
						<a href="#" class="badge badge-primary col-lg-2">POST</a>
						<div class="etiquetaApi col-lg-8">/carreras</div>

						<div id="descripcion4" class="col-lg-10 offset-lg-1">
							<p>Body (JSON Carrera) - Return ArrayList CarreraModel</p>
							<p>Este Endpoint nos permite crear una carrera - POSTMAN</p>
						</div>
					</div>
				</div>
			</div>
			<br />

			<div class="padre col-lg-12">
				<div class="texto col-lg-12">
					<div class="row">
						<a href="carreras/1" class="badge badge-success col-lg-2">GET</a>
						<div class="etiquetaApi col-lg-8">/carreras/{id}</div>

						<div id="descripcion5" class="col-lg-10 offset-lg-1">
							<p>Parámetros (Integer id) - Return CarreraModel</p>
							<p>Este Endpoint nos permite acceder a una carrera pasando su
								ID</p>
						</div>
					</div>
				</div>
			</div>
			<br />

			<div class="padre col-lg-12">
				<div class="texto col-lg-12">
					<div class="row">
						<a href="carreras/query?prioridad=2"
							class="badge badge-success col-lg-2">GET</a>
						<div class="etiquetaApi col-lg-8">/carreras/query</div>

						<div id="descripcion5" class="col-lg-10 offset-lg-1">
							<p>Parámetros (Integer prioridad) - Return ArrayList
								CarreraModel</p>
							<p>Este Endpoint nos permite acceder a las carreras con la
								prioridad que le pasamos</p>
						</div>
					</div>
				</div>
			</div>
			<br />

			<div class="padre col-lg-12">
				<div class="texto col-lg-12">
					<div class="row">
						<a href="#" class="badge badge-danger col-lg-2">DELETE</a>
						<div class="etiquetaApi col-lg-8">/carreras/{id}</div>

						<div id="descripcion5" class="col-lg-10 offset-lg-1">
							<p>Parámetros (Integer id) - Return String</p>
							<p>Este Endpoint nos permite eliminar una carrera con el id
								que le pasemos - POSTMAN</p>
						</div>
					</div>
				</div>
			</div>
			<br />

		</div>
	</div>
	
	<script type="text/javascript">
	
	$( document ).ready(function() {
		
		$('.badge-primary').click(function(){
			postman();
		});
		
		$('.badge-danger').click(function(){
			postman();
		});
		
	    
		 function postman() {
				alert("Esta Api se hace desde Postman");
		 }
	});
	
	</script>



	<!--<script type="text/javascript" src="js/main.js"></script>
 Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
</body>
</html>
