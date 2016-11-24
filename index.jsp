<br>
<center>
	<h2 style="background: pink;">Online Shopping India - Fashion Wala
		INDIA</h2>
</center>
<br>
<%@include file="header.jsp"%>
<!-- adding internal style to carousel -->
<style>
h5, h3 {
	color: black;
}

body {
	background-image: url("resources/images/aaa.jpg");
}

.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 40%;
	height: 50%;
	margin: auto;
}
</style>
<body>
	Welcome ${info}

	<div class="container">
		<br>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>

			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="resources/images/pic6.jpg" alt="pic2" width="469"
						height="9500">
					<div class="carousel-caption">
						<h3>Rediscover a great shopping tradition</h3>
					</div>
				</div>

				<div class="item">
					<img src="resources/images/pic3.jpg" alt="pic3" width="660"
						height="645">
					<div class="carousel-caption">
						<h3>Shopping with style</h3>
					</div>

				</div>

				<div class="item">
					<img src="resources/images/kancheepu.jpg" alt="pic" width="9699"
						height="9450">
					<div class="carousel-caption">
						<h3>Rediscover a great shopping tradition</h3>
					</div>
				</div>
				<div class="item">
					<img src="resources/images/pic4.png" alt="pic3" width="460"
						height="445">
					<div class="carousel-caption">
						<h3>
							<div class="carousel-caption">
								<h3>A fresh approach to shopping</h3>
							</div>
					</div>
				</div>

			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<img src="resources/images/5.jpg" class="img-circle" height=200
			style="padding-left: 50px; padding-right: 50px;" /> <img
			src="resources/images/4.jpg" class="img-circle" height=200 width=300
			style="padding-left: 50px" /> <img src="resources/images/3.jpg"
			class="img-circle" height=200 width=300 style="padding-left: 50px" />
	</center>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<!-- adding product images and giving a link to it -->
	<center>
		<table>
			<tr>
				<td><a href="product1"> <img
						src="resources/images/pic8.jpg" class="img-circle" height="250"
						width="250"></img>
						<h5>True style never dies</h5></a></td>
				<td style="padding-right: 30px; padding-left: 80px;"><a
					href="product2"> <img src="resources/images/pic2.jpg"
						class="img-circle" height="250" width="250"></img>
						<h5>Bags Made By Hand and From The Heart</h5>

				</a></td>

				<td><a href="product3"> <img
						src="resources/images/pic10.jpg" class="img-circle" height="250"
						width="250"></img>


						<h5>The expression of pearls</h5></a></td>
			</tr>
		</table>
	</center>
	<br>
	<br>
	<%@include file="footer.jsp"%>