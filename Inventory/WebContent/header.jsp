<%@page import="org.orange.metier.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/header.css">
	<head>
		<title>SAS Inventory</title>
		<header><img src="<%=request.getContextPath()%>/images/logo_OBS_noir.png" alt=""></header>
		<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">SAS Inventory</a>
		    </div>
		    <div>
		      <ul class="nav navbar-nav">
		        <li class="active"><a href="<%=request.getContextPath()%>">Home</a></li>
		        <li><a href="<%=request.getContextPath()%>/equipments">Equipments</a></li>
		        	<% if(request.getSession().getAttribute("user") != null){ %>
	   					<li><a href="<%=request.getContextPath()%>/add-equipment">Add</a></li> 
			        	<li><a href="#">Licenses</a></li> 
					<% } %> 
		      </ul>
		      
		       <form class="navbar-form navbar-left" role="search" action="equipments" method="post">
		        <div class="form-group">
		          <input type="text" class="form-control" placeholder="Search" name="tag" value="${model.tag}">
		        </div>
		        <button type="submit" class="btn btn-default" value="Search">Search</button>
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
		                                             <div class="help-block text-right"><a href="<%=request.getContextPath()%>/forgot-password">Forgot the password ?</a></div>
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
										New here ? <a href="#">More informations</a>
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
										<a href="<%=request.getContextPath()%>/manage-login"><b>Manage login</b></a>
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
		<div class="message-error"><p>${message}</p></div>
	</head>  
	<body> 
	</body>

</html>