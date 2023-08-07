<%-- 
    Document   : Schedule
    Created on : Mar 16, 2023, 3:46:51 AM
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




        <div class="container">
            <h1>SCHEDULE: ${u.getId()}</h1>
            <ul>
                <li>Slot 1: 7h30-9h50</li>
                <li>Slot 2: 10h-12h20</li>
                <li>Slot 3: 12h50-3h10</li>
                <li>Slot 4: 3h20-5h40</li>
            </ul>
            <table class="table">
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>SubjectCode</td>
                        <td>Class</td>
                        <td>Slot</td>
                        <td>Date</td>
                        <td>Status</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items='${data}' var="item">
                        <tr>
                            <td><a href="login?id=${item.getStt()}&mod=1">${item.getStt()}</a></td>
                            <td>${item.getSubject()}</td>
                            <td>${item.getClassid()}</td>
                            <td>${item.getSlot()}</td>
                            <td>${item.getDate()}</td>
                            <td>${item.getStatus()}</td>
                            <td><a href="detail?id=${item.getStt()}&mod=2" class="btn btn-primary">Change</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <br><a href="AddSchedule.jsp" class="btn btn-primary">Add New Schedule</a>
            <!--<a href="detail?id=${u.getId()}&mod=4">Back To Menu</a>-->
        </div>





        <!--                <table border="1" class="fixed_headers">
                            <thead>
                                <tr>
                                    <td>ID</td>
                                    <td>SubjectCode</td>
                                    <td>TeacherID</td>
                                    <td>TeacherName</td>
                                    <td>Class</td>
                                    <td>Slot</td>
                                    <td>Date</td>
                                    <td>Status</td>
                                </tr>
                            </thead>
                            <tbody>
        <c:forEach items='${data}' var="item">
            <tr>
                <td><a href="login?id=${item.getStt()}&mod=1">${item.getStt()}</a></td>
                <td>${item.getSubject()}</td>
                <td>${item.getId()}</td>
                <td>${item.getName()}</td>
                <td>${item.getClassid()}</td>
                <td>${item.getSlot()}</td>
                <td>${item.getDate()}</td>
                <td>${item.getStatus()}</td>
                <td><a href="detail?id=${item.getStt()}&mod=2">Change</a></td>
            </tr>
        </c:forEach>
    </tbody>

</table>-->
        <!--<a href="AddProduct.jsp">Add New Schedule</a>-->
    </body>
</html>
