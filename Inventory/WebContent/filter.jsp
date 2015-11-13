<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="css/filter.css">
<head>
</head>
<body>
	<form role="filter" action="equipments" method="post">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseOne"><span
						class="glyphicon glyphicon-folder-close"> </span> Constructor</a>
				</h4>
			</div>
			<div id="collapseOne" class="panel-collapse collapse in">
			
				<ul class="list-group">
					<li class="list-group-item">
						<c:forEach items="${model.listFilter.get(0)}" var="filter">
							<div class="checkbox">
								<label><input type="checkbox" name="constructor" value="${filter}" onclick="this.form.submit();"
									<c:forEach items="${model.listFilterConstructorUsed}" var="filterUsed"><c:if test="${filterUsed.equals(filter)}">checked</c:if></c:forEach>
								>${filter}</label>
							</div>
						</c:forEach>						
					</li>
				</ul>
			</div>
		</div>

		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseTwo"><span
						class="glyphicon glyphicon-folder-close"> </span> Type</a>
				</h4>
			</div>
			<div id="collapseTwo" class="panel-collapse collapse in">
				<ul class="list-group">
					<li class="list-group-item">
						<c:forEach items="${model.listFilter.get(1)}" var="filter">
							<div class="checkbox">
								<label><input type="checkbox" name="type" value="${filter}" onclick="this.form.submit();"
									<c:forEach items="${model.listFilterTypeUsed}" var="filterUsed"><c:if test="${filterUsed.equals(filter)}">checked</c:if></c:forEach>
								>${filter}</label>
							</div>
						</c:forEach>
					</li>
				</ul>
			</div>
		</div>
		
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseThree"><span
						class="glyphicon glyphicon-folder-close"> </span> Status</a>
				</h4>
			</div>
			<div id="collapseThree" class="panel-collapse collapse in">
				<ul class="list-group">
					<li class="list-group-item">
						<c:forEach items="${model.listFilter.get(2)}" var="filter">
							<div class="checkbox">
								<label><input type="checkbox" name="status" value="${filter}" onclick="this.form.submit();"
									<c:forEach items="${model.listFilterStatusUsed}" var="filterUsed"><c:if test="${filterUsed.equals(filter)}">checked</c:if></c:forEach>
								>${filter}</label>
							</div>
						</c:forEach>					
					</li>
				</ul>
			</div>
		</div>

		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseFour"><span
						class="glyphicon glyphicon-folder-close"> </span> Localisation</a>
				</h4>
			</div>
			<div id="collapseFour" class="panel-collapse collapse in">
				<ul class="list-group">
					<li class="list-group-item">
						<c:forEach items="${model.listFilter.get(3)}" var="filter">
							<div class="checkbox">
								<label><input type="checkbox" name="localisation" value="${filter}" onclick="this.form.submit();"
									<c:forEach items="${model.listFilterLocalisationUsed}" var="filterUsed"><c:if test="${filterUsed.equals(filter)}">checked</c:if></c:forEach>
								>${filter}</label>
							</div>
						</c:forEach>
					</li>
				</ul>
			</div>
		</div>
	</form>
</body>
</html>
