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
      <%--如果 username 存在, 那么显示欢迎, 否则提示用户重新登录 (cookie过期)--%>
      <%= username != "" ? "<h3>欢迎您, " + username + "</h3>":
              "cookie 已过期, 请重新登录: localhost:8080/login.jsp"%>
  </body>
</html>
