<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View inventories by warehouse</title>
</head>
<body>

	<h1>View inventories by warehouse</h1>

	<table>

		<tr>

			<th>Warehouse id</th>
			<th>Warehouse name</th>
			<th>Quantity in inventory</th>
			<th>Product Name</th>
			<th>Standard product cost</th>

		</tr>

		<c:forEach items="${warehouses}" var="wa">

			<tr>
				<td>${wa.getWarehouseId()}</td>
				<td>${wa.getWarehouseName()}</td>

			</tr>

			<c:forEach items="${wa.getInventories()}" var="in">

				<tr>
					<td></td>
					<td></td>
					<td>${in.getQuantity()}</td>
					<td>${in.getProduct().getProductName()}</td>
					<td>${in.getProduct().getStandardCost()}</td>

				</tr>

			</c:forEach>

			<!--
			
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

			</c:forEach>-->



		</c:forEach>


	</table>

</body>
</html>