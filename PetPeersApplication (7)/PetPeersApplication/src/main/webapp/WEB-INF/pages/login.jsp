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
<title>Login Page</title>
</head>
<body>
    <div class="container">
        <br> <br>


        <nav class="navbar navbar-expand-sm bg-light">
        <h5 style="color: grey;">Pet Peers</h5>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item"><a class="nav-link " href="#"> Home </a></li>
            <li class="nav-item active"><a class="btn btn-primary" href="">
                    Login </a></li>
        </ul>
        </nav>


        <hr>


        <div class="card">
            <div class="card-header">Sign In</div>
            <div class="card-body">



                <form action="authenticate" method="post">


                    <div class="form-group row">
                        <label for="userName" class="col-sm-2 col-form-label">User
                            Name </label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" name="username"
                                placeholder="Enter User Name">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="password" class="col-sm-2 col-form-label">Password</label>
                        <div class="col-sm-7">
                            <input type="password" class="form-control" name="userPassword"
                                placeholder="Enter password">
                        </div>
                    </div>
                    <div class="text-left">
                        <button type="submit" class="btn btn-primary ">Sign In</button>
                        <button type="reset" class="btn btn-primary">Reset</button>
                    </div>
            </div>
            <div class="card-footer">
                <a href="${pageContext.request.contextPath}/user/registration">If not a member yet, Please Register</a>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>