<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h2>Show Product</h2>
${product.name}
<%--直接获取 struts Session 中的值--%>
<h2>从Session中获取产品的名称</h2>
${productName}
</body>
</html>