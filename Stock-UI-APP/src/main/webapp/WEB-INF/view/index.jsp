<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h2>Get stock price</h2>
<h3> ${msg}</h3>
	<form action="/getTotalCost" method="get">
		<table>
			<tr>
				<td>CompanyName</td>
				<td><input type="text" name="companyName"></td>
			</tr>
			
			<tr>
				<td>Quantity</td>
				<td><input type="text" name="quantity"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" name="Get Cost"></td>
			</tr>
		</table>
	</form>

</body>
</html>