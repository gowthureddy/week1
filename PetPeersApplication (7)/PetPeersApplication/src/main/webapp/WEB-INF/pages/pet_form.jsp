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
<title>Add a Pet Page</title>
</head>
<body>
    <div class="container">
    <br>
    <br>
   <nav class="navbar navbar-expand-sm bg-light"> 
        <h5 style="color:grey;">Pet Peers</h5>
        <ul class="navbar-nav ml-auto"> 
            <li class="nav-item" > 
                <a class="btn btn-primary" href="/PetPeersApplication/pet_home.jsp"> 
                  Home
                </a> 
            </li> 
           
            <li class="nav-item active"> 
                <a class="nav-link" href=""> 
                  Add Pet
                </a> 
            </li> 
            <li class="nav-item"> 
                <a class="nav-link" href="${pageContext.request.contextPath}/user/logout"> 
                  Logout
                </a> 
            </li> 
        </ul> 
    </nav> 
        <div class="card">
           <div class="card-header">Pet Information</div>
            <div class="card-body">
            
                          
                  <form action="pet/add">

 

                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label">Name</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" name="name"
                                placeholder="Enter Pet Name">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="age" class="col-sm-2 col-form-label">Age</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" name="age"
                                placeholder="Enter Pet Age">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="place" class="col-sm-2 col-form-label">Place</label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control" name="place"
                                placeholder="Enter Place">
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">Save</button>
              
               <button type="reset" class="btn btn-primary">Cancel</button>
               </form>
            </div>
            
        </div>
    </div>
</body>
</html>