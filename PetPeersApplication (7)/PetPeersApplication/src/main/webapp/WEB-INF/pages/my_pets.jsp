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
<title>My Pets Page</title>
</head>
<body>

	<div class="container">
		<br> <br>
		<h4 style="text-align: center">My Pets</h4>
		<nav class="navbar navbar-expand-sm bg-light">
		<h5 style="color: grey;">Pet Peers</h5>
		<ul class="navbar-nav ml-auto">
			<li class="nav-item "><a class="nav-link "
				href="/PetPeersApplication/pet_home.jsp#"> Home </a></li>
			<li class="nav-item"><a class="nav-link"
				href="/PetPeersApplication/my_pets.jsp"> My Pets </a></li>
			<li class="nav-item active"><a class="nav-link"
				href="/PetPeersApplication/pet_form.jsp"> Add Pet </a></li>
			<li class="nav-item"><a class="nav-link"
				href="/PetPeersApplication/login.jsp"> Logout </a></li>
		</ul>
		</nav>
		<hr>
		<form action="mypets" method="get" modelAttribute="user">
			<div class="card">
				<div class="card-header">Pet List</div>
				<div class="card-body">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">Id</th>
								<th scope="col">Pet Name</th>
								<th scope="col">Place</th>
								<th scope="col">Age</th>
							</tr>
						</thead>
						<tbody>

						</tbody>
						<c:forEach items="${key}" var="element">
							<tr>
								<td>${element.id}</td>
								<td>${element.name}</td>
								<td>${element.place}</td>
								<td>${element.age}</td>
								<td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
