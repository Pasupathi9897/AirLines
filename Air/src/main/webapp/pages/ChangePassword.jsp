<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ChangePassword</title>
</head>
<body>
<form action="confirm_password" method="post">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" value="${username}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>Re-Enter Password</td>
				<td><input type="text" name="cpassword"></td>
			</tr>
		</table>
		<input type="submit" value="Next"> <input type="reset"
			value="Cancel">
	</form>

</body>
</html>