<%-- 
    Document   : UpdateSchedule
    Created on : Mar 16, 2023, 10:27:15 PM
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
        <h1>CHANGE SCHEDULE</h1>
        <form action="teacherschedule" method="post">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="stt" value="${s.getStt()}"></td>
                </tr>
                <tr>
                    <td>Subject Code</td>
                    <td><input type="text" name="subject" value="${s.getSubject()}"></td>
                </tr>
                <tr>
                    <td>Teacher ID:</td>
                    <td><input type="text" name="id" value="${s.getId()}"></td>
                </tr>
                <!--                <tr>
                                    <td>Teacher Name:</td>
                                    <td><input type="text" name="name" value="${s.getName()}"></td>
                                </tr>
                                <tr>-->
                <td>Class ID:</td>
                <td><input type="text" name="classid" value="${s.getClassid()}"></td>
                </tr>

                <td>Slot:</td>
<!--                    <td><input type="text" name="slot" value="${s.getSlot()}"></td>-->
                <!--                    <td><select name="slot">
                                            <option value="0" selected="${s.getSlot()}">${s.getSlot()}</option>
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3" disabled>3</option>
                                            <option value="4">4</option>
                                        </select></td>-->

                <td>
                    <select name="slot">
                        <option value="${s.getSlot()}" selected="">${s.getSlot()}</option>
                        <option value="1" ${s.getSlot() != "1" ? "" : "disabled"}>1</option>
                        <option value="2" ${s.getSlot() != "2" ? "" : "disabled"}>2</option>
                        <option value="3" ${s.getSlot() != "3" ? "" : "disabled"}>3</option>
                        <option value="4" ${s.getSlot() != "4" ? "" : "disabled"}>4</option>
                    </select>
                </td>


                <tr>
                    <td>Date:</td>
                    <td><input type="date" name="date" value="${s.getDate()}"></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><input type="text" name="status" value="PENDING"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Update" name="Update"><td>
                </tr>
                <tr>
                    <td>${Err}<td>
                </tr>
            </table>
        </form>   
    </body>
</html>
