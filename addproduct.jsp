
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Add product</title>
<style>
body {
	background: url('resources/images/regis.jpg');
	background-size: cover; /* to stretch image*/
	background-repeat: no-repeat;
}

table {
	margin-left: 750px;
	font-weight: bold;
}

tr {
	font-size: 20px;
}

td {
	font-size: 25;
	padding: 15px;
}
</style>
</head>
<body>

	<form:form method="POST" action="addprod" commandName="product"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td><h2>Add Product</h2></td>
			</tr>
			<tr>
				<td colspan="2"><form:label path="prod_name">Product Name</form:label></td>
				<td><form:input path="prod_name" /></td>
			</tr>
			<tr>
				<td colspan="2"><form:label path="quantity">Quantity</form:label></td>
				<td><form:input path="quantity" /></td>
			</tr>
			<tr>
				<td colspan="2"><form:label path="prod_price">Price</form:label></td>
				<td><form:input path="prod_price" /></td>
			</tr>

			<tr>
				<td><form:label path="img">Select Image:</form:label></td>

				<td><form:input type="file" path="img" /></td>
			</tr>




			<tr>
				<td colspan="2" style="text-align: center;"><input
					type="submit" value="Submit" style="color: green; font-size: 20pt;" /></td>
				<td colspan="2"><input type="reset" value="Cancel"
					style="color: red; font-size: 20pt" /></td>

			</tr>
		</table>
	</form:form>
</body>
</html>
