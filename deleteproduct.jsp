<!-- jstl -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body>
<h2>Hello admin</h2>

	<form:form method="POST" action="addprod" commandName="product">
		<table>
			<tr>
				<td>Product Id</td>
				<td><form:input path="prod_id" /></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><form:input path="prod_name" /></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><form:input path="quantity" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><form:input path="prod_price" /></td>
			</tr>

			<tr>
				<td><form:label path="img">Select Image:</form:label></td>

				<td><form:input type="file" path="img" /></td>
			</tr>




			<tr>
				<td colspan=2><input type="submit" value="Submit" style="color: green; font-size: 20pt;" /></td>
				<td><input type="reset" value="Cancel"	style="color: red; font-size: 20pt" /></td>

			</tr>
		</table>
	</form:form>
</body>