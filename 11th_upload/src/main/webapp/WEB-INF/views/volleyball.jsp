<%@include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.div1 {
	width: 350px;
	height: 380px;
	border: 2px solid black;
	box-sizing: border-box;
}
</style>

<title>VolleyBall Page</title>
</head>
<body>
	<div class="container">
		<h1>VolleyBall</h1>

		<br>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
				<li data-target="#myCarousel" data-slide-to="4"></li>

			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="<c:url value='resources/images/volleyball/v1.jpg'/>"
						alt="volleyball" class="img-responsive	"
						style="width: 4000px; height: 370px" />
					<div class="carousel-caption">
						<h2>
							<font color="red">Volleyball</font>
						</h2>
						<h3>
							<p>
								<font color="red">This is Arm Sleeve</font>
							</p>
						</h3>
					</div>
				</div>
				<div class="item">
					<img src="<c:url value='resources/images/volleyball/v2.jpg'/>"
						alt="volleyball" class="img-responsive"
						style="width: 4000px; height: 370px" />
				</div>

				<div class="item">
					<img src="<c:url value='resources/images/volleyball/v3.jpg'/>"
						alt="volleyball" class="img-responsive"
						style="width: 4000px; height: 370px" />
				</div>

				<div class="item">
					<img src="<c:url value='resources/images/volleyball/v4.jpg'/>"
						alt="volleyball" class="img-responsive"
						style="width: 4000px; height: 370px" />
				</div>
				<div class="item">
					<img src="<c:url value='resources/images/volleyball/v5.jpg'/>"
						alt="volleyball" class="img-responsive"
						style="width: 4000px; height: 370px" />
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
	<c:if test="${!empty productList}">

		<div class="container">
			<div class="row">
				<h2>Products</h2>

				<div class="row text-center">
					<c:forEach items="${productList}" var="admin">
						<div class="col-md-4">

							<a href="#"><div class="div1">
									<img src="<c:url value='resources/images/product/${admin.image}.jpg'/>"
										
										alt="volleyball" class="img-responsive"
										style="width: 4000px; height: 370px" />
								</div></a> <br>
							<button type="button" class="btn btn-default">View
								Details</button>
							<!-- <button type="button" class="btn btn-default">Add to
								Cart</button>

							<button type="button" class="btn btn-default">Buy Now</button> -->
							<h2>&#x20B9 ${admin.price}</h2>
							<h3>${admin.productname}</h3>
							<%-- <h3>${admin.productdescription}</h3> --%>
						</div>
					</c:forEach>
				</div>

			</div>

		</div>

	</c:if>
</body>
</body>
</html>