 <%@include file="header.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<c:url value="/resources/jquery/jquery-3.1.1.min.js" />"></script>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Badmintor Page</title>

</head>
<body>

	<div class="container">
		<h1>Badmintor</h1>

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
					<img src="<c:url value='resources/images/badmintor/c1.jpg'/>"
						alt="Badmintor" class="img-responsive	"
						style="width: 4000px; height: 370px" />
					<div class="carousel-caption">
						<h2>
							<font color="red">Badmintor</font>
						</h2>
						<h3>
							<p>
								<font color="red">This is Racket</font>
							</p>
						</h3>
					</div>
				</div>
				<div class="item">
					<img src="<c:url value='resources/images/badmintor/c2.jpg'/>"
						alt="Badmintor" class="img-responsive"
						style="width: 4000px; height: 370px" />
				</div>

				<div class="item">
					<img src="<c:url value='resources/images/badmintor/c3.jpg'/>"
						alt="Badmintor" class="img-responsive"
						style="width: 4000px; height: 370px" />
				</div>

				<div class="item">
					<img src="<c:url value='resources/images/badmintor/c4.jpg'/>"
						alt="Badmintor" class="img-responsive"
						style="width: 4000px; height: 370px" />
				</div>
				<div class="item">
					<img src="<c:url value='resources/images/badmintor/c5.jpg'/>"
						alt="Badmintor" class="img-responsive"
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
									<img
										src="<c:url value='resources/images/product/${admin.image}.jpg'/>"
										alt="volleyball" class="img-responsive"
										style="width: 4000px; height: 370px" />
								</div></a> <br>
							<button type="button" class="btn btn-default">View
								Details</button>
							<button type="button" class="btn btn-default">Add to
								Cart</button>

							<button type="button" class="btn btn-default">Buy Now</button>
							<h2>&#x20B9 ${admin.price}</h2>
							<h3>${admin.productdescription}</h3>
							</div>
					</c:forEach>
					</div>

				</div>

			</div>
		
	</c:if>
</body>
</html> 