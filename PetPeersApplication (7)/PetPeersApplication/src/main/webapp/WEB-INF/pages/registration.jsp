<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
    crossorigin="anonymous">
<title>User Registration</title>
</head>
<body>
    <div class="container">
        <h1>User Registration</h1>

 

        <nav class="navbar navbar-expand-sm bg-light">
        <h5 style="color: grey;">Pet Peers</h5>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item"><a class="nav-link " href="Home"> Home </a></li>
            <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/user/login"> Login </a></li>
            <li class="nav-item active"><a class="btn btn-primary" href="#">
                    User Registration </a></li>
        </ul>
        </nav>
        <div class="card">
            <div class="card-header">User Registration</div>
            <div class="card-body">
                <form action="user/add" method="post">


                <div class="form-group row">
                    <label for="User Name" class="col-sm-2 col-form-label">User
                        Name</label>
                    <div class="col-sm-7">
                        <input type="text" class="form-control" name="username"
                            placeholder="Enter User Name">
                    </div>
                </div>

 

                <div class="form-group row">
                    <label for="Password" class="col-sm-2 col-form-label">Password
                    </label>
                    <div class="col-sm-7">
                        <input type="password" class="form-control" name="userPassword"
                            placeholder="Enter Password">
                    </div>
                </div>

 

                <div class=" form-group row">
                    <label for="Confirm Password" class="col-sm-2 col-form-label">Confirm
                        Password</label>
                    <div class="col-sm-7">
                        <input type="password" class="form-control" name="confirmPassword"
                            placeholder="Confirm Password">
                    </div>
                </div>

 

                <button type="submit" class="btn btn-primary">Submit</button>
      
           </form>     
            </div>
        </div>
    </div>

</body>
</html>