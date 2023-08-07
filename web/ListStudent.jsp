<%-- 
    Document   : ListStudent
    Created on : Mar 15, 2023, 11:05:19 PM
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

        </style>
    </head>
    <body>



        <div class="container">
            <h1>STUDENT LIST MENU</h1>
            <table class="table">
                <thead>
                    <tr>
                        <td>StudentID</td>
                        <td>ClassID</td>
                        <td>Password</td>
                        <td>Full Name</td>
                        <td>Gender</td>
                        <td>Address</td>
                        <td>Date Of Birth</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items='${data}' var="item">
                        <tr>
                            <td><a href="login?id=${item.getAccount()}&mod=1">${item.getAccount()}</a></td>
                            <td>${item.getClassid()}</td>
                            <td>${item.getPassword()}</td>
                            <td>${item.getName()}</td>
                            <td>${item.getGender()}</td>
                            <td>${item.getAddress()}</td>
                            <td>${item.getDob()}</td>
                            <td><a href="login?id=${item.getAccount()}&mod=1">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="AddProduct.jsp">Add New Student</a>
        </div>


        <!--        
                
                        <table border="1" class="fixed_headers">
                            <thead>
                                <tr>
                                    <td>StudentID</td>
                                    <td>ClassID</td>
                                    <td>Password</td>
                                    <td>Full Name</td>
                                    <td>Gender</td>
                                    <td>Address</td>
                                    <td>Date Of Birth</td>
                                </tr>
                            </thead>
        <c:forEach items='${data}' var="item">
              <tr>
                  <td><a href="login?id=${item.getAccount()}&mod=1">${item.getAccount()}</a></td>
                  <td>${item.getClassid()}</td>
                  <td>${item.getPassword()}</td>
                  <td>${item.getName()}</td>
                  <td>${item.getGender()}</td>
                  <td>${item.getAddress()}</td>
                  <td>${item.getDob()}</td>
                  <td><a href="login?id=${item.getAccount()}&mod=1">Delete</a></td>
              </tr>
        </c:forEach>
      

</table>-->
    </body>
</html>
