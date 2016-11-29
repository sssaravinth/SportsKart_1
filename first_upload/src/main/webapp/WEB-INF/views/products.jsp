<%@include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Add Products Page</title>
<style>
body {
	background-image: url("resources/images/sports.jpg");
	background-color: #cccccc;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Product Details</h2>

		<div>
			<form:form action="product" method="POST" commandName="product"
				enctype="multipart/form-data">

				<div class="form-group">
					<form:label class="control-label col-sm-2" path="productid">Product ID:</form:label>
					<div class="col-sm-10">
						<form:input path="productid" class="form-control" required="true"
							placeholder="Product Id" />
						<form:errors path="productid" cssClass="error" />
					</div>
				</div>


				<div class="form-group">
					<form:label class="control-label col-sm-2" path="productname">Enter Product Name:</form:label>
					<div class="col-sm-10">
						<form:input type="text" path="productname" class="form-control"
							required="true" placeholder="Enter Product Name" />
						<form:errors path="productname" cssClass="error" />
					</div>
				</div>


				<div class="form-group">
					<form:label class="control-label col-sm-2" path="productquantity">Enter Product Qty:</form:label>
					<div class="col-sm-10">
						<form:input path="productquantity" class="form-control"
							required="true" placeholder="Enter Product Qty" />
						<form:errors path="productquantity" cssClass="error" />
					</div>
				</div>
				
				<div class="form-group">
					<form:label class="control-label col-sm-2" path="price">Enter Product Price:</form:label>
					<div class="col-sm-10">
						<form:input path="price" class="form-control"
							required="true" placeholder="Enter  Price" />
						<form:errors path="price" cssClass="error" />
					</div>
				</div>


				<div class="form-group">
					<form:label class="control-label col-sm-2"
						path="productdescription">Product Description :</form:label>
					<div class="col-sm-10">
						<form:input path="productdescription" class="form-control"
							required="true" placeholder="Product Description" />
						<form:errors path="productdescription" cssClass="error" />
					</div>
				</div>
				File to upload: <input type="file" name="file">
				<div class="form-group">
					<form:label class="control-label col-sm-2" path="image"> Image Name:</form:label>
					<div class="col-sm-10">
						<form:input path="image" class="form-control" required="true"
							placeholder=" Image Nmae" />
						<form:errors path="image" cssClass="error" />
					</div>
				</div>





				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-default" name="action"
							value="Add" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default" name="action"
							value="Edit">Edit</button>
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default" name="action"
							value="Delete">Delete</button>
					</div>
				</div>

				<%-- 
					File to upload: <input type="file" name="file">
					 Name: <form:input type="text" path="image"/> --%>
				<%-- name="name" --%>
			</form:form>

		</div>
	</div>
</body>
</html>