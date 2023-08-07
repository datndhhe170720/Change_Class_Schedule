<%-- 
    Document   : TeacherMenu
    Created on : Mar 15, 2023, 8:59:02 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
		body {
			background-color: #f2f2f2;
		}

		h1 {
			text-align: center;
			margin-top: 50px;
			font-size: 36px;
			color: #333;
		}

		.menu {
			display: flex;
			flex-wrap: wrap;
			justify-content: center;
			margin-top: 50px;
		}

		.menu-item {
			margin: 10px;
			position: relative;
			overflow: hidden;
			width: 200px;
			height: 150px;
			border-radius: 10px;
			box-shadow: 0 3px 6px rgba(0, 0, 0, 0.16);
			background-color: #ff7f50;
			transition: all 0.3s ease-in-out;
		}

		.menu-item:hover {
			transform: scale(1.05);
			box-shadow: 0 5px 10px rgba(0, 0, 0, 0.16);
		}

		.menu-item a {
			display: block;
			text-align: center;
			font-size: 24px;
			font-weight: bold;
			color: #fff;
			line-height: 150px;
			text-decoration: none;
			transition: all 0.3s ease-in-out;
			z-index: 1;
			position: relative;
		}

		.menu-item:hover a {
			color: #333;
		}

		.menu-item:before {
			content: "";
			position: absolute;
			top: -50%;
			left: -50%;
			width: 200%;
			height: 200%;
			background-color: rgba(255, 255, 255, 0.4);
			transform: rotate(45deg);
			transition: all 0.3s ease-in-out;
			z-index: -1;
		}

		.menu-item:hover:before {
			top: -10%;
			left: -10%;
			width: 120%;
			height: 120%;
			background-color: rgba(255, 255, 255, 0);
		}
        </style>

    </head>
    <body>
        <h1>ADMIN MENU</h1>
	<div class="menu">
		<div class="menu-item">
			<a href="admin">EDIT CLASS</a>
		</div>
<!--		<div class="menu-item">
			<a href="#">TEACHER LIST</a>
		</div>-->
		<div class="menu-item">
			<a href="request">REQUEST</a>
		</div>
		<div class="menu-item">
			<a href="login">LOG OUT</a>
		</div>
	</div>
    </body>
    
</html>
