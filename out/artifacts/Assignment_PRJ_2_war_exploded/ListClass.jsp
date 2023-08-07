<%-- 
    Document   : ListClass
    Created on : Mar 15, 2023, 11:39:29 PM
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>

            h1 {
                margin-top: 30px;
                text-align: center;
                color: #ffa07a; /* màu cam nhẹ */
            }
            .container {
                max-width: 800px;
                margin: 0 auto;
            }

            .table {
                border-collapse: collapse;
                width: 100%;
                background-color: #fff;
                border-radius: 10px;
                overflow: hidden;
                box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            }

            thead {
                background-color: #FFA07A;
                color: white;
            }

            th, td {
                text-align: center;
                padding: 12px 15px;
                font-size: 14px;
            }

            tr:nth-child(even) {
                background-color: #FEDCD2;
            }

            .btn {
                background-color: #FFA07A;
                color: white;
                border: none;
                padding: 10px 20px;
                border-radius: 5px;
                cursor: pointer;
                transition: all 0.3s ease;
                font-size: 14px;
                margin-right: 10px;
            }

            .btn:hover {
                background-color: #FF8C61;
            }

            .btn-primary {
                background-color: #FFA07A;
            }

            .btn-primary:hover {
                background-color: #FF8C61;
            }

            .btn-secondary {
                background-color: #FEDCD2;
                color: #808080;
                cursor: not-allowed;
            }

            .btn-secondary:hover {
                background-color: #FEDCD2;
            }

            a {
                text-decoration: none;
                cursor: pointer;
            }

        </style>
    </head>
    <body>
        <!--        <h1>CLASS LIST MENU</h1>
                        <table border="1" class="fixed_headers">
                            <thead>
                                <tr>
                                    <td>Class Name</td>
                                    <td>Total Student</td>
                                    
                                </tr>
                            </thead>
                            <tbody>
        <c:forEach items='${data}' var="item">
            <tr>
                <td><a href="student?id=${item.getClassid()}&mod=1">${item.getClassid()}</a></td>
                <td>${item.getStudent()}</td>
                <td><a href="detail?id=${item.getClassid()}&mod=1">Update</a></td>
                <td><a href="class?id=${item.getClassid()}&mod=1">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>

</table>
<a href="AddClass.jsp">Add New Class</a>-->


        <div class="container">
            <h1>CLASS LIST MENU</h1>
            <table class="table">
                <thead>
                    <tr>
                        <th>Class Name</th>
                        <th>Total Student</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                <tbody>
                    <c:forEach items='${data}' var="item">
                        <tr>
                            <td><a href="student?id=${item.getClassid()}&mod=1">${item.getClassid()}</a></td>
                            <td>${item.getStudent()}</td>
                            <td><a href="detail?id=${item.getClassid()}&mod=1" class="btn btn-primary">Update</a></td>
                            <td><a href="class?id=${item.getClassid()}&mod=1" class="btn btn-primary">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <br><a href="AddClass.jsp" class="btn btn-primary">Add New Class</a>
        </div>
    </body>
</html>
