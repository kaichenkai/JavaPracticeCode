<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserLogin</title>
    <style>
        span {
            color: red;
        }
    </style>
</head>
<body>

    <span><%= request.getAttribute("loginFailed") == null ? "": request.getAttribute("loginFailed")%></span>
    <span><%= request.getAttribute("imageCodeError") == null ? "":request.getAttribute("imageCodeError") %></span>
    <form action="/login2" method="post">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="username"></td>
            </tr>
                        <tr>
                <td>密码:</td>
                <td><input type="password" name="passwd"></td>
            </tr>
            <tr>
                <td>请输入验证码:</td>
                <td><input type="text" name="imageCode"></td>
            </tr>
            <tr>
                <td><img id="imageCode" src="/image/code2" alt=""></td>
                <td><a id="changeImageCode" href="">看不清, 换一张?</a></td>
            </tr>
            <tr>
                <td><input type="submit" value="login"></td>
            </tr>
        </table>
    </form>
    <script>
        // 给 a 标签绑定事件
        var a = document.getElementById("changeImageCode");
        var img = document.getElementById("changeImageCode");
        // 绑定点击事件
        a.onclick = function(){
            // 加时间戳
            var snapshotTime = new Date().getTime();
            // img.src = "/image/code"  // 避免浏览器使用缓存
            img.src = "/image/code2?"+ snapshotTime
        }
    </script>
</body>
</html>