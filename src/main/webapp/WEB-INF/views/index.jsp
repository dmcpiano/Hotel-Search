<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css" />
<meta charset="UTF-8">
<title>Hotels</title>
</head>
<body>
	<center><h1>Hotel Search</h1>
	<h2>City</h2>
	<form action="/results" method="GET">
	
					<select name="city">
							<option value="Dublin">Dublin</option>
							<option value="London">London</option>
							<option value="Detroit">Detroit</option>
							<option value="Las Vegas">Las Vegas</option>
							<option value="Paris">Paris</option>
					</select>
	<p><br/ ><button type="submit">Search</button></p>
	</form>
	
	
		<!--<input type="submit" value="Search" />>
		<!--<button type="submit">Search</button>>
		</center>

</body>
</html>