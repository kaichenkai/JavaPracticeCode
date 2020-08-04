<%--
  Created by IntelliJ IDEA.
  User: chenkai
  Date: 8/3/2020
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加产品</title>
</head>
<body>
<form action="/product/add" method="post">
    <lebel>产品名称: <input type="text" name="name" value=""></lebel><br/>
    <lebel>产品价格: <input type="text" name="price" value=""></lebel><br/>
    <input type="submit" value="添加商品">
</form>

</body>
</html>
