<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if else 判断语句</title>
</head>
<body>
    <%
        request.setAttribute("a", 1);
    %>
    <c:if test="true">
        is ture
    </c:if>

    <br>

    <c:if test="${a  == 1}">
        is 1
    </c:if>

    <c:if test="${not empty list}">
        遍历集合...
    </c:if>
</body>
</html>
