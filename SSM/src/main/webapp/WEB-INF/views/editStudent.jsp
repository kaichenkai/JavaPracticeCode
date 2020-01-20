<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head> <%-- 引入JQ和Bootstrap --%>
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <script src="../../js/bootstrap.min.js"></script>
    <link href="../../css/style.css" rel="stylesheet">
    <title>学生管理页面 - 编辑页面</title></head>
<body>
<div class="editDIV">
    <div class="panel panel-success">
        <div class="panel-heading"><h3 class="panel-title">编辑学生</h3></div>
        <div class="panel-body">
            <form method="post" action="/updateStudent" role="form">
                <table class="editTable">
                    <tr>
                        <td>学号：</td>
                        <td><input type="text" name="studentId" id="studentId" value="${student.student_id}"
                                   placeholder="请在这里输入学号"></td>
                    </tr>
                    <tr>
                        <td>姓名：</td>
                        <td><input type="text" name="name" id="name" value="${student.name}" placeholder="请在这里输入名字">
                        </td>
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
                        <td><input type="date" name="birthday" id="birthday" value="${student.birthday}"
                                   placeholder="请在这里输入出生日期"></td>
                    </tr>
                    <tr>
                        <td>地址：</td>
                        <td><input type="text" name="address" id="address" value="${student.address}" placeholder="请在这里输入地址">
                        </td>
                    </tr>
                    <tr>
                        <td>QQ：</td>
                        <td><input type="text" name="qq" id="qq" value="${student.qq}" placeholder="请在这里输入QQ">
                        </td>
                    </tr>
                    <tr>
                        <td>email：</td>
                        <td><input type="text" name="email" id="email" value="${student.email}" placeholder="请在这里输入email">
                        </td>
                    </tr>

                    <tr class="submitTR">
                        <td colspan="2" align="center"><input type="hidden" name="id" value="${student.id}">
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
