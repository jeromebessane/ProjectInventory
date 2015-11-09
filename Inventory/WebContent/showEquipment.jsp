<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/showEquipment.css">
<head>
	<%@ include file="header.jsp"%>
</head>

<body>
  	<div class="equipmentbox">
  		<div class="panel panel-default">
  			<div class="panel-body">
  				<h5>Type: ${modelShowEquip.equipment.typeEquipment}</h5>
				<h5>Constructor : ${modelShowEquip.equipment.constructorEquipment}</h5>
				<h5>Model : ${modelShowEquip.equipment.modelEquipment}</h5>
				<h5>Serial Number : ${modelShowEquip.equipment.snEquipment}</h5> 
				<h5>Part Number : ${modelShowEquip.equipment.pnEquipment}</h5>
				<h5>Localisation : ${modelShowEquip.equipment.localisationEquipment}</h5> 
				<h5>Supervisor : ${modelShowEquip.equipment.supervisorEquipment}</h5>
				<h5>Adress Ip : ${modelShowEquip.equipment.adressIpEquipment}</h5>
				<h5>Name : ${modelShowEquip.equipment.nameEquipment}</h5>
				<h5>License : ${modelShowEquip.equipment.licenseEquipment}</h5>  
				<h5>Accessories : ${modelShowEquip.equipment.accessoriesEquipment}</h5>		
  			</div>
		</div>
	  	<div class="panel panel-default">
	  		<div class="panel-body">
	  			<h5>State : ${modelShowEquip.equipment.stateEquipment}</h5>
				<h5>Status : ${modelShowEquip.equipment.statusEquipment}</h5>
				<h5>Proprietary : ${modelShowEquip.equipment.proprietaryEquipment}</h5>
				<h5>Date : ${modelShowEquip.equipment.dateEquipment}</h5>
	  		</div>
		</div>				
		<div class="footerbox">
        	<div class="pull-right">
            	<a href="#" class="btn btn-warning btm-sm" role="button">Edit <span class="glyphicon glyphicon-cog"></span></a>
            	<a href="#" class="btn btn-success btm-sm" role="button">Loan <span class="glyphicon glyphicon-ok"></span></a>
            </div>
            <div class="pricetext">
               	<a href="<%=request.getContextPath()%>/equipments" class="btn btn-warning btm-sm" role="button"><span class="glyphicon glyphicon-chevron-left"></span>Return</a>
            </div>     
    	</div>
	</div>
</body>

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
</html>