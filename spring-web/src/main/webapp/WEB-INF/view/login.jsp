<%--
  Created by IntelliJ IDEA.
  User: xiaox
  Date: 2020/2/23
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2>登录</h2>
<span style="color: red">${loginError}</span>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="usrnm"><br>
    密码：<input type="password" name="pwd"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
