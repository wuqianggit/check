<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加员工信息</title>
    <%@include file="/easyUILib.jsp"%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/myBody.css">
    <script>
        //提交表单
        function submitForm(){
            var url="${pageContext.request.contextPath}/employee/addEmployee";
            $('#addEmployeeForm').form('submit', {
                url:url,
                success:function(data){
                    var data = eval('(' + data + ')');  // change the JSON string to javascript object
                    if(data.success){
                        $.messager.alert("添加成功！","添加员工信息成功！");
                        $("#addEmployeeForm").form('reset'); //成功之后，清空选项
                    }else{
                        $.messager.alert("添加失败！",data.description);
                    }
                }
            });
        }
        //重置表单信息
        function resetForm(){
            $.messager.confirm('确认', '确定要重新填写员工信息吗?', function (btn) {
                if (btn) {
                    $("#addEmployeeForm").form('reset');
                }
            });
        }
    </script>
</head>
<body>

<div class="center-in-center">
    <div style="margin:20px 0;text-align: center">
        <h2>添加员工信息</h2>
    </div>
    <div class="easyui-panel" title="员工信息" style="width:100%;max-width:400px;padding:30px 60px;">
        <form id="addEmployeeForm" method="post">
            <div style="margin-bottom:20px">
                <input class="easyui-textbox" name="employeeName" id="employeeName" style="width:100%" data-options="label:'姓名:',required:true">
            </div>
            <div style="margin-bottom:20px">
                <select class="easyui-combobox" name="sex" style="width:200px;height: auto;" data-options="label:'性别:'">
                    <option value="MAN">男</option>
                    <option value="WOMAN">女</option>
                </select>
            </div>
            <div style="margin-bottom:20px">
                <input class="easyui-textbox" name="phoneNum" style="width:100%" data-options="label:'电话号码:'">
            </div>
            <div style="margin-bottom:20px">
                <input class="easyui-textbox" name="address" style="width:100%;height: auto" data-options="label:'家庭住址:'">
            </div>
        </form>
        <div style="text-align:center;padding:5px 0">
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">添加</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="resetForm()" style="width:80px">重置</a>
        </div>
    </div>
</div>
</body>
</html>
