
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>addcategory</title>
</head>
<body>


	<form:form method="POST" action="addcat" commandName="category">
		<table style="width: 300px; height: 200px; text-align: center">
			<tr>

				<td><form:label path="cat_name">Category-Name:</form:label></td>

				<td><form:input path="cat_name" /></td>
			</tr>
			<tr>
				<td><form:label path="description">Description:</form:label></td>

				<td><form:input path="description" /></td>
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