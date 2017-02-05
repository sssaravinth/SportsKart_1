
<%@include file="header.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<title>Cart Page</title>
</head>
<body>
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
										<th> </th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${cartList}" var="cart">
										<tr>
										<c:set var="total_cost"
												value="${total_cost + cart.totalPrice}" scope="page" />
												<c:choose>
													<c:when test="${total_cost >'0' }">
											<td class="col-sm-8 col-md-6">
												<div class="media">
													<a class="thumbnail pull-left"> <img
														class="media-object"
														src="<c:url value="resources/images/product/${cart.productid_fk.image}.jpg"/>"
														style="width: 72px; height: 72px;">
													</a>
													<div class="media-body">
														<h4 class="media-heading" style="color: black">${cart.productid_fk.productname}</h4>

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
											<td class="col-sm-1 col-md-1"><a
									href="remove?pdt3=${cart.cartItems_id}">
										<button type="button" class="btn btn-danger">
											<span class="glyphicon glyphicon-remove"></span> Remove
										</button>
								</a></td>

											</c:when>
											<c:otherwise>
											<hr><hr>
											<center><h1>YOUR CART IS EMPTY</h1></center>
											</c:otherwise>
											</c:choose>
										</tr>
									</c:forEach>
									<c:choose>
										<c:when test="${total_cost == '0' }">
											<center><h1>Your cart is empty</h1></center>
										</c:when>
									</c:choose>
									<c:choose>
										<c:when test="${total_cost > '0' }">
									<tr>
										<td> </td>
										<td> </td>
										<td> </td>
										<td><h3>Total</h3></td>

										<td class="text-right"><h3>
												<strong><i class="fa fa-inr" style="color: black"><fmt:formatNumber
															value="${total_cost}" type="currency"
															pattern="#,##,##,##,###.00" /></i></strong>
											</h3></td>
									</tr>
									<tr>
										<td> </td>
										<td> </td>
										<td> </td>
										<td><a href="<c:url value="/viewall"/>"><button
													type="button" class="btn btn-default">
													<span class="glyphicon glyphicon-shopping-cart"></span>
													Continue Shopping
												</button></a></td>

										<td><security:authorize access="hasRole('ROLE_USER')">
												<a href="<c:url value="/Shippment.obj"/>">
													<button type="button" class="btn btn-success">
														Checkout <span class="glyphicon glyphicon-play"></span>
													</button>
												</a>
											</security:authorize></td>
										</tr>
										</c:when></c:choose>
									</tbody>
								</table>
							
					</div>
			</div>
		</div>
	
</body>
</html>