<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/21
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>美汇园食品有限公司 考勤管理系统</title>
</head>
<body>
请先登录
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="username" id="usename" /><br/>
    密码：<input type="password" name="password" id="password" /><br/>
    <input  type="submit" value="登录" /><input type="reset" value="重置" />
</form>
</body>
</html>
