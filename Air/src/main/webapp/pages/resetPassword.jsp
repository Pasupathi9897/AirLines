<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Security Question</title>
</head>
<body>
	<form action="validate_question" method="post">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="username" value="${username}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Security Question</td>
				<td><input type="text" name="question" value="${question}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Answer</td>
				<td><input type="text" name="answer"></td>
			</tr>
		</table>
		<input type="submit" value="Next"> <input type="reset"
			value="Cancel">
	</form>

</body>
</html>