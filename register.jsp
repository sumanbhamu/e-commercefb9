<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Registration</title>
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

	<form:form method="POST" action="addus" commandName="user">
		<table>
			<tr>
				<td><h2>Create An Account</h2></td>
			</tr>
			<tr>
				<td colspan="2"><form:label path="username">User Name</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td colspan="2"><form:label path="password">Password</form:label></td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><form:label path="confirmpassword">Confirm Password</form:label></td>
				<td><form:input path="confirmpassword" /></td>
			</tr>

			<tr>
				<td colspan="2"><form:label path="emailid">Email Id</form:label></td>
				<td><form:input path="emailid" /></td>
			</tr>

			<tr>
				<td colspan="2"><form:label path="phno">Phone Number</form:label></td>
				<td><form:input path="phno" /></td>
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