<%--
  Created by IntelliJ IDEA.
  User: chenkai
  Date: 12/31/2019
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Spring MVC 传参方式</title>
</head>
<body>
    <form action="/param" role="form", method="post">
        <input type="text" name="username"  autocomplete="off" placeholder="请输入用户名">
        <input type="password" name="passwd"  placeholder="请输入密码">
        <input type="submit" value="commit">
    </form>
</body>
</html>
