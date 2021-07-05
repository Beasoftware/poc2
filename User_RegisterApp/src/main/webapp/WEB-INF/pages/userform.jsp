<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add New User</h1>
	<form:form method="post">
		<table>
			<tr>
				<td>userid :</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>mobileno :</td>
				<td><form:input path="mobileno" /></td>
			</tr>
			<tr>
				<td>Designation :</td>
				<td><form:input path="designation" /></td>
			</tr>
			<tr>
				<td>salary :</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td>DOB :</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td>JoiningDate :</td>
				<td><form:input path="joiningdate" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>