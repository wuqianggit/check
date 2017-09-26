<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>美汇园食品有限公司 考勤管理系统</title>
    <%@include file="/easyUILib.jsp"%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/myBody.css">
    <script>
        function submitForm(){//登录
            var url="${pageContext.request.contextPath}/login";
            $('#loginForm').form('submit', {
                url:url,
                success: function(msg){
                    var msg = eval('(' + msg + ')');  // change the JSON string to javascript object
                    if (msg.success){
                        window.location=url+"/"+msg.description;
                    }else {
                        $.messager.alert("登录失败！",msg.description);
                    }
                }
            });
        }
    </script>
</head>
<body style="height:100%;width:100%;overflow:hidden;border:none;visibility:visible;">
<div class="center-in-center">

<div style="margin:20px 0;text-align: center">
    <h2>考勤管理系统登录</h2>
</div>
<div class="easyui-panel" title="登录" style="width:100%;max-width:400px;padding:30px 60px;">
    <form id="loginForm" method="post">
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="username" id="username" style="width:100%" data-options="label:'账户:',required:true">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-passwordbox" name="password" id="password" prompt="密码" style="width:100%" data-options="label:'密码:',required:true">
        </div>
    </form>
    <div style="text-align:center;padding:5px 0">
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">登录</a>
    </div>
</div>
</div>
</body>
</html>
