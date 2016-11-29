
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div style="color: teal; font-size: 30px">User Details</div>

	<c:if test="${!empty register2List}">
		<table border="1" bgcolor="black" width="600px">
			<tr style="background-color: teal; color: white; text-align: center;"
				height="40px">

				<td>id</td>
				<td>yourname</td>
				<td>emailid</td>
				<td>mobilenumber</td>
				<td>enterpassword</td>
				<td>confirmpassword</td>


			</tr>
			<c:forEach items="${register2List}" var="user">
				<tr
					style="background-color: white; color: black; text-align: center;"
					height="30px">

					<td><c:out value="${user.id}" /></td>
					<td><c:out value="${user.yourname}" /></td>
					<td><c:out value="${user.emailid}" /></td>
					<td><c:out value="${user.mobilenumber}" /></td>
					<td><c:out value="${user.enterpassword}" /></td>
					<td><c:out value="${user.confirmpassword}" /></td>
					<td><a href="editRegister2?id=${admin.id}">Edit</a></td>
					<td><a href="deleteRegister2?id=${admin.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>
