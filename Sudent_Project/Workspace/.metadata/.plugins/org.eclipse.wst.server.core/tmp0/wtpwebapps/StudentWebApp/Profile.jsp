<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dto.Student"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>

	<jsp:include page="StdHomePage.jsp" />

	<center>
		<table border='2' align='center'>

			<tr>
				<th>stdId</th>
				<th>stdName</th>
				<th>Batch</th>
				<th>Gender</th>
				<th>Email-Id</th>
				<th>Password</th>
			</tr>

			<tr>
				<td>${ std.stdId }</td>
				<td>${ std.stdName }</td>
				<td>${ std.batch }</td>
				<td>${ std.gender }</td>
				<td>${ std.emailId }</td>
				<td>${ std.password }</td>
			</tr>

		</table>
	</center>
</body>
</html>