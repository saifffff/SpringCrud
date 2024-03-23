<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All users</title>
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

        <header class="py-3">
            <h1 class="display-4">Registered Successfully</h1>
           
        </header>

        <main>
            <h1>List of All Users</h1>
			<h3>Users</h3>
					<ul>
					  <c:forEach var="user" items="${allUsers}">
					    <li>
					      ${user}}
					    </li>
					  </c:forEach>
					</ul>
			            <img src="https://media.geeksforgeeks.org/wp-content/uploads/20230508202141/Spring-MVC-Tutorial.webp" alt="Welcome Image" class="img-rounded img-responsive mx-auto d-block" style="width: 50%;">
        </main>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVFQWjxhGqHJX2xrEKfwv+buEmzsjEY9svONmD9fEuRaevlLzyV/s" crossorigin="anonymous"></script>
</body>
</html>