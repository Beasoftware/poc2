<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>email</th>
			<th>mobileno</th>
			<th>Designation</th>
			<th>Salary</th>
			<th>DOB</th>
			<th>JoiningDate</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.mobileno}</td>
				<td>${user.designation}</td>
				<td>${user.salary}</td>
				<td>${emp.dob}</td>
				<td>${emp.joiningdate}</td>
				<td><a href="edituser/${user.id}">Edit</a></td>
				<td><a href="deleteuser/${user.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="userform">Add New User</a>
</body>
</html>