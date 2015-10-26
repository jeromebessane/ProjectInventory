<%@page import="org.orange.web.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" type="text/css" href="css/header.css">
	<head>
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">SAS Equipment</a>
		    </div>
		    <div>
		      <ul class="nav navbar-nav">
		        <li class="active"><a href="<%=request.getContextPath()%>">Home</a></li>
		        <li><a href="#">Page 1</a></li>
		        <li><a href="#">Page 2</a></li> 
		        <li><a href="#">Page 3</a></li> 
		      </ul>
		      
		       <form class="navbar-form navbar-left" role="search">
		        <div class="form-group">
		          <input type="text" class="form-control" placeholder="Search">
		        </div>
		        <button type="submit" class="btn btn-default">Search</button>
		      </form>
		      
      		<% if(request.getSession().getAttribute("user") == null){ %>
		      <ul class="nav navbar-nav navbar-right">
		        <li><p class="navbar-text">Already have an account?</p></li>
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Login</b> <span class="caret"></span></a>
					<ul id="login-dp" class="dropdown-menu">
						<li>
							 <div class="row">
									<div class="col-md-12">
										Login :
										 <form class="form" method="post" action="LoginServlet" accept-charset="UTF-8" id="login-nav">
												<div class="form-group">
													 <label class="sr-only">Email address</label>
													 <input type="text" name="login" class="form-control" placeholder="Email address" required>
												</div>
												<div class="form-group">
													 <label class="sr-only">Password</label>
													 <input type="password" name="password" class="form-control" placeholder="Password" required>
		                                             <div class="help-block text-right"><a href="">Forget the password ?</a></div>
												</div>
												<div class="form-group">
													 <button type="submit" class="btn btn-primary btn-block" value="connexion">Sign in</button>
												</div>
												<div class="checkbox">
													 <label>
													 <input type="checkbox"> keep me logged-in
													 </label>
												</div>
										 </form>
									</div>
									<div class="bottom text-center">
										New here ? <a href="#"><b>Join Us</b></a>
									</div>
							 </div>
						</li>
					</ul>
		        </li>
		      </ul>		      
		     <% } else { 
		     	User currentUser = (User) request.getSession().getAttribute("user");%>
		     	<ul class="nav navbar-nav navbar-right">
		        <li><p class="navbar-text">Welcome</p></li>
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b><%=currentUser.getLogin()%></b> <span class="caret"></span></a>
					<ul id="login-dp" class="dropdown-menu">
						<li>
							 <div class="row">
									<div class="col-md-12">
										 <form class="form" method="get" action="LogoutServlet" accept-charset="UTF-8" id="login-nav">											
												<div class="form-group">
													 <button type="submit" class="btn btn-primary btn-block" value="deconnexion">Sign out</button>
												</div>
										 </form>
									</div>
									<div class="bottom text-center">
										<a href="#"><b>Change password ?</b></a>
									</div>
							 </div>
						</li>
					</ul>
		        </li>
		      </ul>	
		     <%  } %>
		      
		    </div>
		  </div>
		</nav>
	</head>  
	<body> 
	</body>

</html>