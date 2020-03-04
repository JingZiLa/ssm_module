<%--
  Created by IntelliJ IDEA.
  User: JING
  Date: 2020/2/28
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>查询所有账户信息成功</h1>
    ${list}
<c:forEach items="list">
    ${account.id}
    ${account.name}
    ${account.money}
</c:forEach>
</body>
</html>
