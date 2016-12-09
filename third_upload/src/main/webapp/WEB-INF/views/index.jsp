<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Online Shopping for Sports Product</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}

div.c-wrapper {
	width: 100%;
	margin: auto;
}

body {
	/* background-image: url("resources/images/logo.png"); */
	background-color: #cccccc;
}
</style>
</head>
<body>
<div class="content">
		<fieldset>
			<legend>Navigation menu</legend>

			<!-- here the href's value will be used to decide the 
					 controller to be executed on click of this link.
					 here "memberShip" is mapped in FlowController mapping-->
			<a href="memberShip.obj" style="margin: 50;">Become Member</a>
		</fieldset>
	</div>
	<div class="container">
		<br>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
				<li data-target="#myCarousel" data-slide-to="4"></li>
				<li data-target="#myCarousel" data-slide-to="5"></li>

			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="<c:url value='resources/images/bat1.jpg'/>" alt="Sports"
						class="img-responsive	" style="width: 4000px; height: 370px" />
					<div class="carousel-caption">
						<h2>
							<font color="red">Cricket</font>
						</h2>
						<h3>
							<p>
								<font color="red">Be like Schin Tendulkar</font>
							</p>
						</h3>
					</div>
				</div>
				<div class="item">
					<img src="<c:url value='resources/images/b.jpg'/>" alt="Sports"
						class="img-responsive" style="width: 4000px; height: 370px" />
					<div class="carousel-caption">
						<h2>
							<font color="red">BasketBall</font>
						</h2>
						<h3>
							<p>
								<font color="red">Be like Michael Jordan </font>
							</p>
						</h3>
					</div>
				</div>

				<div class="item">
					<img src="<c:url value='resources/images/c.jpg'/>" alt="Sports"
						class="img-responsive" style="width: 4000px; height: 370px" />
					<div class="carousel-caption">
						<h2>
							<font color="red">VolleyBallBall</font>
						</h2>
						<h3>
							<p>
								<font color="red">Be like Brazillian Players </font>
							</p>
						</h3>
					</div>
				</div>

				<div class="item">
					<img src="<c:url value='resources/images/d.jpg'/>" alt="Sports"
						class="img-responsive" style="width: 4000px; height: 370px" />
					<div class="carousel-caption">
						<h2>
							<font color="red">FootBall</font>
						</h2>
						<h3>
							<p>
								<font color="red">Be like Cristiano Ronaldo </font>
							</p>
						</h3>
					</div>


				</div>
				<div class="item">
					<img src="<c:url value='/resources/images/e.jpg'/>" alt="Sports"
						class="img-responsive" style="width: 4000px; height: 370px" />
					<div class="carousel-caption">
						<h2>
							<font color="red">Badmintor</font>
						</h2>
						<h3>
							<p>
								<font color="red">Be like PV Sindhu </font>
							</p>
						</h3>
					</div>
				</div>
				<div class="item">
					<img src="<c:url value='/resources/images/f.jpg'/>" alt="Sports"
						class="img-responsive" style="width: 4000px; height: 370px" />
					<div class="carousel-caption">
						<h2>
							<font color="red">Hockey</font>
						</h2>
						<h3>
							<p>
								<font color="red">Be like Dhanraj Pillay </font>
							</p>
						</h3>
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

	<div class="container-fluid">

		<center>
			<h1>OutDoor Sports</h1>
		</center>
		<div class="row">
			<div class="col-xs-6 col-sm-4" style="background-color: white;">
				<a href="#"><img src="<c:url value='/resources/images/d.jpg'/>"
					alt="football" class="img-responsive"
					style="width: 4000px; height: 370px" /></a>
			</div>
			<div class="col-xs-6 col-sm-4" style="background-color: white;">
				<img src="<c:url value='/resources/images/a.jpg'/>" alt="cricket"
					class="img-responsive" alt="Chania"
					style="width: 4000px; height: 370px" />
			</div>
			<!-- Add clearfix for only the required viewport -->

			<div class="col-xs-6 col-sm-4" style="background-color: white;">
				<img src="<c:url value='/resources/images/f.jpg'/>" alt="hockey"
					class="img-responsive" alt="Chania"
					style="width: 4000px; height: 370px" />
			</div>

		</div>

	</div>

	<div class="container-fluid">

		<center>
			<h1>InDoor Sports</h1>
		</center>
		<div class="row">
			<div class="col-xs-6 col-sm-4" style="background-color: white;">
				<a href="#"><img src="<c:url value='/resources/images/b.jpg'/>"
					alt="basketball" class="img-responsive"
					style="width: 4000px; height: 370px" /></a>
			</div>
			<div class="col-xs-6 col-sm-4" style="background-color: white;">
				<a href="VolleyBall"><img
					src="<c:url value='/resources/images/c.jpg'/>" alt="volleyball"
					class="img-responsive" alt="Chania"
					style="width: 4000px; height: 370px" />
			</div>
			<!-- Add clearfix for only the required viewport -->

			<div class="col-xs-6 col-sm-4" style="background-color: white;">
				<a href="Badmintor"><img
					src="<c:url value='/resources/images/e.jpg'/>" alt="badmintor"
					class="img-responsive" alt="Chania"
					style="width: 4000px; height: 370px" />
			</div>

		</div>

	</div>
	
	<%-- <img src="${pageContext.request.contextPath}/resources/images/product/Cricket Bat.jpg"/> --%>

	<center>
		<iframe width="854" height="480"
			src="https://www.youtube.com/embed/EP7izIhmV5c" frameborder="0"
			allowfullscreen></iframe>
	</center>
	
</body>

</html>
<%@include file="footer.jsp"%>
