
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Home page</title>

<!-- adding predefined links of bootstrap -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- adding internal style to carousel -->
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 40%;
	height: 10%;
	margin: auto;
}
</style>
<body>
	<h4>Welcome Admin</h4>
	<!-- adding menu bar(nav bar) -->
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="home">Fashion Spot</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a href="home">Home</a></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="addproduct">Products <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="addproduct">Add</a></li>
						<li><a href="#">Update</a></li>
						<li><a href="deleteproduct">Delete</a></li>
						<li><a href="adminviewproducts">View All</a></li>

					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="addcategory">Category <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="addcategory">Add</a></li>
						<li><a href="#">Update</a></li>
						<li><a href="#">Delete</a></li>
						<li><a href="#">View All</a></li>

					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="addsupplier">Suppliers <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="addsupplier">Add</a></li>
						<li><a href="#">Update</a></li>
						<li><a href="#">Delete</a></li>
						<li><a href="#">View All</a></li>

					</ul></li>


			</ul>


			<ul class="nav navbar-nav navbar-right">
				<li><a href="logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<div class="container">
</body>
</html>