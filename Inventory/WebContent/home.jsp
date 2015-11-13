<%@page import="org.orange.metier.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/base.css">
	<link rel="stylesheet" href="css/home.css">
	<head>
		<%@ include file="header.jsp" %>		
	</head>
	
	<body>
		<div class="container">
			<div class="row" id="displayType">
				<c:forEach items="${modelHome.listTypes}" var="type">
					<c:choose>
						<c:when test="${type.equals('Router')}">
							<div class="col-lg-3 col-lg-offset-1">
								<a href="#"><img src="http://image.noelshack.com/fichiers/2015/45/1446563442-router.png" class="img-rounded"></a>	
								<a href="#">Router</a>
							</div>
						</c:when>
						<c:when test="${type.equals('Switch')}">
							<div class="col-lg-3 col-lg-offset-1">
								<a href="#"><img src="http://image.noelshack.com/fichiers/2015/45/1446562194-switch.png" class="img-rounded"></a>
								<a href="#">Switch</a>
							</div>
						</c:when>
						<c:when test="${type.equals('Firewall')}">
							<div class="col-lg-3 col-lg-offset-1">
								<a href="#"><img src="http://image.noelshack.com/fichiers/2015/45/1446563448-firewall.png" class="img-rounded"></a>
								<a href="#">Firewall</a>
							</div>
						</c:when>
						<c:when test="${type.equals('Telephone IP')}">
							<div class="col-lg-3 col-lg-offset-1">
								<a href="#"><img src="http://image.noelshack.com/fichiers/2015/45/1446563457-visio-conferencing.png" class="img-rounded"></a>
								<a href="#">IP Phone</a>
							</div>
						</c:when>
						<c:when test="${type.equals('Server')}">
							<div class="col-lg-3 col-lg-offset-1">						
								<a href="#"><img src="http://image.noelshack.com/fichiers/2015/45/1446563469-server.png" class="img-rounded"></a>
								<a href="#">Server</a>
							</div>
						</c:when>
						<c:when test="${type.equals('Video Conferencing')}">
							<div class="col-lg-3 col-lg-offset-1">
								<a href="#"><img src="http://image.noelshack.com/fichiers/2015/45/1446563573-ip-phone.png" class="img-rounded"></a>
								<a href="#">Video Conferencing</a>
							</div>
						</c:when>
						<c:when test="${type.equals('Computer')}">
							<div class="col-lg-3 col-lg-offset-1">
								<a href="#"><img src="http://image.noelshack.com/fichiers/2015/45/1446563493-computer.png" class="img-rounded"></a>
								<a href="#">Computer</a>
							</div>
						</c:when>
						<c:otherwise>
							<div class="col-lg-3 col-lg-offset-1">
								<a href="#"><img src="http://image.noelshack.com/fichiers/2015/45/1446823660-c-hosting.gif" class="img-rounded"></a>
								<a href="#">${type}</a>
							</div>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>
		</div>
		<h3 id="titleLastEquip">The Last five equipments</h3>
		<div class="col-sm-12 col-md-12">
			<div class="table-responsive">
				<form action="equipments/show" method="post">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>id</th>
								<th>Type</th>
								<th>Constructor</th>
								<th>Model</th>
							</tr>
						</thead>
						<c:forEach items="${modelHome.listEquips}" var="equip">
							<tr>
								<td>${equip.idEquipment}</td>
								<td>${equip.typeEquipment}</td>
								<td>${equip.constructorEquipment}</td>
								<td>${equip.modelEquipment}</td>
								<td><button class="btn btn-warning btn-sm" type="submit" name="equip" value="${equip.idEquipment}">More</button></td>
							</tr>
						</c:forEach>
					</table>
				</form>
			</div>
		</div>
	</body>
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.js"></script>	 
	<!-- Latest compiled JavaScript -->
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
</html>