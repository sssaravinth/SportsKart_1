
<%@include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style>
body {
	background-image: url("resources/bg1.jpg");
	background-color: #cccccc;
}
</style>
<title>Login Page</title>
</head>
<body>

	<div class="container">
		<h2>Customer LogIn</h2>

		<form class="form-horizontal" method="post"
			action="<c:url value='/login' />">
			<div style="color: red">${message}</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="username">Username:</label>
				<div class="col-sm-10">
					<input type="username" class="form-control" id="username"
						name="username" placeholder="Enter Username">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pwd"
						name="password" placeholder="Enter password">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<div class="checkbox">
						<label><input type="checkbox"> Remember me</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="SignIn" class="btn btn-default">Login</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
