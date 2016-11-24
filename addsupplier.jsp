<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Add Supplier</title>
</head>
<body>


	<form:form method="POST" action="addsup" commandName="supplier">
		<table style="width: 300px; height: 200px; text-align: center">
			<tr>

				<td><form:label path="supplier_name">Supplier-Name:</form:label></td>

				<td><form:input path="supplier_name" /></td>
			</tr>
			<tr>
				<td><form:label path="supplier_address">Supplier-Address:</form:label></td>

				<td><form:input path="supplier_address" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"
					style="color: blue; font-size: 20pt" /></td>
				<td><input type="reset" value="Cancle"
					style="color: red; font-size: 20pt" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>