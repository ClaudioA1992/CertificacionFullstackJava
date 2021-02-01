<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Products view</title>
</head>

<body>

	<table>

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
			<th>Quantity in warehouse</th>-->

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