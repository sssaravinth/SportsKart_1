<%@include file="header.jsp"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title></title>
  <style>
  .card-container.card {
	max-width: 350px;
	padding: 40px 40px;
}
.profile-name-card {
	font-size: 16px;
	font-weight: bold;
	text-align: center;
	margin: 10px 0 0;
	min-height: 1em;
}
  </style>
</head>
<body>
 
<div class="container">	<div class="card card-container">
<p id="profile-name" class="profile-name-card"></p>
      <div class="well well-sm">
 <center><b> <h2>PAYMENT</h2><hr></b></center>
 <b> <p>Please Select the Payment Method</p></b>
  <form>
    <label class="radio-inline">
      <input type="radio" name="optradio">Debit card & Online Banking
    </label>
    <br>
    <label class="radio-inline">
      <input type="radio" name="optradio">Credit cards
    </label>
    <br>
    <label class="radio-inline">
      <input type="radio" name="optradio">Cash On Delivery or COD
    </label>
    <br>
     <label class="radio-inline">
      <input type="radio" name="optradio">Prepaid Cash Cards
    </label>
   <br>
     <label class="radio-inline">
      <input type="radio" name="optradio">Pay Through DD or Demand Draft
    </label>
   <br>
   
      <label class="radio-inline">
      <input type="radio" name="optradio">Mobile Payment
    </label>
   <br>
   
   </form>
   <div>
			<form:form modelAttribute="shippment">
				
				<div class="form-group" >
					<div class="col-sm-10">
						<form:hidden  path="name" class="form-control"
							 />
						<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('name')}"
					var="err">
					<div>
						<span style="color:red">${err.text}</span>
					</div>
				</c:forEach>
				<br />
					</div>
				</div>


				<div class="form-group">
					<div class="col-sm-10">
						<form:hidden path="address" class="form-control" 
							 />
						<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('address')}"
					var="err">
					<div>
						<span style="color:red">${err.text}</span>
					</div>
				</c:forEach>
				<br />
					</div>
				</div>


				<div class="form-group">
					<div class="col-sm-10">
						<form:hidden  path="city" class="form-control" 
							  />
						<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('city')}"
					var="err">
					<div>
						<span style="color:red">${err.text}</span>
					</div>
				</c:forEach>
				<br />
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-10">
						<form:hidden path="state"
							class="form-control"  />
						<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('state')}"
					var="err">
					<div>
						<span style="color:red">${err.text}</span>
					</div>
				</c:forEach>
				<br />
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-10">
						<form:hidden path="pincode"
							class="form-control" 
							 />
						<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('pincode')}"
					var="err">
					<div>
						<span style="color:red">${err.text}</span>
					</div>
				</c:forEach>
				<br />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-10">
						<form:hidden  path="mobilenumber"
							class="form-control" 
							 />
						<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('mobilenumber')}"
					var="err">
					<div>
						<span style="color:red">${err.text}</span>
					</div>
				</c:forEach>
				<br />
					</div>
				</div>
				<br>
				<br>
				<br>

		
				 <center>
				<input name="_eventId_submit" type="submit"  class="btn btn-success" value="Confirm Details" /></center>
			</form:form>
		</div>
	</div>
   
   
 <%-- <a href="<c:url value="welcome1"/>"><button type="button" class="btn btn-success">Submit</button></a>  --%>
<!-- <input name="_eventId_submit" type="submit" value="Payment" class="btn btn-success" />
<input name="_eventId_submit" type="submit" value="Confirm Details" /> -->
 </div>
</div>
</div>

</body>

</html>
<%@include file="footer.jsp"%>