<%-- 
    Document   : AddClass
    Created on : Mar 16, 2023, 1:20:16 PM
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
        background-color: #f5f5f5;
        font-family: Arial, sans-serif;
        color: #333;
      }

      h1 {
        margin-top: 30px;
        text-align: center;
        color: #ffa07a; /* màu cam nhẹ */
      }

      form {
        width: 500px;
        margin: 0 auto;
        border: 2px solid #ffa07a; /* màu cam nhẹ */
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
      }

      table {
        width: 100%;
      }

      td {
        padding: 10px;
        text-align: left;
      }

      input[type="text"],
      input[type="submit"] {
        padding: 8px;
        font-size: 16px;
        border: none;
        border-radius: 5px;
        width: 100%;
        margin-bottom: 15px;
        background-color: #fff;
        color: #555;
        box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.1);
      }

      input[type="submit"] {
        background-color: #ffa07a; /* màu cam nhẹ */
        color: #fff;
        cursor: pointer;
        transition: background-color 0.3s;
      }

      input[type="submit"]:hover {
        background-color: #ff7f50; /* màu cam đậm */
      }
    </style>
    </head>
    <body>
        <h1>ADD CLASS</h1>
        <form action="class" method="post">
            <table>
                <tr>
                    <td>ClassID:</td>
                    <td><input type="text" name="classid" value="${c.getClassid()}"></td>
                </tr>
                <tr>
                    <td>Total Student:</td>
                    <td><input type="text" name="student" value="${c.getStudent()}"></td>
                </tr>
                <tr>
                    <td><br><input type="submit" value="Add" name="Add"><td>
                </tr>
            </table>


        </form>
    </body>
</html>
