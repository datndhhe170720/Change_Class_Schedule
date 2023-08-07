<%-- 
    Document   : AdminUpdateSchedule
    Created on : Mar 17, 2023, 3:47:57 AM
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
                <h1>REQUEST FOR CHANGING SCHEDULE</h1>
        <form action="teacherschedule" method="get">
            <table>
                 <tr>
                    <td>ID</td>
                    <td><input type="text" name="stt" value="${s.getStt()}"></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><select name="status">
                            <option value="PENDING">PENDING</option>
                            <option value="ACCEPT">ACCEPT</option>
                            <option value="DENY">DENY</option>
                        </select></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Update" name="Update"><td>
                </tr>
               
            </table>
        </form>
    </body>
</html>
