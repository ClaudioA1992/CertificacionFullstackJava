<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
	crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.23/datatables.min.css" />

<script type="text/javascript"
	src="https://cdn.datatables.net/v/bs4/jq-3.3.1/dt-1.10.23/datatables.min.js"></script>

<meta charset="ISO-8859-1">
<title>Products monitor</title>

<script>
	$(document).ready(function() {
		$('#miTabla').DataTable();
	});
</script>

</head>

<body>

	<h3>Products monitor</h3>

	<form action = "searchMonitor" method = "post">

		<select name="warehouse">
			<c:forEach items="${warehouses}" var="wr">
				<option value="${wr.getWarehouseName()}">${wr.getWarehouseName()}</option>
			</c:forEach>
		</select> 
		<select name="category">
			<c:forEach items="${pcs}" var="pcs">
				<option value="${pcs.getCategoryName()}">${pcs.getCategoryName()}</option>
			</c:forEach>
		</select> <input type="submit" value="Search">

	</form>
<!--  
	<table id="miTabla" class="table">

		<tr>
			<th>Product id</th>
			<th>Product name</th>
			<th>Description</th>
			<th>Standard cost</th>
			<th>List price</th>
			<th>Category</th>
			<!--  
			<th>Warehouse ID</th>
			<th>Warehouse city</th>
			<th>Quantity in warehouse</th>

		</tr>

		<c:forEach items="${products}" var="pr">

			<tr>
				<td>${pr.getProductId()}</td>
				<td>${pr.getProductName()}</td>
				<td>${pr.getDescription()}</td>
				<td>${pr.getStandardCost()}</td>
				<td>${pr.getListPrice()}</td>
				<td>${pr.getProductCategory().getCategoryName()}</td>

			</tr>

			
			
			<c:forEach items="${pr.getInventories()}" var="pc">



				  <tr>

					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td>${pc.getWarehouse().getWarehouseId()}</td>
					<td>${pc.getWarehouse().getLocation().getCity()}</td>
					<td>${pc.getQuantity()}</td>
				</tr>

			</c:forEach>



		</c:forEach>


	</table> -->






</body>

</html>