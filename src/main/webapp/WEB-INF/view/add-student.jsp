
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/add-student.css">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body >

	<div align="center"  >
		<h1>Add Student</h1>
		<!-- create a spring form where the user can enter data -->
		<form:form action="save-student" modelAttribute="student" method="POST">

			
			<form:hidden path="id" />


			<label>Name :</label>
			<form:input path="name" />

			<br>

			<label>Mobile :</label>
			<form:input path="mobile" />

			<br>

			<label>Country :</label>
			<form:input path="country" />

			<br>

			<input type="submit" value="submit" >

		</form:form>
	</div>
</body>
</html>