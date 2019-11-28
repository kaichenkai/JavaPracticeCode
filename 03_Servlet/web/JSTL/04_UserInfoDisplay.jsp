<%@ page import="com.web.User" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息展示</title>
</head>
<body>
    <%
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        User user1 = new User(1, "johny", dateFormat1.parse("2007-06-01"));
        User user2 = new User(2, "anson", dateFormat1.parse("2008-06-01"));
        User user3 = new User(3, "skier", dateFormat1.parse("2009-06-01"));
        List list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        // 设置到 request 对象域中
        request.setAttribute("list", list);
    %>

    <table border="1", width="500" align="center">
        <tr>
            <th height="50" align="center">序号</th>
            <th>姓名</th>
            <th>生日</th>
        </tr>
        <c:forEach items="${requestScope.list}" var="user" varStatus="s">
            <tr>
                <td height="50" align="center">${user.id}</td>
                <td align="center">${user.username}</td>
                <td align="center">${user.birthday}</td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
