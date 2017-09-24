<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>美汇园食品有限公司 考勤管理系统</title>
    <%@include file="/easyUILib.jsp"%>
    <script>
        //登陆前校验
        function beforeSubmit(){
            var username=$("#username").val().trim();
            var password=$("#password").val().trim();
            if(username==""||password==""){
                $.messager.alert("提醒","用户名和密码都不能为空！");
                return false;
            }
            return true;
        }
        function submitForm(){//登录
            if(!beforeSubmit()){
                return false;
            }
            //表单提交
            var url="${pageContext.request.contextPath}/login";
            $.post(url,
                {username:$("#username").val().trim(),
                password:$("#password").val().trim()},
                function(msg){
                    if(msg.success){//登录成功
                        window.location=url+"/"+msg.description;
                    }else{//登录失败
                        $.messager.alert("登录失败！",msg.description);
                    }
                }
            );
        }

        $(function(){
            document.getElementById("username").value="";
        });
    </script>
</head>
<body style="height:100%;width:100%;overflow:hidden;border:none;visibility:visible;">
<div id="mainwindow" class="EasyUI-window" style="width:50%;height:50%;background:#fafafa;overflow:hidden"
     title="登录" border="false" resizable="false" draggable="true"
     minimizable="false" maximizable="false" closable="false">
    <div class="header" style="height:35px;">
        <div class="toptitle" style="margin-top: 25px; font-size:20px;margin-left: 60px;">
            美汇园食品有限公司 考勤管理系统
        </div>
        <div style="padding:60px 0;">
            <div  id="loginFormDiv"  style="padding-left:300px">
                <form id="loginForm" cellpadding="0" cellspacing="3" action="${pageContext.request.contextPath}/login"
                method="post">
                    <table cellpadding="8" cellspacing="3">
                        <tr>
                            <td>帐号:</td>
                            <td><input name="username" type="text" id="username" value=""></input></td>
                        </tr>
                        <tr>
                            <td>密码:</td>
                            <td><input name="password" type="password" id="password" value=""></input></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <input type="button" value="登录" id="submitBtn" onclick="submitForm()" style="width: 100%;"></input>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
