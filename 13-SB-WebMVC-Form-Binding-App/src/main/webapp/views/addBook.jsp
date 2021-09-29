<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Save Book Here</h2>

	<form:form action="saveBook" method="POST" modelAttribute="book">
		<table>
			<tr>
				<td>Book ID :</td>
				<td><form:input path="bookId" /></td>
			</tr>

			<tr>
				<td>Book Name :</td>
				<td><form:input path="bookName" /></td>
			</tr>

			<tr>
				<td>Book Price :</td>
				<td><form:input path="bookPrice" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Save Book" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>