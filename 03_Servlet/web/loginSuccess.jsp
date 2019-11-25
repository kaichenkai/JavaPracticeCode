<%--
  Created by IntelliJ IDEA.
  User: chenkai
  Date: 2019-11-18
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <%-- 从 cookie 中拿到登录用户的 username --%>
      <%
          String username = "";
          Cookie[] cookies = request.getCookies();
          for (Cookie cookie : cookies) {
              if ("username".equals(cookie.getName())){
                  username = cookie.getValue();
                  break;
              }
          }
      %>

      <%= "<h3>欢迎您, " + username + "</h3>"%>
  </body>
</html>
