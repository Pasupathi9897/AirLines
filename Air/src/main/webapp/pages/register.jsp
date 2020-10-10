<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form action="registration" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
				 <select name="gender" id="gender">
						<option value="gender">---select gender---</option>
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="Others">Others</option>
				</select></td>
			</tr>
			<tr>
				<td>Dob</td>
				<td><input type="text" name="dob">
				</td>
			</tr>
			<tr>
				<td>Moblie</td>
				<td><input type="text" name="mobile">
				</td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address">
				</td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password">
				</td>
			</tr>
			<tr>
				<td>Security Question</td>
				<td>
				 <select name="question" id="question">
						<option value="question">---select question---</option>
						<option value="In which city were you born?">In which city were you born?</option>
						<option value="In which state were you born?">In which state were you born?</option>
						<option value="who was your childhood hero?">who was your childhood hero?</option>
						<option value="what was your nick name?">what was your nick name?</option>
						<option value="what was your favorite place?">what was your favorite place?</option>
						<option value="what was your favorite city">what was your favorite city?</option>
						<option value="what was your favorite country">what was your favorite country?</option>
						<option value="what was your favorite number">what was your favorite number?</option>
						<option value="what was your old password?">what was your old password?</option>
				</select></td>
			</tr>
			<tr>
				<td>Answer</td>
				<td><input type="text" name="answer">
				</td>
			</tr>
		</table>
		<input type="submit" value="register"> <input type="reset"
			value="clear">

	</form>
</body>
</html>