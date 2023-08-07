<%-- 
    Document   : Login
    Created on : Mar 7, 2023, 11:50:46 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            /* Reset CSS */
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background-color: #f0f0f0;
	font-family: Arial, sans-serif;
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

.login-container {
	display: flex;
	flex-direction: column;
	background-color: #fff;
	border-radius: 10px;
	padding: 30px;
	box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
}

.title {
	text-align: center;
	margin-bottom: 20px;
	color: #ff8c00;
	font-size: 26px;
	font-weight: bold;
}

form {
	display: flex;
	flex-direction: column;
}

.input-container {
	display: flex;
	flex-direction: column;
	margin-bottom: 15px;
}

label {
	color: #666;
	margin-bottom: 5px;
	font-size: 16px;
	font-weight: bold;
}

input[type="text"],
input[type="password"] {
	padding: 10px;
	border-radius: 5px;
	border: none;
	outline: none;
	font-size: 16px;
	box-shadow: inset 0 2px 3px rgba(0, 0, 0, 0.1);
}

.button {
	padding: 15px;
	background-color: #ff8c00;
	border: none;
	border-radius: 5px;
	color: #fff;
	font-size: 16px;
	font-weight: bold;
	cursor: pointer;
	box-shadow: 0 2px 3px rgba(0, 0, 0, 0.1);
	transition: background-color 0.3s ease-in-out;
}

.button:hover {
	background-color: #ffa500;
}

        </style>
    </head>
    <body>
<!--        <form action="login" method="post" style="margin:auto">
            <table>
                <tr>
                    <td>Account:</td>
                    <td><input type="text" name="account">${AccEr}<br></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password">${PassEr}<br></td>
                </tr>
                <tr>

                    <td><input type="submit" value="LOGIN"><td>
                </tr>
                <tr>
                    <td>${message}</td>
                </tr>
            </table>
                        <input type="submit" value="LOGIN" >
        </form>
                -->
       <div class="login-container">
		<h1 class="title">LOGIN FPT</h1>
                <form action="login" method="post">
			<div class="input-container">
				<label for="username">Username</label>
                                <input type="text" id="account" name="account">${AccEr}
			</div>
			<div class="input-container">
				<label for="password">Password</label>
                                <input type="password" id="password" name="password">${PassEr}
			</div>
			<button type="submit" class="button">LOGIN</button>
                        <br>
                        ${message}
		</form>
                <a href="forgotPassword.jsp">Forgot password</a>
	</div>
    </body>
</html>
