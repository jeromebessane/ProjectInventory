<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/base.css">
	<link rel="stylesheet" href="css/forgotPassword.css">
<head>
	<%@ include file="header.jsp" %>
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-heading">
			<h2 class="title">Forgot Password</h2>
		</div>
		<div class="panel-body">
			<form method="post" action="ForgotPasswordServlet" autocomplete="off">
				<p>If you forgot your password enter your current e-mail to receive a new password !</p>
				<label for="email">Enter your e-mail:</label>
				<input type="text" name="email" id="email">
		</div>
		<div class="panel-footer">
			<input type="submit" value="Submit" class="btn btn-warning btm-sm" id="button"/>
			</form>
		</div>
	</div>
</body>

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.js"></script>
	<!-- Latest compiled JavaScript -->
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
</html>