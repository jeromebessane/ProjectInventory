<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/base.css">
<link rel="stylesheet" href="css/addEquipment.css">
<head>
	<%@ include file="header.jsp"%>
</head>
<body>
	<div class="equipmentbox">
		<form method="post" action="AddEquipmentServlet" encType="multipart/form-data" name="equip_form">
			<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="titlePanel">Add equipment</h3>
			</div>	
				<div class="panel-body">
					<ul>
						<li>
							<label for="type">Type:</label>
							<input type="text" id="type" name="type" value="" >
						</li>
			
						<li>
							<label for="constructor">Constructor:</label>
							<input type="text" id="constructor" name="constructor" value="">
			 			</li>
			 		
			 			<li>
							<label for="model">Model:</label>
							<input type="text" id="model" name="model" value="">
			 			</li>
			 		
			 			<li>
							<label for="serial_number">Serial_Number:</label>
							<input type="text" id="serial_number" name="serial_number" value="">
			 			</li>
			 		
			 			<li>
							<label for="part_number">Part_Number:</label>
							<input type="text" id="part_number" name="part_number" value="">
						</li>
					
						<li>
							<label for="localisation">Localisation:</label>
							<input type="text" id="localisation" name="localisation" value="">
			 			</li>
			 		
			 			<li>
							<label for="supervisor">Supervisor:</label>
							<input type="text" id="supervisor" name="supervisor" value="">
			 			</li>
			 		
			 			<li>
							<label for="adress_ip">IP_Address:</label>
							<input type="text" id="adress_ip" name="adress_ip" value="">
			 			</li>
			 		
			 			<li>
							<label for="name">Name:</label>
							<input type="text" id="name" name="name" value="">
			 			</li>
			 		
			 			<li>
							<label for="licence">License:</label>
							<input type="text" id="licence" name="licence" value="">
			 			</li>
			 		
			 			<li>
							<label for="accessories">Accessories:</label>
							<input type="text" id="accessories" name="accessories" value="">
			 			</li>
			 		
			 			<li>
							<label for="condition">Condition:</label>
							<input type="text" id="condition" name="condition" value="">
			 			</li>
			 		
			 			<li>
							<label for="status">Status:</label>
							<input type="text" id="status" name="status" value="">
			 			</li>
			 		
			 			<li>
							<label for="proprietary" >Owner:</label>
							<select name="proprietary" id="proprietary">
								<option value="false"></option>
								<option value="true">Yes</option>
								<option value="false">No</option>
							</select>
						</li>
					</ul>					
					<label class="inputimage">
						<input type="file" id="image" name="image" value=""/>
					</label>
				</div>
				</div>
				<div class="footerbox">
            		<input type="submit" value="Add" class="btn btn-warning btm-sm" id="buttonAdd"/>
            	</div>          		
			</form>					
		</div>
</body>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script>
<script 
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script type="text/javascript"
        src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js"></script>	
<script src="<%=request.getContextPath()%>/javascript/auto.js"></script>  
</html>