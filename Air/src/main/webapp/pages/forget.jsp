<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password</title>
</head>
<body>
<form action="validate_username" method="post">
	<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username"></td>
			</tr>
		</table>
	<input type="submit" value="Next">
	<input type="reset" value="Cancel">
	</form>
</body>
</html>