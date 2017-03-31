<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Mvc WebFlow Demo</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div class="content">
		<!-- <fieldset>
			<legend>Become Member</legend> -->
			<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
			<a href="index">Home</a>
			<sf:form modelAttribute="register2">
				<br />
				<sf:label path="yourname">Enter YourName:</sf:label>
				<sf:input path="yourname" />
				<br />
				<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('yourname')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="emailid">Email Id: </sf:label>
				<sf:input path="emailid" />
				<br />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('emailid')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="mobilenumber">Mobile Number: </sf:label>
				<sf:input path="mobilenumber" />
				<br />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('age')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
				<input name="_eventId_submit" type="submit" value="Submit" />
				<br />
			</sf:form>
	<!-- 	</fieldset> -->
	</div>
</body>
</html>