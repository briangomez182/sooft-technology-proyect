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

	<div class="container p-5 col-lg-4">

		<form action="javascript:void(0);" onsubmit="event.preventDefault();">
			<div class="form-group">
				<label for="exampleInputEmail1">Id Ticket</label> 
				<select class="form-control" id="idTicket" >
                    <option value="1">1</option>
					<option value="2">2</option> 
					<option value="3">3</option> 
					<option value="4">4</option> 
					<option value="9">9</option>                 
                </select>
					 <small class="form-text text-muted">Id disponibles segun la API</small>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Comentario</label> <input
					type="text" class="form-control" id="comentario" name="comentario"
					placeholder="Texto Plano">
			</div>
			
			<button type="submit" class="btn btn-primary">Guardar</button>
		</form>

	</div>



	<script type="text/javascript">
	
	 
	
	$( document ).ready(function() {
		
		$('.btn-primary').click(function(){
		    validateMyForm2();
		});
		
	    
		 function validateMyForm2() {
			var idTicket =  $("#idTicket").val();
			var comentario =  $("#comentario").val();
			
			if(idTicket != ""){
				
				if(comentario != ""){
					
					comentario = comentario.replaceAll(' ', '%20');
					
					var URL = "http://localhost:8081/comentarios/crear/"+idTicket+"/"+comentario;
					
					$(location).attr('href', URL);
				}else{
					alert("Falta el comentario");
				}
				
			}else{
				alert("Falta el ID del Ticket");
			}
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