<%--
  Created by IntelliJ IDEA.
  User: junga
  Date: 2020-07-28
  Time: 오전 2:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>add User</title>
</head>
<body>
    <form action="addUser" method="post">
        <table border="0">
            <tr>
                <td>ID</td>
                <td><input type="text" name="username" /> </td>
            </tr>
            <tr>
                <td>password</td>
                <td><input type="password" name="password" /></td>
            </tr>
        </table>
        <input type="submit" value="ok" />
    </form>
</body>
</html>
