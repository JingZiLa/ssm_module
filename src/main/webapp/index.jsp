<%--
  Created by IntelliJ IDEA.
  User: JING
  Date: 2020/2/28
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试SSM整合结果</a>
    <h3>测试SSM整合保存数据结果</h3>
    <form action="account/saveAccount" method="post">
        账户姓名:<input type="text" name="name">
        金额：<input type="text" name="money">
        <input type="submit" value="保存">
    </form>
</body>
</html>
