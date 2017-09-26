<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/26
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看员工信息</title>
    <%@include file="/easyUILib.jsp"%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/myBody.css">

</head>
<body>
<table id="dg" title="员工信息" class="easyui-datagrid" style="width: 100%;height: 100%;"
       url="${pageContext.request.contextPath}/employee/listEmployee" toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="true">
    <thead>
    <tr>
        <th field="employeeName" width="50">员工姓名</th>
        <th field="sex" width="50">性别</th>
        <th field="phoneNum" width="50">电话号码</th>
        <th field="address" width="50">家庭住址</th>
    </tr>
    </thead>
</table>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
</div>
</body>
</html>
