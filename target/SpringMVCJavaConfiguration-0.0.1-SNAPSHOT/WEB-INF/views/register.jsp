<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>Register here</h1>

	<form action="/SpringMVCJavaConfiguration/success.html" method="post">
		<table>
			<tr>
				<td>Your Name : <input type="text" name="personName"  />
				</td>
			</tr>
			<tr>
				<td>Your Email ID : <input type="text" name="personEmailId" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>
</body>
</html>