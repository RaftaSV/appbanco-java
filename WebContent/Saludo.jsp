<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>WELLCOME</h1>
	<script type="text/javascript">
	$(document).ready(function){
		
		$.post('ControllerMostrarInformacion',{
			//Enviar informacion
			
		},function(response){
			//Recibir informacion
			
			let datos = JSON.parse(response);
			
			console.log(datos);
			
		}
		);
	});
	
	</script>
	
</body>
</html>