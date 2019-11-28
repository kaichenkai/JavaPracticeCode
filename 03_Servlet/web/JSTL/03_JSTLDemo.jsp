<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>forEach 语句</title>
</head>
<body>
    <%--for 循环--%>
    <c:forEach begin="0" end="10" var="i" step="2" varStatus="s">
        ${i} ${s.index} ${s.count}
        <br>
    </c:forEach>
    <br>

    <%
        List list = new ArrayList<String>();
        list.add("johny");
        list.add("anson");
        list.add("skier");
        request.setAttribute("list", list);
    %>
    <%--遍历 List 集合--%>
    <c:forEach items="${list}" var="name" varStatus="s">
        ${name} ${s.index} ${s.count}
        <br>
    </c:forEach>
</body>
</html>
