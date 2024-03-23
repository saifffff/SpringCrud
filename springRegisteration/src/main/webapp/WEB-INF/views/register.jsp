<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Home</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

	<!--     navbar -->
<nav class="navbar navbar-expand-lg bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Learn2Code</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="register">Login / Register</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<!-- navbar finish -->

    <div class="container">

		<h3 class="text-center">Register New User</h3>
		
		<form  action="submitForm" method="post"  >
		
		<div class="mb-3">
		  <label for="userid" class="form-label">Username</label>
		  <input type="text" class="form-control" name="userid" required>
		</div>
		
		  <div class="mb-3">
		    <label for="fullName" class="form-label">Name</label>
		    <input type="text" class="form-control" name="fullName" >
		  </div>
		  
		  
		  <div class="mb-3">
		    <label for="email" class="form-label">Email</label>
		    <input type="email" class="form-control" name="userEmail">
		  </div>
		  
		  <div class="mb-3">
		    <label for="passWord" class="form-label">Password</label>
		    <input type="password" class="form-control" name="passWord">
		  </div>
		  
		  <div class="mb-3">
		    <label for="dateOfBirth" class="form-label">Date of Birth</label>
		    <input type="date" class="form-control" name="dateOfBirth" required>
		  </div>
		  
		  <div class="mb-3">
		    <label for="coursestick" class="form-label">Select Courses (choose multiple)</label>
		    <br>
		    <div class="form-check form-check-inline">
		      <input class="form-check-input" type="checkbox" name="coursestick" id="courseJava" value="java">
		      <label class="form-check-label" for="courseJava">Java</label>
		    </div>
		    <div class="form-check form-check-inline">
		      <input class="form-check-input" type="checkbox" name="coursestick" id="coursePython" value="python">
		      <label class="form-check-label" for="coursePython">Python</label>
		    </div>
		    <div class="form-check form-check-inline">
		      <input class="form-check-input" type="checkbox" name="coursestick" id="courseCpp" value="c++">
		      <label class="form-check-label" for="courseCpp">C++</label>
		    </div>
		    <div class="form-check form-check-inline">
		      <input class="form-check-input" type="checkbox" name="coursestick" id="courseJavascript" value="javascript">
		      <label class="form-check-label" for="courseJavascript">Javascript</label>
		    </div>
		    <div class="form-check form-check-inline">
		      <input class="form-check-input" type="checkbox" name="coursestick" id="courseDataScience" value="data science">
		      <label class="form-check-label" for="courseDataScience">Data Science</label>
		    </div>
		  </div>
		  
		  
		   <div class="btn-group" role="group" aria-label="Basic radio toggle button group">
		   
			  <input type="radio" class="btn-check" name="gender" id="btnradio1" value="male" autocomplete="off" >
			  <label class="btn btn-outline-primary" for="btnradio1">Male</label>
			
			  <input type="radio" class="btn-check" name="gender" id="btnradio2" value="female" autocomplete="off">
			  <label class="btn btn-outline-primary" for="btnradio2">Female</label>
			  
			  <input type="radio" class="btn-check" name="gender" id="btnradio3" value="trans" autocomplete="off">
			  <label class="btn btn-outline-primary" for="btnradio3">Non-Binary</label>
			  
			</div>
			
			<br/>
			<br/>
			
			<c:if test="${not empty result.allErrors}">
		    <ul style="color: red;">
			      <c:forEach var="error" items="${result.allErrors}">
			        	<li>${error.defaultMessage}</li>
			      </c:forEach>
		    </ul>
			</c:if>
			
			
			
		 	<div class="container text-center">
		 		 <button type="submit" class="btn btn-primary">Register</button>
		 	</div>
		</form>
        
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVFQWjxhGqHJX2xrEKfwv+buEmzsjEY9svONmD9fEuRaevlLzyV/s" crossorigin="anonymous"></script>
</body>
</html>