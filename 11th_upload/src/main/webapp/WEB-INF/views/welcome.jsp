 <%@include file="header.jsp"%> 


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Mvc WebFlow Demo</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<style>
body {
	background-image: url("resources/d2.gif");
	
}
</style>
</head>
<body>
	<div class="content">
		<fieldset>
			<legend>Welcome</legend>
			<!-- here the href's value will be used to decide the 
					 controller to be executed on click of this link.
					 here "home" is mapped in spring mvc controller-->
			<!-- <a href="index">Home</a> <br /> -->
			<br />
			<h2>
				<!-- display the userId just entered -->
				Welcome ${register2.yourname }
				<p>Enjoy Your Shopping with us</p>
			</h2>
			<br />
		</fieldset>
	</div>
	
	
</body>
</html>