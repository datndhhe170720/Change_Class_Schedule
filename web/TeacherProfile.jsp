<%-- 
    Document   : TeacherProfile
    Created on : Mar 16, 2023, 4:06:50 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	padding: 0;
	background-color: #f3f3f3;
	font-family: Arial, sans-serif;
}

.container {
	margin: 0 auto;
	max-width: 800px;
	background-color: #fff;
	padding: 40px;
	border-radius: 10px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}

h1 {
	color: #ff8c00;
	margin-top: 0;
}

hr {
	border: none;
	height: 1px;
	background-color: #ccc;
	margin-bottom: 30px;
}

.info {
	display: flex;
	flex-wrap: wrap;
}

.row {
	width: 50%;
	display: flex;
	align-items: center;
	margin-bottom: 20px;
}

.label {
	flex-basis: 30%;
	color: #333;
	font-weight: bold;
	margin: 0;
}

.value {
	flex-basis: 70%;
	color: #666;
	font-size: 18px;
	line-height: 28px;
	margin: 0;
}

        </style>
    </head>
    <body>
        <div class="container">
		<h1>TEACHER USER PROFILE</h1>
		<hr>
		<div class="info">
			<div class="row">
				<p class="label">Teacher ID:</p>
				<p class="value">${t.getId()}</p>
			</div>
			<div class="row">
				<p class="label">Teacher Name:</p>
				<p class="value">${t.getName()}</p>
			</div>
			<div class="row">
				<p class="label">Teacher Email: </p>
				<p class="value">${t.getEmail()}</p>
			</div>
			<div class="row">
				<p class="label">Gender:</p>
				<p class="value">${t.getGender()}</p>
			</div>
			<div class="row">
				<p class="label">Address:</p>
				<p class="value">${t.getAddress()}</p>
			</div>
		</div>
	</div>
    </body>
</html>
