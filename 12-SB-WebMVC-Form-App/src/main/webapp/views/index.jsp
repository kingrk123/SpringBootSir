<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>User Details</h3>

	<form action="saveUserNew" method="POST">
		<table>
			<tr>
				<td>User Id</td>
				<td><input type="text" name="uid" /></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td>Phno</td>
				<td><input type="text" name="uphn" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save User" /></td>
			</tr>
		</table>
	</form>

</body>
</html>