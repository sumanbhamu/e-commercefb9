<%@include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Login</title>
<style>
h1 {
	font-family: Curlz MT;
	font-size: 50px;
}

td {
	padding-left: 130px;
}
</style>

</head>
<body background="resources/images/1.jpg">
	<%-- ${info}
	 --%><h1>Login to Fashion Spot</h1>

	<form action="validate" method="get">
		<table>
			<tr style="color: green; font-size: 20pt">
				<td>Email-id:</td>
				<td><input type="email" name="ema1" placeholder="abc@gmail.com" /></td>
			</tr>
			<tr style="color: green; font-size: 20pt">
				<td>Password:</td>
				<td><input type="password" name="psd" /><br></td>
			</tr>
			<tr>
				<td><input type="submit" value="Sign-in"
					style="color: blue; font-size: 20pt" /></td>
				<td><input type="reset" value="Cancle"
					style="color: red; font-size: 20pt" /></td>
			</tr>
		</table>
	</form>

</body>
</html>