<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body class="myFonts">

<div class="container">
		<h1 align="center">Student Management</h1>
	
		<form action="/student-management/showAddStudentPage">
		<input type="submit" value="ADD" class="btn btn-outline-success">
		</form>
		
		<br>
		
		<table border="1" class="table table-striped">
			<thead>
				<tr>
					<td>id</td>
					<td>name</td>
					<td>mobile</td>
					<td>country</td>
				</tr>
			</thead>


			<c:forEach var="student" items="${students }">
				<tr>
					<td>${student.id }</td>
					<td>${student.name }</td>
					<td>${student.mobile }</td>
					<td>${student.country }</td>
					<td><button class="btn btn-primary"><a id="z" href="/student-management/updateStudent?userId=${student.id }">info</a></button></td>
					<td><button class="btn btn-primary"><a id="z" href="/student-management/updateStudent?userId=${student.id }">Update</a></button></td>
					<td><button class="btn btn-danger"><a id="z" href="/student-management/deleteStudent?userId=${student.id }" onclick="if(!(confirm('Are you sure you want to delete')))return false">Delete</a></button></td>
					
				</tr>
			</c:forEach>
		</table>
		
		<img alt="fake students photo" src="/student-management/URLToReachImagesFolder/student.jpg">

	</div>

</body>
</html>