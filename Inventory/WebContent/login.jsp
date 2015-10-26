<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">
	 
	<head>
		<%@ include file="header.jsp" %>		
	</head>
	
	<body>
		<h3>Formulaire de connexion</h3>
	    
		<div>
		   <form action="LoginServlet" method="post">
		      login : <input type="text" name="login" />
		      password : <input type="password" name="password" />
		      <input type="submit" value="connexion" />
		   </form>
		</div>
	</body>
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.js"></script>	 
	<!-- Latest compiled JavaScript -->
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
</html>