<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Pet Home</title>
</head>
<body>
	<div class="container">
		<h2>Pet(Home) Page</h2>
		<nav class="navbar navbar-expand-sm bg-light">
		<h5 style="color: grey;">Pet Peers</h5>
		<ul class="navbar-nav ml-auto">
			<li class="nav-item"><a class="btn btn-primary " href="">
					Home </a></li>

			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/pets"> My Pets </a></li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/add"> Add Pet </a></li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/user/logout"> Logout </a></li>
		</ul>
		</nav>
		<div class="card">
			<div class="card-header">Pet List</div>
			<div class="card-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>#</th>
							<th>Pet Name</th>
							<th>Place</th>
							<th>Age</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<c:forEach items="${Petkey}" var="temp">
								<tr>
									<td>${temp.name}</td>
									<td>${temp.place}</td>
									<td>${temp.age}</td>

								</tr>
							</c:forEach>
					</tbody>
				</table>
			</div>
</body>
</html>