<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/base.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/manageLogin.css">
<head>
	<%@ include file="header.jsp" %>
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="manage">Manage login</h3>
		</div>
		<div class="panel-body">
			<h5 class="welcome"><b>WELCOME</b> <b><i class="login">${user.login}</i></b></h5>
				
				<ul>
					<li class="listData"><b>E-mail:</b> ${user.email}</li>
					<br />
					
					<li class="listData"><b>First name:</b> ${user.firstName}</li>
					<br />
					
					<li class="listData"><b>Last name:</b> ${user.lastName}</li>
					<br />
				</ul>
				
		</div>
	</div>
</body>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.js"></script>	 
<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
</html>