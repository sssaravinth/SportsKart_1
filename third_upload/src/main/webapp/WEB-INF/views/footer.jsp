<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SportKart</title>
<style>
.div1 {
	width: 1520px;
	height: 340px;
	border: 2px solid black;
	box-sizing: border-box;
}
</style>
</head>
<body>

	<footer>
	<div class="div1">

		<div class="container">
			<div class="row">
				<div class="col-3 column">
					 <h4>Follow Us</h4> 
					<ul class="nav">
						<li><a class="active" style="color: white"
							href="https://twitter.com/login"><b><img
									src="<c:url value='/resources/images/twitter.jpg'/>" alt="test"
									class="img-responsive" alt="Chania"
									style="width: 30px; height: 30px" />Twitter</b></a></li>
						<li><a class="active" style="color: white"
							href="https://www.facebook.com/login/"><b><img
									src="<c:url value='/resources/images/facebook.png'/>"
									alt="test" class="img-responsive" alt="Chania"
									style="width: 30px; height: 30px" />Facebook</b></a></li>
						<li><a class="active" style="color: white"
							href=https://plus.google.com/collections/featured><b><img
									src="<c:url value='/resources/images/google+.png'/>" alt="test"
									class="img-responsive" alt="Chania"
									style="width: 30px; height: 30px" />Google+</b></a></li>

					</ul>
				</div>
				<!-- <div class="col-3 column">
					<h4>Contact Us</h4>
					<ul class="nav">
						<p>Email Id :</p>
						<p>Phone Number :</p>

					</ul>
				</div> -->

			</div>
			<h2>
				<p class="text-right">©2016SportsKart</p>
			</h2>
		</div>
	</div>

	</footer>
</body>
</html>