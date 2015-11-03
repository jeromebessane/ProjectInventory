<%@page import="org.orange.metier.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">
	<link rel="stylesheet" href="css/home.css">
	<head>
		<%@ include file="header.jsp" %>		
	</head>
	
	<body>
		<h2>Welcome to the Inventory !</h2>
		<div class="container">
			<div class="row">
				<div class="col-lg-3">
					<img src="http://image.noelshack.com/fichiers/2015/45/1446563442-router.png" class="img-rounded">
					<a href="#">Router</a>
				</div>
				<div class="col-lg-3 col-lg-offset-1">
					<img src="http://image.noelshack.com/fichiers/2015/45/1446562194-switch.png" class="img-rounded">
					<a href="#">Switch</a>
				</div>
				<div class="col-lg-3 col-lg-offset-1">
					<img src="http://image.noelshack.com/fichiers/2015/45/1446563448-firewall.png" class="img-rounded">
					<a href="#">Firewall</a>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-3">
					<img src="http://image.noelshack.com/fichiers/2015/45/1446563457-visio-conferencing.png" class="img-rounded">
					<a href="#">IP Phone</a>
				</div>
				<div class="col-lg-3 col-lg-offset-1">
					<img src="http://image.noelshack.com/fichiers/2015/45/1446563469-server.png" class="img-rounded">
					<a href="#">Server</a>
				</div>
				<div class="col-lg-3 col-lg-offset-1">
					<img src="http://image.noelshack.com/fichiers/2015/45/1446563573-ip-phone.png" class="img-rounded">
					<a href="#">Video Conferencing</a>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-3 col-lg-offset-4">
					<img src="http://image.noelshack.com/fichiers/2015/45/1446563493-computer.png" class="img-rounded">
					<a href="#">Computer</a>
				</div>
			</div>
		</div>
	</body>
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.js"></script>	 
	<!-- Latest compiled JavaScript -->
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
</html>