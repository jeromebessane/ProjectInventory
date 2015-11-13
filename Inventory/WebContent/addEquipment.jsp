<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">
<link rel="stylesheet" href="css/addEquipment.css">	
<head>
	<%@ include file="header.jsp"%>
    <head>
    	<link type="text/css" rel="stylesheet" href=".css" />
	</head>
<body>
<div class="equipmentbox">
<div class="panel panel-default">
<div class="panel-body">
	<form method="post" action="AddEquipmentServlet">
			<label for="type">Type:</label>
			<input type="text" id="type" name="type" value="">
			<br />
			
			<label for="constructor">Constructor:</label>
			<input type="text" id="constructor" name="constructor" value="">
			<br />
			 
			<label for="model">Model:</label>
			<input type="text" id="model" name="model" value="">
			<br />
			 
			<label for="serial_number">Serial_Number:</label>
			<input type="text" id="serial_number" name="serial_number" value="">
			<br />
			 
			<label for="part_number">Part_Number:</label>
			<input type="text" id="part_number" name="part_number" value="">
			<br />
			
			<label for="localisation">Localisation:</label>
			<input type="text" id="localisation" name="localisation" value="">
			<br />
			 
			<label for="supervisor">Supervisor:</label>
			<input type="text" id="supervisor" name="supervisor" value="">
			<br />
			 
			<label for="adress_ip">Adress_Ip:</label>
			<input type="text" id="adress_ip" name="adress_ip" value="">
			<br />
			 
			<label for="name">Name:</label>
			<input type="text" id="name" name="name" value="">
			<br />
			 
			<label for="licence">License:</label>
			<input type="text" id="licence" name="licence" value="">
			<br />
			 
			<label for="accessories">Accessories:</label>
			<input type="text" id="accessories" name="accessories" value="">
			<br />
			 
			<label for="condition">Condition:</label>
			<input type="text" id="condition" name="condition" value="">
			<br />
			 
			<label for="status">Status:</label>
			<input type="text" id="status" name="status" value="">
			<br />
			 
			<label for="proprietary">Proprietary:</label>
			<select name="proprietary" id="proprietary">
				<option value="true">Yes</option>
				<option value="false">No</option>
			</select>
			<br />

            <input type="submit" value="Add" class="btn btn-warning btm-sm"/>
			<br />
	</form>
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