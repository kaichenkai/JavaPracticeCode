<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head> <%-- 引入JQ和Bootstrap --%>
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <script src="../../js/bootstrap.min.js"></script>
    <link href="../../css/style.css" rel="stylesheet">
    <title>学生管理页面 - 首页</title>
    <script> $(function () {
        $("ul.pagination li.disabled a").click(function () {
            return false;
        });
    }); </script>
</head>
<body>
<div class="listDIV">
    <table class="table table-striped table-bordered table-hover table-condensed">
        <caption>学生列表 - 共${page.total}人</caption>
        <thead>
        <tr class="success">
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>出生日期</th>
            <th>地址</th>
            <th>QQ</th>
            <th>email</th>
            <th>编辑</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody><c:forEach items="${students}" var="s" varStatus="status">
            <tr>
                <td>${s.studentId}</td>
                <td>${s.name}</td>
                <td>${s.gender}</td>
                <td>${s.birthday}</td>
                <td>${s.address}</td>
                <td>${s.qq}</td>
                <td>${s.email}</td>
                <td><a href="/editStudent?id=${s.id}"><span class="glyphicon glyphicon-edit"></span> </a></td>
                <td><a href="/delStudent?id=${s.id}"><span class="glyphicon glyphicon-trash"></span> </a></td>
            </tr>
        </c:forEach></tbody>
    </table>
</div>
<nav class="pageDIV">
    <ul class="pagination">
        <li <c:if test="${!page.hasPreviouse}">class="disabled"</c:if>><a href="?page.start=0"> <span>«</span> </a></li>
        <li <c:if test="${!page.hasPreviouse}">class="disabled"</c:if>><a href="?page.start=${page.start-page.count}">
            <span>‹</span> </a></li>
        <c:forEach begin="0" end="${page.totalPage-1}" varStatus="status"> <c:if
                test="${status.count*page.count-page.start<=30 && status.count*page.count-page.start>=-10}">
            <li <c:if test="${status.index*page.count==page.start}">class="disabled"</c:if>><a
                    href="?page.start=${status.index*page.count}"
                    <c:if test="${status.index*page.count==page.start}">class="current"</c:if> >${status.count}</a></li>
        </c:if> </c:forEach>
        <li <c:if test="${!page.hasNext}">class="disabled"</c:if>><a href="?page.start=${page.start+page.count}"> <span>›</span>
        </a></li>
        <li <c:if test="${!page.hasNext}">class="disabled"</c:if>><a href="?page.start=${page.last}"> <span>»</span>
        </a></li>
    </ul>
</nav>
<div class="addDIV">
    <div class="panel panel-success">
        <div class="panel-heading"><h3 class="panel-title">增加学生</h3></div>
        <div class="panel-body">
            <form method="post" action="/addStudent" role="form">
                <table class="addTable">
                    <tr>
                        <td>学号：</td>
                        <td><input type="text" name="studentId" id="studentId" placeholder="请在这里输入学号"></td>
                    </tr>
                    <tr>
                        <td>姓名：</td>
                        <td><input type="text" name="name" id="name" placeholder="请在这里输入名字"></td>
                    </tr>
                    <tr>
                        <td>性别：</td>
                        <td><input type="radio" class="radio radio-inline" name="sex" value="男"> 男 <input type="radio"
                                                                                                          class="radio radio-inline"
                                                                                                          name="sex"
                                                                                                          value="女"> 女
                        </td>
                    </tr>
                    <tr>
                        <td>出生日期：</td>
                        <td><input type="date" name="birthday" id="birthday" placeholder="请在这里输入出生日期"></td>
                    </tr>
                    <tr>
                        <td>地址：</td>
                        <td><input type="text" name="address" id="address" placeholder="请在这里输入地址"></td>
                    </tr>
                    <tr>
                        <td>QQ：</td>
                        <td><input type="text" name="qq" id="qq" placeholder="请在这里输入QQ"></td>
                    </tr>
                    <tr>
                        <td>email：</td>
                        <td><input type="text" name="email" id="email" placeholder="请在这里输入email"></td>
                    </tr>

                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>