
<%@include file="header.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart Page</title>
</head>
<body>

	<%-- <div style="color: teal; font-size: 30px">Cart Details</div>

	<c:if test="${!empty cartList}">
		<table border="1" bgcolor="black" width="600px">
			<tr style="background-color: teal; color: white; text-align: center;"
				height="40px">

				<td>cartItems_id</td>
				<td>quantity</td>
				<td>totalPrice</td>

			</tr>
			<c:forEach items="${cartList}" var="cat">
				<tr
					style="background-color: white; color: black; text-align: center;"
					height="30px">

					<td><c:out value="${cat.cartItems_id}" /></td>
					<td><c:out value="${cat.quantity}" /></td>
					<td><c:out value="${cat.totalPrice}" /></td>
				</tr>
			</c:forEach>
		</table>
	</c:if> --%>

	  <c:set var="total_cost" value="0" scope="page" />
	<div class="container">
		<div class="row">
			<div class="col-sm-12 col-md-10 col-md-offset-1">

				<table class="table ">
					<thead>
						<tr>
							<th>Product</th>
							<th>Quantity</th>
							<th class="text-center">Price</th>
							<th class="text-center">Total</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${cartList}" var="cart">
							<tr>

								<td class="col-sm-8 col-md-6">
									<div class="media">
										<a class="thumbnail pull-left"> <img class="media-object"
											src="<c:url value="resources/images/product/${cart.productid_fk.image}.jpg"/>"
											style="width: 72px; height: 72px;">
										</a>
										<div class="media-body">
											<h4 class="media-heading" style="color: white">${cart.productid_fk.productname}</h4>

										</div>
									</div>
								</td>

								<td class="col-sm-1 col-md-1 text-center"><strong><fmt:formatNumber
											value="${cart.quantity}" /></strong></td>
								<td class="col-sm-1 col-md-1 text-center"><strong><fmt:formatNumber
											value="${cart.productid_fk.price}" type="currency"
											pattern="#,##,##,##,###.00" /></strong></td>
								<td class="col-sm-1 col-md-1 text-center"><strong><fmt:formatNumber
											value="${cart.totalPrice}" type="currency"
											pattern="#,##,##,##,###.00" /></strong></td>
								<td class="col-sm-1 col-md-1"><a href="remove?pdt3=${cart.cartItems_id}">
										<button type="button" class="btn btn-danger">
											<span class="glyphicon glyphicon-remove"></span> Remove
										</button>
								</a></td>



							</tr>
						</c:forEach>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td><h3>Total</h3></td>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td><a href="<c:url value="/viewall"/>"><button
										type="button" class="btn btn-default">
										<span class="glyphicon glyphicon-shopping-cart"></span>
										Continue Shopping
									</button></a></td>

							<td><sec:authorize access="hasRole('ROLE_USER')">
									<a href="<c:url value="/checkout.obj"/>">
										<button type="button" class="btn btn-success">
											Checkout <span class="glyphicon glyphicon-play"></span>
										</button>
									</a>
								</sec:authorize></td>
						</tr>

					</tbody>
				</table>

			</div>
		</div>
	</div> 
</body>
</html>