<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Mvc WebFlow Demo</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div class="content">
		<div>
			<form:form modelAttribute="register2">
				<!--    called in register controller -->


				<%-- <div class="form-group">
					<form:label class="control-label col-sm-2" path="id">Register ID:</form:label>
					<div class="col-sm-10">
						<form:input type="number" path="id" class="form-control"
							required="true" placeholder="Enter Id" />
						<form:errors path="id" cssClass="error" />
					</div>
				</div> --%>


				<div class="form-group">
					<form:label class="control-label col-sm-2" path="yourname">Enter YourName:</form:label>
					<div class="col-sm-10">
						<form:input type="text" path="yourname" class="form-control"
							required="true" placeholder="Enter Name" />
						<c:forEach
							items="${flowRequestContext.messageContext.getMessagesBySource('yourname')}"
							var="err">
							<div>
								<span>${err.text}</span>
							</div>
						</c:forEach>
						<br />
					</div>
				</div>


				<div class="form-group">
					<form:label class="control-label col-sm-2" path="emailid">Enter Email ID:</form:label>
					<div class="col-sm-10">
						<form:input path="emailid" class="form-control" required="true"
							type="email" placeholder="Enter Mail Id" />
						<c:forEach
							items="${flowRequestContext.messageContext.getMessagesBySource('emailid')}"
							var="err">
							<div>
								<span>${err.text}</span>
							</div>
						</c:forEach>
						<br />
					</div>
				</div>


				<div class="form-group">
					<form:label class="control-label col-sm-2" path="mobilenumber">Enter Mobile Number</form:label>
					<div class="col-sm-10">
						<form:input type="number" path="mobilenumber" class="form-control"
							required="true" placeholder="Enter Mobile Number" />
						<c:forEach
							items="${flowRequestContext.messageContext.getMessagesBySource('mobilenumber')}"
							var="err">
							<div>
								<span>${err.text}</span>
							</div>
						</c:forEach>
						<br />
					</div>
				</div>

				<div class="form-group">
					<form:label class="control-label col-sm-2" path="enterpassword">Enter Password:</form:label>
					<div class="col-sm-10">
						<form:input type="password" path="enterpassword"
							class="form-control" required="true" placeholder="Enter Password" />
						<c:forEach
							items="${flowRequestContext.messageContext.getMessagesBySource('enterpassword')}"
							var="err">
							<div>
								<span>${err.text}</span>
							</div>
						</c:forEach>
						<br />
					</div>
				</div>

				<div class="form-group">
					<form:label class="control-label col-sm-2" path="confirmpassword">Confirm Password:</form:label>
					<div class="col-sm-10">
						<form:input type="password" path="confirmpassword"
							class="form-control" required="true"
							placeholder="Confirm Password" />
						<c:forEach
							items="${flowRequestContext.messageContext.getMessagesBySource('confirmpassword')}"
							var="err">
							<div>
								<span>${err.text}</span>
							</div>
						</c:forEach>
						<br />
					</div>
				</div>
				<br>
				<br>
				<br>

				

				<!-- <div class="form-group">
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
				</div> -->

				<input name="_eventId_edit" type="submit" value="Edit" />
				<input name="_eventId_submit" type="submit" value="Confirm Details" />
				<br />
			</form:form>
		</div>



	</div>
</body>
</html>