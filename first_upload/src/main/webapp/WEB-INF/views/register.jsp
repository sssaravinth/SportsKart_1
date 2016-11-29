
<%@include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Register Page</title>
<style>
body {
	background-image: url("resources/images/sports.jpg");
	background-color: #cccccc;
}
</style>
</head>
<body>

	<div class="container">
		<h2>New Customer</h2>

		<div>
			<form:form action="register2" method="POST" commandName="register2">
                    <!--    called in register controller -->


				<div class="form-group">
					<form:label class="control-label col-sm-2" path="id">Register ID:</form:label>
					<div class="col-sm-10">
						<form:input type="number" path="id" class="form-control"
							required="true" placeholder="Enter Id" />
						<form:errors path="id" cssClass="error" />
					</div>
				</div>


				<div class="form-group">
					<form:label class="control-label col-sm-2" path="yourname">Enter YourName:</form:label>
					<div class="col-sm-10">
						<form:input type="text" path="yourname" class="form-control"
							required="true" placeholder="Enter Name" />
						<form:errors path="yourname" cssClass="error" />
					</div>
				</div>


				<div class="form-group">
					<form:label class="control-label col-sm-2" path="emailid">Enter Email ID:</form:label>
					<div class="col-sm-10">
						<form:input path="emailid" class="form-control" required="true"
							type="email" placeholder="Enter Mail Id" />
						<form:errors path="emailid" cssClass="error" />
					</div>
				</div>


				<div class="form-group">
					<form:label class="control-label col-sm-2" path="mobilenumber">Enter Mobile Number</form:label>
					<div class="col-sm-10">
						<form:input type="number" path="mobilenumber" class="form-control"
							required="true" placeholder="Enter Mobile Number" />
						<%-- <form:errors path="mobilenumber" cssClass="error" /> --%>
					</div>
				</div>

				<div class="form-group">
					<form:label class="control-label col-sm-2" path="enterpassword">Enter Password:</form:label>
					<div class="col-sm-10">
						<form:input type="password" path="enterpassword"
							class="form-control" required="true" placeholder="Enter Password" />
						<form:errors path="enterpassword" cssClass="error" />
					</div>
				</div>

				<div class="form-group">
					<form:label class="control-label col-sm-2" path="confirmpassword">Confirm Password:</form:label>
					<div class="col-sm-10">
						<form:input type="password" path="confirmpassword"
							class="form-control" required="true"
							placeholder="Confirm Password" />
						<form:errors path="confirmpassword" cssClass="error" />
					</div>
				</div>


				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-default" name="action"
							value="Register" /> 					<!-- action name called on switch case -->
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-default" name="action"
							value="Edit" /> 
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-default" name="action"
							value="Delete" /> 
					</div>
				</div>


			</form:form>
		</div>
	</div>


</body>
</html>
