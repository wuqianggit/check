<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <!-- 使用easyUI的库-->
    <%@include file="/easyUILib.jsp" %>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/myBody.css">
    <script>
        //注销
        function logOff() {
            $.messager.confirm('确认', '确定要注销吗?', function (btn) {
                if (btn) {
                    var url = "${pageContext.request.contextPath}/";
                    window.location = url;
                }
            });
        }
        //增加员工的按钮
        function addEmployee() {
            var title="添加员工信息";
            if ($('#content').tabs('exists', title)){
                $('#content').tabs('select', title);
            } else {
                var content = '<iframe scrolling="auto" frameborder="0"  src="${pageContext.request.contextPath}/employee/toAddEmployeeView" style="width:100%;height:100%;"></iframe>';
                $('#content').tabs('add',{
                    title:title,
                    content:content,
                    closable:true
                });
            }
        }
        //查看员工信息
        function listEmployee(){
            var title="查看员工信息";
            if ($('#content').tabs('exists', title)){
                $('#content').tabs('select', title);
            } else {
                var content = '<iframe scrolling="auto" frameborder="0"  src="${pageContext.request.contextPath}/employee/toListEmployeeView" style="width:100%;height:100%;"></iframe>';
                $('#content').tabs('add',{
                    title:title,
                    content:content,
                    closable:true
                });
            }
        }
    </script>
</head>

<body class="easyui-layout">
<div data-options="region:'north',border:false" style="height:60px;background:#B3DFDA;padding:10px">
    <div style="text-align: center">考勤管理系统</div>
    <div style="text-align: right">
        欢迎:${admin.username}
        <button onclick="logOff()" value="注销">注销</button>
    </div>
</div>
<div data-options="region:'west',split:true,title:'管理菜单'" style="width:200px;padding:10px;">
    <ul id="tt" class="easyui-tree">
        <li state="open">
            <span>员工管理</span>
            <ul>
                <li>
                    <a href="#" onclick="addEmployee()">新增员工信息</a>
                </li>
                <li>
                    <a href="#" onclick="listEmployee()">查看员工信息</a>
                </li>
            </ul>
        </li>
        <li>
            <span>考勤管理</span>
            <ul>
                <li><span>当日考勤</span></li>
                <li><span>本周考勤</span></li>
            </ul>
        </li>
    </ul>
</div>
<div data-options="region:'east',split:true,collapsed:true,title:'系统设置'" style="width:100px;padding:10px;">

</div>
<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">
    <div style="text-align: center"> 版权归 吴强所有</div>
</div>

<div data-options="region:'center'">
    <div id="content" class="easyui-tabs" style="height: 100%;width: 100%;">
        <div title="首页" data-options="closable:true" style="overflow: auto;padding:20px;height: 100%;width: 100%;text-align: center;" fit="true">
            欢迎使用 考勤管理系统 v1.0<br/>
            致力于 无纸化考勤
        </div>
    </div>
</div>
</body>
</html>
