<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="<c:url value="/resources/jquery/jquery-3.1.1.min.js" />"></script>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<title>Online Shopping</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="index">SportsKart <img src="<c:url value='resources/images/logo.png'/>" style="width:85px;height:30px;"/></a>
		</div>
		<div>
			<a class="navbar-brand" href="index">Home</a>
		</div>
		<ul class="nav navbar-nav">
			<!-- <li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Catergory <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="volleyball">VolleyBall</a></li>
					<li><a href="#">Cricket</a></li>
					<li><a href="#">Badmintor</a></li>
				</ul></li> -->

			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Category <span class="caret"></span></a>
				<ul class="dropdown-menu">

					<c:forEach items="${categoryList}" var="admin">
						<li> <a href="${admin.categoryname}"><c:out
									value="${admin.categoryname}" /> </a>
						</li>

					</c:forEach>
				</ul></li>

		</ul>
		<ul class="nav navbar-nav">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Admin <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="products">Add Products</a></li>
					<li><a href="category">Add Category</a></li>
					<li><a href="#">Track</a></li>
				</ul></li>
		</ul>
		<div class="col-sm-5">
			<input type="search" class="form-control" name="search"
				placeholder="Search for Product">

		</div>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="register"><span
					class="glyphicon glyphicon-user"></span>Register</a></li>
			<li><a href="login"><span class="glyphicon glyphicon-log-in"></span>
					Login</a></li>
			<li><a href="#"><span
					class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li>
		</ul>
	</div>
	</nav>


</body>
</html>