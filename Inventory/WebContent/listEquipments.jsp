<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">
<head>
	<%@ include file="header.jsp" %>
</head>
<body>
	<div class="table-responsive"> 
		<table class="table table-hover">
			<thead>
				<tr>
					<th>id</th><th>Type</th><th>Constructor</th><th>Model</th>
				</tr>
			</thead>
			<c:forEach items="${model.listEquips}" var="equip">
			<tr>
				<td>${equip.idEquipment}</td>
				<td>${equip.typeEquipment}</td>
				<td>${equip.constructorEquipment}</td>
				<td>${equip.modelEquipment}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.js"></script>	 
	<!-- Latest compiled JavaScript -->
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
</html>